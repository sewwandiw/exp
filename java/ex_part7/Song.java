package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/29/13
 * 11:50 AM
 */
import java.io.*;

public class Song implements Comparable<Song> {
    String title;
   String artist;
    String rating;
    String bpm;

    public Song(String t,String a , String r ,String b){
        title = t;
        artist =a ;
        rating = r;
        bpm = b;
    }

    public boolean equals(Object aSong){
        Song s =(Song) aSong;
        return getTitle().equals(s.getTitle());
    }
    public String getTitle(){
        return title;
    }
    public int hashCode(){
        return title.hashCode();
    }
    public String getArtist(){
        return artist;
    }
    public String getRating(){
        return rating;
    }
    public String getBpm(){
        return bpm;
    }
    public String toString(){
        String outPut = artist +" " + title;
        return outPut;
    }


    @Override
    public int compareTo(Song s) {
      return artist.compareTo(s.getArtist());

    }
}
