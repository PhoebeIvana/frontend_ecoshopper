package GUI;

import javax.swing.*;

/**
 * Represents the main page of the application (Singleton).
 *
 * This class ensures that there's only one instance of the main page.
 *
 * @author Edgrant Henderson Suryajaya
 */
public class MainPage {
    private static MainPage instance;

    // Private constructor to prevent external instantiation
    private MainPage() {
        // Initialize page components here
    }

    /**
     * Gets the single instance of the main page.
     *
     * @return The singleton instance of the main page.
     */
    public static MainPage getInstance() {
        if (instance == null) {
            instance = new MainPage();
        }
        return instance;
    }

    /**
     * Creates and returns the panel for the main page.
     *
     * @return The JPanel representing the main page.
     */
    public JPanel createPage() {
        JPanel panel = new JPanel();
        // Add main page components here
        return panel;
    }
}
