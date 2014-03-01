package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/28/13
 * 12:29 PM
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.io.*;
 import java.lang.*;

public class ChatClientA {
    private JTextField outgoing;
    private PrintWriter writer;
    private Socket socket;
    private JFrame frame;
    private JButton button;
    private JTextArea incoming;
    private BufferedReader reader;


    public static void main(String[] args) {
        ChatClientA clientA = new ChatClientA();
        clientA.setUpGui();
        clientA.setUPnetWorking();
        Thread thread = new Thread(
                new IncomingReader(
                        clientA.getOutGoingMessage(),
                        clientA.getReader(),
                        clientA.getIncoming()));
        thread.start();
    }

    public JTextArea getIncoming(){
        return incoming;
    }
    public String getOutGoingMessage(){
        return outgoing.getText();
    }
    public BufferedReader getReader(){
        return reader;
    }

    private void setUpGui() {
        frame = new JFrame("Client Server Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Send");
        outgoing = new JTextField(20);
        JPanel panel = new JPanel();

        incoming = new JTextArea(15,20);
        incoming.setLineWrap(true);
        incoming.setEditable(false);
        incoming.setWrapStyleWord(true);

        JScrollPane pane = new JScrollPane(incoming);
        pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        panel.add(pane);
        panel.add(button);
        panel.add(outgoing);

        button.addActionListener(new SendButtonListner());

        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.setSize(500,500);
        frame.setVisible(true);
    }

    private void setUPnetWorking() {
        try {
            socket = new Socket("127.0.0.1",15000);
            writer = new PrintWriter(socket.getOutputStream());
            InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
            reader = new BufferedReader(inputStreamReader);
            System.out.println("Established connection");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }


    private class SendButtonListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                writer.println(outgoing.getText());
                writer.flush();
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
            outgoing.setText(" ");
            outgoing.requestFocus();

        }
    }

    private static class IncomingReader implements Runnable {
        String outGoingMessage;
        BufferedReader reader;
        JTextArea incoming;

        public  IncomingReader(String message, BufferedReader reader, JTextArea incoming) {
            this.outGoingMessage = message;
            this.reader  = reader;
            this.incoming = incoming;
        }
        @Override
        public void run() {
            String inComingMessage;
            try {
                while((inComingMessage = reader.readLine())!= null){
                    System.out.println("out going -> " + outGoingMessage);
                    System.out.println("in coming -> " + inComingMessage);
                    incoming.append(inComingMessage + "\n");
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
