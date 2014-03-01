package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/27/13
 * 8:58 PM
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class QuizCardPlayer {
    JFrame frame;
    JButton button ;
    JPanel panel;
    JTextArea display;
    JTextArea answer;

    ArrayList<QuizCard> cardList;
    int currentCardIndex;
    boolean isShowAnswer;
    QuizCard currentCard;

    public static void main(String[] args) {
        QuizCardPlayer quizCardPlayer = new QuizCardPlayer();
        quizCardPlayer.go();

    }

    private void go() {
        frame = new JFrame("My Card game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button =new JButton("Next Question");
        panel = new JPanel();
        Font bigfont =new Font("Times new Roman",Font.BOLD ,24);

        display =new JTextArea(20,10);
        display.setFont(bigfont);
        display.setLineWrap(true);
        display.setEditable(false);

        JScrollPane pane =new JScrollPane(display);
        pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(display);
        panel.add(pane);

        button.addActionListener(new NextCardListner());

        JMenuBar menuBar = new JMenuBar();
        JMenu menu =new JMenu("File");
        JMenuItem menuItem =new JMenuItem("Load card set");
        menuItem.addActionListener(new OpenCardListner());

        menu.add(menuItem);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER,pane);
        frame.setSize(500,500);
        frame.setVisible(true);

    }


    private class NextCardListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if ((isShowAnswer)){
                display.setText(currentCard.getAnswer());
                button.setText("next Question");
                isShowAnswer =false;
            }
            else{
               if (currentCardIndex <cardList.size()){
                   showNextCard();
               }
                else {
                   System.out.println("No ore cards");
                   button.setEnabled(false);
               }
            }
        }
    }



    private class OpenCardListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser =new JFileChooser();
            fileChooser.showOpenDialog(frame);
            loadfile(fileChooser.getSelectedFile());

        }
    }

    private void loadfile(File file) {
        cardList = new ArrayList<QuizCard>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line =" ";
                  while ((line = bufferedReader.readLine())!= null ){
                      makeCard(line);
                  }
            bufferedReader.close();
        }
        catch (Exception ex){
            System.out.println("No cards");
            ex.printStackTrace();
        }
        showNextCard();
    }

    private void makeCard(String line) {
       String[] result = line.split("/") ;
        QuizCard quizCard = new QuizCard(result[0],result[1]);
        cardList.add(quizCard);
        System.out.println("make a card");
    }

    private void showNextCard() {
        currentCard =cardList.get(currentCardIndex);
        currentCardIndex++;
        display.setText(currentCard.getQuestion());
        button.setText("Show answer");
        isShowAnswer =true;
    }
}
