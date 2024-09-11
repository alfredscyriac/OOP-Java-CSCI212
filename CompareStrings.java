import javax.swing.*;
public class CompareStrings {
	public static void main(String[] args) 
	{
		String[] wordArray = { "hello", "goodbye", "cat", "dog", "red", "green", "sun", "moon" };
		String isOrIsNot="is", inputWord="NA";
		while (!inputWord.equals("STOP")) {
			inputWord = JOptionPane.showInputDialog(null, "Enter a word in all lower case:");
			if (inputWord.equals("STOP")) {
				System.exit(0);
			}
			else {
				if (wordIsThere(inputWord, wordArray)) 
					isOrIsNot = "is";
				else
					isOrIsNot = "is not"; // set to is not if the word is not on the list
			}
			// Output to a JOptionPane window whether the word is on the list or not
			JOptionPane.showMessageDialog(null, "The word " + inputWord + " " + isOrIsNot + " on the list.");
		}
	} //main
	public static boolean wordIsThere(String findMe, String[] theList) {
		for(int i=0; i<theList.length;i++){
			if(theList[i].equals(findMe)){
				return true;
			}
		}
		return false; 
	}
}