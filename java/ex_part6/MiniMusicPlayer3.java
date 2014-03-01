package test5;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/24/13
 * 10:47 PM
 */
import javax.sound.midi.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;


public class MiniMusicPlayer3 {
    static JFrame frame = new JFrame("My fist vedio");
    static MusicDrawPanel m1;

    public static void main(String[] args) {
        MiniMusicPlayer3 player3 = new MiniMusicPlayer3();
        player3.go() ;
    }

    public void go(){
        setUpGui();
        try {
            Sequencer player =  MidiSystem.getSequencer();
            player.open();
           // int [] EventsIWant ={127};
            player.addControllerEventListener(m1,new int[] {127});

            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track track = seq.createTrack();

            int r = 0;
            for (int i = 0  ; i<60 ;i+=4){
                r =(int)((Math.random()*50)+1);
                track.add(makeEvent(144,1,r,100,i));
                track.add(makeEvent(176,1,127,0,i));
                track.add(makeEvent(128,1,r,100,i+2));
            }

            player.setSequence(seq);
            player.setTempoInBPM(220);
            player.start();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public void setUpGui(){
        m1 =new MusicDrawPanel();
        frame.setContentPane(m1);
        frame.setBounds(30,30,300,300);
        frame.setVisible(true);

    }
    public static MidiEvent makeEvent(int cmd,int chan ,int one ,int two,int tick){
        MidiEvent event =null;
        try {
            ShortMessage a = new ShortMessage();
            a.setMessage(cmd,chan,one,two);
            event = new MidiEvent(a,tick);

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return event;
    }



}


