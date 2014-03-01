package test4;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/23/13
 * 1:05 PM
 */

public class MidiTest {

    public void play(){
        try {
            Sequencer seq = MidiSystem.getSequencer();
            System.out.println("We got a seq");

        }
        catch (MidiUnavailableException ex){
            System.out.println("Excpetion" + ex);
        }

    }

    public static void main(String[] args) {
        MidiTest md = new MidiTest();
            md.play();

    }
}
