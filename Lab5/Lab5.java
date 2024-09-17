import javax.swing.*;
public class Lab5 {
    public static void main(String[] args) {
        String[] wordArray = new String[100]; // Array to hold the words from the file
        int lengthFilled = inputFromFile("Lab5input.txt", wordArray); // Read words from file into array
        String isOrIsNot = "is", inputWord = "NA";

        while (!inputWord.equals("STOP")) {
            inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
            if (inputWord.equals("STOP")) {
                System.exit(0);
            } else {
                if (wordIsThere(inputWord, wordArray, lengthFilled))
                    isOrIsNot = "is";
                else
                    isOrIsNot = "is not"; // Set to "is not" if the word is not on the list
            }
            // Output to a JOptionPane window whether the word is on the list or not
            JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
        }
    }

    // Method to read words from a file and store them in a string array
    private static int inputFromFile(String filename, String[] words) {
        TextFileInput in = new TextFileInput(filename);
        int lengthFilled = 0;
        String line = in.readLine();
        // Read each line from the file and store it in the array
        while (lengthFilled < words.length && line != null) {
            words[lengthFilled++] = line; // Store each line as a word
            line = in.readLine();
        }
        in.close(); // Close the file input after reading
        return lengthFilled; 
    }

    // Method to check if a word exists in the array
    public static boolean wordIsThere(String findMe, String[] theList, int lengthFilled) {
        for (int i = 0; i < lengthFilled; i++) {
            if (theList[i].equals(findMe)) {
                return true;
            }
        }
        return false;
    }
}
