package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RunAll {
    public static void main(String[] args) {
    JFrame frame=new JFrame();
    frame.setTitle("Application Form");
    frame.setSize (700, 500);
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JMenuBar menu=new JMenuBar();
    JMenu menuHelloCli=new JMenu ("HelloWorld");
    JMenuItem itemHelloEn=new JMenuItem ("HelloMum");
    menuHelloCli.add(itemHelloEn);
    JMenuItem itemHelloRu=new JMenuItem ("HelloDad");
    menuHelloCli.add(itemHelloRu);
    menu.add(menuHelloCli);

    frame.setJMenuBar(menu);
    itemHelloEn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Hello, world!");
        }
    });
    frame.setJMenuBar(menu);
    itemHelloEn.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Привет,мир!");
        }
    });
    frame.setVisible(true);
}
}
