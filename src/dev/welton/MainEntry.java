package dev.welton;

import javax.swing.*;

public class MainEntry {
    private JLabel l2EditLabel;
    private JButton button1;
    private JPanel Main;
    private JButton button2;
    private JMenu MyMenu;
    private JMenu Ajuda;

    public static void main(String[] args) {
        JFrame frame = new JFrame("L2 Config Editor");
        frame.setContentPane(new MainEntry().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MainEntry() {
        button1.addActionListener(e -> l2EditLabel.setText("Hello World"));
    }

}
