package test4;

import javax.sound.midi.*;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/23/13
 * 10:59 PM
 */

public class MidiTestCommandLine {
    public static void main(String[] args) {
        MidiTestCommandLine mini = new MidiTestCommandLine();
        if (args.length <2){
            System.out.println("Dnt forget the instrument and note");
        }
        else {
            int instrument =Integer.parseInt(args[0]);
            int note =Integer.parseInt(args[1]);
            mini.play(instrument, note);

        }

    }

    public void play(int ins ,int note){
        try {
            Sequencer seq = MidiSystem.getSequencer();
            seq.open();

            Sequence se = new Sequence(Sequence.PPQ,4);
            Track track = se.createTrack();

            MidiEvent event = null;

            ShortMessage a =new ShortMessage();
            a.setMessage(192,1,ins,0);
            MidiEvent changeins = new MidiEvent(a,1);

            ShortMessage b = new ShortMessage();
            b.setMessage(144,1,note,100);
            MidiEvent noteOn = new MidiEvent(b,1);
            track.add(noteOn);

            ShortMessage c = new ShortMessage();
            c.setMessage(128,1,note,100);
            MidiEvent noteOff = new MidiEvent(c,16);
            track.add(noteOff);

            seq.setSequence(se);
            seq.start();

            }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
