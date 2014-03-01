package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/30/13
 * 12:02 AM
 */

public class Enum {
    enum names{
        JERRY("Guitar") {public String sings(){
            return "plantive";}
                  } ,

        BOBBY("Rhythem Gutar"){public String sings(){
            return "horn";}
        },
        PHILL("bras");
        private String instrument;

        names(String instrument){
            this.instrument = instrument;
        }

        private String getInstrument(){
            return instrument;
        }

        public String sings(){
            return "Occasially";
        }

    }

    public static void main(String[] args) {
        for (names n :names.values()){
            System.out.print(n+" ");
            System.out.print("Instrument" +" " + n.getInstrument());
            System.out.println(" "+"sings:"+" "+n.sings());
        }
    }
}
