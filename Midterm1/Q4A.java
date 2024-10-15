public class Q4A {
    public static void main(String args[]){
        int arr[][] = {{10, 45}, {2, 42, 67, 5}, {3, 21}};
        System.out.println(getSumofRow(arr, 1)); //prints the sum of row 1
    }
    private static int getSumofRow(int [][] myArray, int row){
        int x = myArray[row].length;
        int sum = 0; 
        for(int i=0;i<x;i++){
            sum += myArray[row][i];
        }
        return sum; 
    }
}