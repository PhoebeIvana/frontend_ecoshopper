package GUI;

import javax.swing.*;

/**
 * Represents the account page of the application (Singleton).
 *
 * This class ensures that there's only one instance of the account page.
 *
 * @author Edgrant Henderson Suryajaya
 */
public class AccountPage {
    private static AccountPage instance;

    // Private constructor to prevent external instantiation
    private AccountPage() {
        // Initialize page components here
    }

    /**
     * Gets the single instance of the account page.
     *
     * @return The singleton instance of the account page.
     */
    public static AccountPage getInstance() {
        if (instance == null) {
            instance = new AccountPage();
        }
        return instance;
    }

    /**
     * Creates and returns the panel for the account page.
     *
     * @return The JPanel representing the account page.
     */
    public JPanel createPage() {
        JPanel panel = new JPanel();
        // Add account page components here
        return panel;
    }
}
