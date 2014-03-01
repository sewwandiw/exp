package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/29/13
 * 11:26 AM
 */


import java.io.File;
import java.util.*;
import java.io.* ;


public class JukeBox {
    ArrayList<Song> songList = new ArrayList<Song>();


    public static void main(String[] args) {
        new JukeBox().go();
    }

    private void go() {
        getSong();
        Collections.sort(songList);
        System.out.print(songList);
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
