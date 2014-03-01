package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/27/13
 * 7:07 PM
 */

import sun.swing.FilePane;

import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class GameQuizPlayer {

   private JFrame frame;
   private JPanel panel;
   private JTextArea answer;
   private JTextArea question;
   private JButton button;
   private JMenu menu;
   private QuizCard currentCard;
   private boolean isShowAnswer;

    ArrayList<QuizCard> cardList;

    public static void main(String[] args) {
        GameQuizPlayer gameQuizPlayer = new GameQuizPlayer();
        gameQuizPlayer.go();
    }
    //Build GUI
    private void go() {
        frame = new JFrame("My first Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        Font bigfont = new Font("Times New Roman",Font.BOLD,24);

        question = new JTextArea(10,20);
        question.setLineWrap(true);
        question.setWrapStyleWord(true);
        question.setFont(bigfont);

        answer =new JTextArea(10,20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(bigfont);

        JScrollPane pane1 =new JScrollPane(question);
        JScrollPane pane2 =new JScrollPane(answer);

        pane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        pane2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        pane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        button = new JButton("Next Card");
        cardList = new ArrayList<QuizCard> ();

        JLabel qlable =new JLabel("Question");
        JLabel alable =new JLabel("Answer");

        panel.add(qlable);
        pane1.add(alable);
        panel.add(button);
        panel.add(pane1);
        panel.add(pane2);

        button.addActionListener(new NextCardListner());

        menu = new JMenu("File");
        JMenuBar menuBar = new JMenuBar();
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem saveItem = new JMenuItem("Save");

        newItem.addActionListener(new NewCardListner());
        saveItem.addActionListener(new SaveCardListner());

        menu.add(newItem);
        menu.add(saveItem);
        menuBar.add(menu);

        frame.setJMenuBar(menuBar);

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(500,600);
        frame.setVisible(true);

    }

    private class NextCardListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           QuizCard card = new QuizCard(question.getText() ,answer.getText());
            cardList.add(card);
            clearCard();
        }
    }

    private class NewCardListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
           cardList.clear();
            clearCard();
        }
    }

    private class SaveCardListner implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            QuizCard card = new QuizCard(question.getText() ,answer.getText());
            cardList.add(card);

            JFileChooser filesave = new JFileChooser();
            filesave.showSaveDialog(frame);
            fileSave(filesave.getSelectedFile());
        }
    }

    /**
     * This method will save the file
     * @param selectedFile input file
     */
    private void fileSave(File selectedFile) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(selectedFile));

            for (QuizCard card:cardList){
                writer.write(card.getQuestion()+ " ");
                writer.write(card.getAnswer()+ " ");
                writer.write("\n ");

            }
            writer.close();
        }
        catch (Exception ex){
            System.out.println("No card list");
            ex.printStackTrace();
        }
    }

    private void clearCard() {
        question.setText(" ");
        answer.setText(" ");
        question.requestFocus();

    }


}



