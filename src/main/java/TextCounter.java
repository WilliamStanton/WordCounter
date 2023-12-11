/**
 * The TextCounter class has methods for the main class
 * to set, get, and check char/words for a text
 * 
 * @author Billy Stanton
 * @since 12/11/23
 * @version 1.0
 */

public class TextCounter {
    // Declare var
    private String text;

    /**
     * The getText method gets the text that is currently being stored
     * 
     * @return the text currently being stored
     */
    public String getText() {
        // Get stored text
        return text;
    }

    /**
     * The setText method sets the currently stored text
     * @param text the text to be stored
     */
    public void setText(String text) {
        // Update stored text
        this.text = text;
    }
    
    /**
     * The charCount method gets the amount of characters in the stored text
     * @return the amount of characters in the stored text
     */
    public int charCount() {
        // Return the amount of characters
        return text.length();
    }
    
    /**
     * The wordCount method gets the amount of words in the stored text
     * @return the amount of words in the stored text
     */
    public int wordCount() {
        // Split words into array by space
        String[] words = text.split(" ");
        
        // Return the amount of words
        return words.length;
    }
}
