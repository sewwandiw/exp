package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/28/13
 * 11:49 AM
 */
import java.net.*;
import java.io.*;

public class DailyAdviceClient {

    public static void main(String[] args) {
        DailyAdviceClient dailyAdviceClient = new DailyAdviceClient();
        dailyAdviceClient.go();
    }

    private void go() {
        try {
            Socket socket = new Socket("127.0.0.1",4242);
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String advice = bufferedReader.readLine();
            System.out.println("Today's advice is"+ advice);
            bufferedReader.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}
