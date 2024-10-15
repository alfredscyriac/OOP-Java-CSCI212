import javax.swing.JOptionPane;
public class Q3A {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog(null,"Enter a string: "); 
        int n = input.length();
        int count = 0;
        for(int i =0; i<n; i++){
            if(Character.isDigit(input.charAt(i))){
                count++;
            }
        }
        JOptionPane.showMessageDialog(null,"Number of digits: "+count);
    }
}