package GUI;

import javax.swing.*;

/**
 * Represents the login page of the application (Singleton).
 *
 * This class ensures that there's only one instance of the login page.
 *
 * @author Edgrant Henderson Suryajaya
 */
public class LoginPage {
    private static LoginPage instance;

    // Private constructor to prevent external instantiation
    private LoginPage() {
        // Initialize page components here
    }

    /**
     * Gets the single instance of the login page.
     *
     * @return The singleton instance of the login page.
     */
    public static LoginPage getInstance() {
        if (instance == null) {
            instance = new LoginPage();
        }
        return instance;
    }

    /**
     * Creates and returns the panel for the login page.
     *
     * @return The JPanel representing the login page.
     */
    public JPanel createPage() {
        JPanel panel = new JPanel();
        // Add login components here
        return panel;
    }
}
