package test4;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/23/13
 * 3:18 PM
 */
import javax.sound.midi.*;
public class MiniMusic {
    public static void main(String[] args) {
        MiniMusic mini = new MiniMusic();
        mini.play();
    }

    public void play(){
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track track = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144,1,102,100);
            MidiEvent noteOn = new MidiEvent(a,1);
            track.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128,1,102,100);
            MidiEvent noteOff = new MidiEvent(b,3);
            track.add(noteOff);

            player.setSequence(seq);
            player.start();
        }
        catch (Exception ex){
            ex.printStackTrace();

        }
    }


}
