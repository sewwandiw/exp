package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/29/13
 * 3:56 PM
 */
import java.util.LinkedList;
import java.util.*;

public class SortMountains {

    ArrayList<Mountain> mtn = new ArrayList<Mountain>();

    public static void main(String[] args) {
       new SortMountains().go();
    }

    private void go() {
       mtn.add(new Mountain("Longs",14255));
       mtn.add(new Mountain("Elbert",14433));
       mtn.add(new Mountain("Maroon",14156));
       mtn.add(new Mountain("Carcel",14256));
       System.out.println("as entered: \n"+ mtn);

        NameCompare nameCompare = new NameCompare();
        Collections.sort(mtn,nameCompare);
        System.out.println("by name: \n"+ mtn);

        HightCompare hightComapre =new HightCompare();
        Collections.sort(mtn,hightComapre);
        System.out.println("by Hight: \n"+ mtn);
    }


    private class NameCompare implements Comparator<Mountain> {
        @Override
        public int compare(Mountain one, Mountain two) {
            return one.getName().compareTo(two.getName());

        }
    }

    private class HightCompare implements Comparator<Mountain>  {
        @Override
        public int compare(Mountain one, Mountain two) {
            return (two.getHeight()-one.getHeight()) ;
        }


    }
}

