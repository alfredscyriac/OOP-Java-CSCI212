public class Q2B {
    public static void main(String args[])
    {
        int [][] array1 = {{1,3,3,2},{4,2,5,6},{1,2,3,4},{7,8,9,4}};
            if (diagonalEqualsRow(array1,2))
            System.out.println("Yes.");
    }
    public static boolean diagonalEqualsRow(int[][] arr, int x)
    {
        if(x>=arr.length || x<0){
            throw new IllegalArgumentException("Rows invalid");
        }
        if (arr.length != arr[0].length)
        {
            throw new IllegalArgumentException("Matrix not square.");
        }
        int row = 0; 
        int diag = 0;
        for(int i=0;i<arr.length; i++){
            row += arr[x][i];
            diag += arr[i][i];
        }
        return diag == row;
    }
    
}