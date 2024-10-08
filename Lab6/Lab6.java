import javax.swing.*;
public class Lab6 {
    public static void main(String[] args) {
        int[] intArray = new int[100]; // Array to hold ints
        int lengthFilled = inputFromFile(args[0], intArray); // Read ints from file into array

        int sum = sum(intArray, lengthFilled);
        JOptionPane.showMessageDialog(null, "The sum of the integers is: " + sum);

        int avg = average(intArray, lengthFilled);
        JOptionPane.showMessageDialog(null, "The average of the integers is: " + avg);
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
