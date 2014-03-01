package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/29/13
 * 11:26 AM
 */


import java.io.File;
import java.util.*;
import java.io.* ;


class JukeBox2 {
    ArrayList<Song> songList = new ArrayList<Song>();


    public static void main(String[] args) {
        new JukeBox2().go();
    }

   class ArtisticComparator implements Comparator<Song>{

       @Override
       public int compare(Song one, Song two) {
           return one.getTitle().compareTo(two.getArtist());
       }
   }
    private void go() {
        getSong();
        Collections.sort(songList);
        System.out.print(songList+"\n");
        ArtisticComparator art =new ArtisticComparator();
        Collections.sort(songList,art);
        System.out.println(songList+"\n");
        TreeSet<Song>  songSet =new TreeSet<Song>();
        songSet.addAll(songList);
        System.out.println(songSet+"\n");
    }

    public void   getSong() {
        try {
            File file = new File("E:\\JAVA\\test3\\src\\test6\\song.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line =null;
            while ((line = bufferedReader.readLine()) != null){
                addSong(line);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void addSong(String line) {
        String[] token = line.split("/");
        Song nextSong  = new Song(token[0],token[1],token[2],token[3]);

        songList.add(nextSong);
    }
}

