// Alfred Siby Cyriac 
// Lab Section: 121E
import javax.swing.*; // This package allows us the program to use JOptionPane
public class Project0{
    public static void main(String[] args){
        // Create and intialize variables with placeholders
        String inputWord = "NA";
        int Lowercase = 0; 
        int Uppercase = 0;
        // While loop is what allows the user to give in multiple inputs 
        // The program only stops when the input is STOP 
        while (!inputWord.equals("STOP")) {
            // We update the placeholder with the user's actual input
			inputWord = JOptionPane.showInputDialog(null, "Enter a word: ");
            // If the user's input was the string STOP then the program ends
			if (inputWord.equalsIgnoreCase("STOP")) {
				System.exit(0);
			}
			else {
                // checkLowercase and checkUppercase are methods that return integers 
                // and they are going to replace the placeholder values
                // the updated vales are what will be shown on the screen
                Lowercase = checkLowercase(inputWord);
                Uppercase = checkUppercase(inputWord); 
			}
            // This is the output line, although Lowercase and Uppercase are integers
            // They will be converted to strings as they are being concatenated 
            // \n is used to print these messages on seperate lines
			JOptionPane.showMessageDialog(null, "Number of lowercase e's: " + Lowercase + "\nNumber of uppercase E's: " + Uppercase);
		}
    }
    // We are passing in the user's input as the only parameter
    public static int checkLowercase(String x){
        // intialize an integer to a counter variable that we will return at the end to
        // determine how lowercase e's are in the user's input
        int countLower = 0; 
        for(int i=0; i<x.length(); i++){
            // checks every character in the string to see if it equals lowercase e
            // if it does then we increment the counter variable by 1 
            if (x.charAt(i) == 'e') {
                countLower += 1; 
            }
        }
        // By returning the counter, the method will always return an integer value 
        // The int value returned will always be the # of lowercase e's in the method's string parameter
        return countLower; 
    }
    // We are passing in the user's input as the only parameter
    public static int checkUppercase(String x){
        // intialize an integer to a counter variable that we will return at the end to
        // determine how uppercase E's are in the user's input
        int countUpper = 0;
        for(int j=0; j<x.length(); j++){
            // checks every character in the string to see if it equals uppercase E
            // if it does then we increment the counter variable by 1 
            if (x.charAt(j) == 'E') {
                countUpper += 1; 
            }
        }
        // By returning the counter, the method will always return an integer value 
        // The int value returned will always be the # of uppercase E's in the method's string parameter
        return countUpper;  
    }
}