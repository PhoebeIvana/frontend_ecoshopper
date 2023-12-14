package GUI;

import javax.swing.*;

/**
 * Represents the register page of the application (Singleton).
 *
 * This class ensures that there's only one instance of the register page.
 *
 * @author Edgrant Henderson Suryajaya
 */
public class RegisterPage {
    private static RegisterPage instance;

    // Private constructor to prevent external instantiation
    private RegisterPage() {
        // Initialize page components here
    }

    /**
     * Gets the single instance of the register page.
     *
     * @return The singleton instance of the register page.
     */
    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    /**
     * Creates and returns the panel for the register page.
     *
     * @return The JPanel representing the register page.
     */
    public JPanel createPage() {
        JPanel panel = new JPanel();
        // Add register components here
        return panel;
    }
}
