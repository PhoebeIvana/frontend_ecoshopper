package GUI;
import javax.swing.*;

/**
 * Represents the page for renting books in the application (Singleton).
 *
 * This class ensures that there's only one instance of the rent book page.
 *
 * @author Edgrant Henderson Suryajaya
 */
public class RentBookPage {
    private static RentBookPage instance;

    // Private constructor to prevent external instantiation
    private RentBookPage() {
        // Initialize page components here
    }

    /**
     * Gets the single instance of the rent book page.
     *
     * @return The singleton instance of the rent book page.
     */
    public static RentBookPage getInstance() {
        if (instance == null) {
            instance = new RentBookPage();
        }
        return instance;
    }

    /**
     * Creates and returns the panel for the rent book page.
     *
     * @return The JPanel representing the rent book page.
     */
    public JPanel createPage() {
        JPanel panel = new JPanel();
        // Add rent book page components here
        return panel;
    }
}
