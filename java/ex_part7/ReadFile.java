package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/27/13
 * 8:41 PM
 */
import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file =new File("E:\\JAVA\\exp\\file.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = null;

            while ((line=reader.readLine()) != null){
            System.out.println(line);
        }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }


}
