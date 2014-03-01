package test6;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.*;
import java.io.*;
/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/28/13
 * 12:08 PM
 */

public class DailyAdviceServer {

    String[] adviceList = {"Take small bites","Go for the tight jeans","one word:inappropiate" ,"Be honest","You might need a hair cut"};


    public static void main(String[] args) {
        DailyAdviceServer dailyAdviceServer = new DailyAdviceServer();
        dailyAdviceServer.go();
    }

    public void go(){
        try {
            ServerSocket serverSocket = new ServerSocket(4242);

            while (true){
                Socket socket = serverSocket.accept();
                PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                printWriter.println(advice);
                printWriter.close();
                System.out.println(advice);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

    private String getAdvice() {
        int random =(int) (Math.random()*adviceList.length);
        return adviceList[random];
    }
}
