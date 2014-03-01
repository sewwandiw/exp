package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/28/13
 * 12:53 PM
 */
import java.net.*;
import java.io.*;
import java.util.*;
import java.lang.*;

public class ChatServer {

    ArrayList clientList;

    public static void main(String[] args) {
        ChatServer server =new ChatServer();
        server.go();
    }

    private void go() {
        clientList = new ArrayList();
        try {
            ServerSocket serverSocket = new ServerSocket(15000);
            while (true){
                Socket clientSocket = serverSocket.accept();
                PrintWriter printWriter = new PrintWriter(clientSocket.getOutputStream());
                clientList.add(printWriter);

                Thread t = new Thread(new ClientHandler(clientSocket));
                t.start();
                System.out.println("got a connection");
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }

    public class ClientHandler implements Runnable{
        BufferedReader reader;
        Socket socket;

        public  ClientHandler(Socket clientSocket){
            try {
                socket = clientSocket;
                InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
                reader = new BufferedReader(inputStreamReader);
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
        @Override
        public void run() {
            String message;
            try {
                while ( (message = reader.readLine()) != null){
                    System.out.println("read" +" " + message);
                    tellEveryOne(message);
                }
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

    private void tellEveryOne(String message) {
        Iterator iterator = clientList.iterator();
        while (iterator.hasNext()){
            try{
                PrintWriter writer = (PrintWriter) iterator.next();
                writer.println("message from server : " + message);
                writer.flush();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }
    }

}
