package test5;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/26/13
 * 3:22 PM
 */

public class TextArea1 implements ActionListener, ItemListener {
    JTextArea text;
    JCheckBox checkBox ;
    public static void main(String[] args) {
        TextArea1 textArea1 = new TextArea1();
        textArea1.go();
        
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Just Click It");
        checkBox = new JCheckBox("Click me");

        button.addActionListener(this);
        checkBox.addItemListener(this);
        text = new JTextArea(10,20);
        text.setLineWrap(true);

        JScrollPane pane = new JScrollPane(text);
         pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
         pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//        pane.setBackground(Color.blue);
        panel.add(pane);
        frame.getContentPane().add(BorderLayout.CENTER,panel);
        frame.getContentPane().add(BorderLayout.SOUTH,button);
        frame.getContentPane().add(BorderLayout.NORTH,checkBox);

        frame.setSize(335,300);
        frame.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
       text.append("Button clicked \n");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

        String onOff ="Off";
        if (checkBox.isSelected()) onOff ="On";
        System.out.println("Check box is"+ onOff);
        checkBox.setSelected(true);
        checkBox.setSelected(false);
    }

}
