
/**
 * The WordCounter application counts how many words and characters are in
 * a text
 *
 * @author Billy Stanton
 * @since 12/11/23
 * @version 1.0
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class WordCounter {

    // Initialize TextCounter
    public static TextCounter text = new TextCounter();
    public static ImageIcon icon = new ImageIcon("logo.png");

    public static void main(String[] args) {
        // Option Dialog Elements
        JLabel title = new JLabel("Word Counter Application");
        title.setFont(new Font("Arial", Font.BOLD, 14));
        JTextField textField = new JTextField();

        // Check btn
        JButton check = new JButton("Check Text");
        ActionListener countWordsEvent = (ActionEvent ae) -> {
            // Get the text from the text field
            text.setText(textField.getText());

            // Get results
            if (text.getText().length() != 0) {
                // Clear the text field
                textField.setText("");

                // Get the results
                results();
            }
        };
        check.addActionListener(countWordsEvent);

        // Exit btn
        JButton exit = new JButton("Exit App");
        ActionListener exitEvent = (ActionEvent ae) -> {
            // Exit app
            System.exit(0);
        };
        exit.addActionListener(exitEvent);

        // Display Array
        Object[] display = {
            title,
            textField,
            check,
            exit
        };

        // Display UI
        JOptionPane.showOptionDialog(null, display, "Word Counter Application", 0, -1, icon, new Object[]{}, null);
    }

    /**
     * The results method displays the results from the text
     */
    public static void results() {
        // Option Dialog Elements
        JLabel title = new JLabel("Word Counter Results");
        JLabel charCount = new JLabel("Characters: " + text.charCount());
        JLabel wordCount = new JLabel("Words: " + text.wordCount());
        
        // Display Array
        Object[] display = {
            title,
            charCount,
            wordCount
        };
        
        // Display Results
        JOptionPane.showOptionDialog(null, display, "Word Counter Application", 0, -1, icon, new Object[]{"Exit Results"}, null);
    }
}
