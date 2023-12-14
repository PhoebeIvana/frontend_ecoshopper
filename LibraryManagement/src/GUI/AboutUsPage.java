package GUI;

import javax.swing.*;

/**
 * Represents the "About Us" page of the application (Singleton).
 *
 * This class ensures that there's only one instance of the "About Us" page.
 *
 * @author Edgrant Henderson Suryajaya
 */
public class AboutUsPage {
    private static AboutUsPage instance;

    // Private constructor to prevent external instantiation
    private AboutUsPage() {
        // Initialize page components here
    }

    /**
     * Gets the single instance of the "About Us" page.
     *
     * @return The singleton instance of the "About Us" page.
     */
    public static AboutUsPage getInstance() {
        if (instance == null) {
            instance = new AboutUsPage();
        }
        return instance;
    }

    /**
     * Creates and returns the panel for the "About Us" page.
     *
     * @return The JPanel representing the "About Us" page.
     */
    public JPanel createPage() {
        JPanel panel = new JPanel();
        // Add about us components here
        return panel;
    }
}
