// Alfred Siby Cyriac 
// Lab Section: 121E
import javax.swing.*;
public class Project0{
    public static void main(String[] args){
        String inputWord = "NA";
        int Lowercase = 0; 
        int Uppercase = 0; 
        while (!inputWord.equals("STOP")) {
			inputWord = JOptionPane.showInputDialog(null, "Enter a word: ");
			if (inputWord.equals("STOP")) {
				System.exit(0);
			}
			else {
                Lowercase = checkLowercase(inputWord);
                Uppercase = checkUppercase(inputWord); 
			}
			JOptionPane.showMessageDialog(null, "Number of lowercase e's: " + Lowercase + "\nNumber of uppercase E's: " + Uppercase);
		}
    }
    public static int checkLowercase(String x){
        int countLower = 0; 
        for(int i=0; i<x.length(); i++){
            if (x.charAt(i) == 'e') {
                countLower += 1; 
            }
        }
        return countLower; 
    }
    public static int checkUppercase(String x){
        int countUpper = 0;
        for(int j=0; j<x.length(); j++){
            if (x.charAt(j) == 'E') {
                countUpper += 1; 
            }
        }
        return countUpper;  
    }
}