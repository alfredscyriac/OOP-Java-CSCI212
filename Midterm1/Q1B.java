import javax.swing.JOptionPane;
public class Q1B{
    public static void main(String args[]){
        String input = JOptionPane.showInputDialog(null,"Enter a statement: "); 
        int n = input.length();
        int count = 0; 
        for(int i=0; i<n-1;i++){
            if(Character.isDigit(input.charAt(i))){
                if(Character.isDigit(input.charAt(i+1))){
                    count++;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Two digits happen "+count+" times.");
    }
}