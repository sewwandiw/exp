package test5;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/24/13
 * 10:01 PM
 */
import javax.sound.midi.*;
public class MiniMusicPlayer {
    public static void main(String[] args) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track track = seq.createTrack();

            for (int i =0 ; i <61 ;i+=4){
               track.add(makeEvent(144,1,i,100,i));
               track.add(makeEvent(128,1,i,100,i+2));
            }
           player.setSequence(seq);
           player.setTempoInBPM(270);
           player.start();

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
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
