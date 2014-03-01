package test5;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/26/13
 * 5:26 PM
 */
import javax.swing.*;
import java.awt.*;
import javax.sound.midi.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.io.*;
public class BeatBox {
    JFrame frame;
    JPanel panel;
    ArrayList<JCheckBox> checkBoxes;
    Sequencer sequencer;
    Sequence sequence;
    Track track;
    boolean isSeleced;

    String[] instrumentName = {"Bass drum" ,"Closed_Hi cat","Open_Hi_cat","Acoustic snare","crash symbol","Hand clap","High Tom","Hi Bongo","Maracas","whistle","" +
            "Low conga","Cowbell","Vibraslap","Low-Mid Tom","High Agogo","Open Hi-Conga"};

    int [] instrument ={35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};


    public static void main(String[] args) {
        BeatBox beatBox =new BeatBox();
        beatBox.buildGui();
    }

    private void buildGui() {
        frame = new JFrame("Cyber Beat Box");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout newLayout = new BorderLayout();
        panel =new JPanel(newLayout);
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        checkBoxes = new ArrayList<JCheckBox>();
        Box buttonBox = new Box(BoxLayout.Y_AXIS);

        JButton start = new JButton("Start");
        start.addActionListener(new MyStartListner());
        buttonBox.add(start);

        JButton stop = new JButton("Stop");
        stop.addActionListener(new MyStopListner());
        buttonBox.add(stop);

        JButton uptempo = new JButton("Up Tempo");
        uptempo.addActionListener(new MyUpTempoListner());
        buttonBox.add(uptempo);

        JButton downTempo =new JButton("Down tempo");
        downTempo.addActionListener(new MyDownTempo());
        buttonBox.add(downTempo);

        JButton seri =new JButton("Serialize");
        seri.addActionListener(new MySendListner());
        buttonBox.add(seri);

        JButton restore =new JButton("Restore");
        restore.addActionListener(new MyReadListner());
        buttonBox.add(restore);


        Box boxname = new Box(BoxLayout.Y_AXIS);
        for (int i = 0 ; i <16 ;i++){
            boxname.add(new Label(instrumentName[i]));
        }
        frame.getContentPane().add(BorderLayout.WEST,boxname);
        frame.getContentPane().add(BorderLayout.EAST,buttonBox);

        GridLayout layout = new GridLayout(16,16);
        layout.setVgap(1);
        layout.setHgap(2);

        panel = new JPanel(layout);
        frame.getContentPane().add(BorderLayout.CENTER,panel);

        for (int i = 0; i < 256; i++) {
            JCheckBox c =new JCheckBox();
            c.setSelected(false);
            checkBoxes.add(c);
            panel.add(c);
        }

        setUpMidi();
        frame.setBounds(50,50,300,300);
        frame.pack();
        frame.setVisible(true);
    }

    private void setUpMidi() {
        try{
            sequencer = MidiSystem.getSequencer();
            sequencer.open();

            sequence = new Sequence(Sequence.PPQ,4);
            track = sequence.createTrack();
            sequencer.setSequence(sequence);
            sequencer.setTempoInBPM(120);
            sequencer.start();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }


    private class MyStartListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            buildTrackAndStart();
        }
    }

    private void buildTrackAndStart() {
        int[] trackList = null;

        sequence.deleteTrack(track);
        track = sequence.createTrack();

        for (int i = 0; i < 16; i++) {
            trackList = new int[16];
            int key = instrument[i];

            for (int j = 0; j < 16; j++) {
                JCheckBox jc  =(JCheckBox) checkBoxes.get(j+16*i);
                if (jc.isSelected()){
                    trackList[j] =key;
                }
                else{
                    trackList[j] =0;
                }
            }
            makeTrack(trackList);
            track.add(makeEvent(176,1,127,0,16));
        }
        track.add(makeEvent(192,9,1,0,15));
        try {
            sequencer.setSequence(sequence);
            sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
            sequencer.setTempoInBPM(120);
            sequencer.start();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private MidiEvent makeEvent(int cmd, int chan, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage a =new ShortMessage();
            a.setMessage(cmd,chan,one,two);
            event = new MidiEvent(a,tick);
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return event;
    }

    private void makeTrack(int[] trackList) {
        for (int i = 0; i < 16; i++) {
            int key = trackList[i];
            if (key != 0){
                track.add(makeEvent(144,9,key,100,i));
                track.add(makeEvent(128,9,key,100,i+1));
            }

        }
    }

    private class MyStopListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            sequencer.stop();
//            checkBoxes.(false);
        }
    }

    private class MyUpTempoListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            float tempoFact = sequencer.getTempoFactor();
            sequencer.setTempoFactor((float) (tempoFact*1.03));
        }
    }

    private class MyDownTempo implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            float tempoFact =sequencer.getTempoFactor();
            sequencer.setTempoFactor((float) (tempoFact*0.97));
        }
    }

    private class MySendListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Boolean[] checkbox =new Boolean[256];
            for (int i = 0; i < 256; i++) {
                JCheckBox check =(JCheckBox) checkBoxes.get(i);
                if (isSeleced)
                checkbox[i] =true;

            }
            try {
                FileOutputStream file = new FileOutputStream(new File("E:\\JAVA\\test3\\check_box.ser"));
                ObjectOutputStream ob = new ObjectOutputStream(file);
                ob.writeObject(checkbox);
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }


    }

    private class MyReadListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            boolean[] check =null;
            try {
                FileInputStream file =new FileInputStream(new File("E:\\JAVA\\test3\\check_box.ser"));
                ObjectInputStream ob =new ObjectInputStream(file);
                check =(boolean[]) ob.readObject();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
            for (int i = 0; i < 256; i++) {
                JCheckBox checkBox = (JCheckBox) checkBoxes.get(i);
                if (check[i]){
                    checkBox.setSelected(true);
                }
                else {
                    checkBox.setSelected(false);
                }

            }
            sequencer.stop();
            buildTrackAndStart();
        }
    }
}
