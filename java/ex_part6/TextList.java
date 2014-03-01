package test5;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/26/13
 * 4:03 PM
 */

public class TextList implements ListSelectionListener {
    JFrame frame;
    JList list;
    JPanel panel;
    public static void main(String[] args) {
      TextList textList =new TextList();
        textList.go();
    }

    private void go() {
        frame = new JFrame();
         panel =new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] newList={"a","b","c","d","e","f","g","h"};
        list =new JList(newList);

        JScrollPane pane = new JScrollPane(list);
        pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(pane);
        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        list.addListSelectionListener(this);

        frame.getContentPane().add(BorderLayout.CENTER,list);

        frame.setSize(300,350);
        frame.setVisible(true);


    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (!e.getValueIsAdjusting()){
            String selection =(String) list.getSelectedValue();
            System.out.println("selection");
        }
    }
}
