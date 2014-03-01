package test5;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/24/13
 * 10:18 PM
 */
import javax.sound.midi.*;
public class MiniMusicPlayer2 implements ControllerEventListener  {

    public static void main(String[] args) {
       MiniMusicPlayer2 player2 = new MiniMusicPlayer2();
        player2.go();
    }

    public void go(){
        try {
            Sequencer player =  MidiSystem.getSequencer();
            player.open();
            int [] EventsIWant ={127};
            player.addControllerEventListener(this,EventsIWant);

            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track track = seq.createTrack();

            for (int i = 0  ; i<60 ;i+=4){
              track.add(makeEvent(144,1,i,100,i));
                track.add(makeEvent(176,1,127,0,i));
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

    public void controlChange(ShortMessage event){
        System.out.println("la");
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
