package GUI;

import javax.swing.*;
import java.awt.*;

public class MyAccountPage implements Displayable{
    private static class Row{
        private final String text;
        private String value;

        public Row(String text, String value){
            this.text = text;
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public JPanel makeRow(){
            JPanel row = new JPanel();
            row.setLayout(new BoxLayout(row, BoxLayout.X_AXIS));
            JLabel nameText = new JLabel(this.text);
            row.add(nameText);
            JLabel nameVal = new JLabel(getValue());
            row.add(nameVal);

            return row;
        }
    }

    @Override
    public void display() {
        SwingUtilities.invokeLater(() -> {
            // Create a new JFrame for the About Us page
            JFrame frame = new JFrame("About Us");
            NavigationBar navigationBar = new NavigationBar(frame);
            frame.getContentPane().add(navigationBar, BorderLayout.NORTH);

            // Menu
            JPanel columns = new JPanel();
            columns.setLayout(new BoxLayout(columns, BoxLayout.Y_AXIS));

            frame.setSize(600, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);


            /*--------------------------------------------------------------------------------------------------------*/
            // Component setup
            Row nameRow = new Row("Nama: ", "Edgrant Henderson Suryajaya");
            columns.add(nameRow.makeRow());

            Row emailRow = new Row("Email: ", "edgrant@netlab.com");
            columns.add(emailRow.makeRow());

            Row ratingRow = new Row("Rating: ", "0");
            columns.add(ratingRow.makeRow());


            // Add the content panel to the frame
            frame.add(columns);
        });
    }
}
