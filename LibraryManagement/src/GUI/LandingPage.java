package GUI;

import javax.swing.*;

public class LandingPage {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Example");

        // Create a JLabel with text
        JLabel label = new JLabel("This is a label");

        // Add the label to the frame
        frame.add(label);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
