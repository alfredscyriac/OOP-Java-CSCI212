public class Q1A {
    public static void main(String args[]){
        if(args.length!=2){
            throw new IllegalArgumentException("Not enough arguements");
        }
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int sum = x + y; 
        int product = x * y;
        System.out.println(x+" + "+y+" = "+sum);
        System.out.println(x+" * "+y+" = "+product);

    }
}