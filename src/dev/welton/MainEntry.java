package dev.welton;

import javax.swing.*;

public class MainEntry {
    private JLabel l2EditLabel;
    private JButton button1;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainEntry");
        frame.setContentPane(new MainEntry().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MainEntry() {
        button1.addActionListener(_ -> l2EditLabel.setText("Hello World"));
    }

}
