package ProgramLogic;

import GUI.*;

import javax.swing.*;

/**
 * The main application class responsible for launching the application and managing page transitions.
 *
 * This class creates a Swing window and initializes the login and register pages.
 * It also provides a starting point for the application.
 *
 * @author Edgrant Henderson Suryajaya
 */
public class MainApplication {
    public static void main(String[] args) {
        // Create a new JFrame window
        JFrame mainFrame = new JFrame("Library Application");

        // Set the default close operation and size of the window
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 600); // Adjust the size as needed

        // Get instances of singleton pages
        LoginPage loginPage = LoginPage.getInstance();
        RegisterPage registerPage = RegisterPage.getInstance();

        // Create and display the panels
        JPanel loginPanel = loginPage.createPage();
        JPanel registerPanel = registerPage.createPage();

        // Add panels to the main application window
        // You can use layout managers to arrange the panels within the window
        // Example: mainFrame.getContentPane().setLayout(new BorderLayout());
        // Example: mainFrame.getContentPane().add(loginPanel, BorderLayout.CENTER);

        // Perform page transitions or actions
        // You can use event handlers or buttons to navigate between pages

        // Set the main frame to be visible
        mainFrame.setVisible(true);
    }
}
