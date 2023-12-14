package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NavigationBar extends JPanel {
    private JFrame frame;

    public NavigationBar(JFrame frame) {
        this.frame = frame;
        createNavigationBar();
    }

    private void createNavigationBar() {

        // Create buttons for navigation choices
        JButton homeButton = new JButton("Home");
        JButton accountPageButton = new JButton("Account Page");
        JButton rentedBooksButton = new JButton("Rented Books");

        // Align buttons to the right using FlowLayout
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));


        buttonPanel.add(homeButton);
        buttonPanel.add(accountPageButton);
        buttonPanel.add(rentedBooksButton);

        // Add the buttonPanel to this NavigationBar
        this.add(buttonPanel);

        // Add action listeners to the buttons (customize these)
        homeButton.addActionListener(e -> {
            // Handle Home button click
            JOptionPane.showMessageDialog(frame, "Home button clicked");
        });

        accountPageButton.addActionListener(e -> {
            // Handle Account Page button click
            JOptionPane.showMessageDialog(frame, "Account Page button clicked");
        });

        rentedBooksButton.addActionListener(e -> {
            // Handle Rented Books button click
            JOptionPane.showMessageDialog(frame, "Rented Books button clicked");
        });
    }
}
