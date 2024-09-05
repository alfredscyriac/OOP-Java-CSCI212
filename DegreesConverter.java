public class DegreesConverter{
    public static void main(String[] args) {
        float fahrenheit = 98.6f; 
        float centigrade; 
        centigrade = (fahrenheit-32)*5/9;
        // c = 5/9 (f-32)
        System.out.println("Fahrenheit 98.6 converted to Centigrade is "+ centigrade);
        System.out.println("Iterating using for loop: ");
        for (float i = 0.0f; i <= 40; i+=5) {
            centigrade = (i-32)*5/9;
            System.out.println("Fahrenheit " + i + " converted to Centigrade is "+ centigrade);
        }
        System.out.println("Iterating using while loop: ");
        float k = 0.0f; 
        while (k <= 40.0f){
            centigrade = (k-32)*5/9;
            System.out.println("Fahrenheit " + k + " converted to Centigrade is "+ centigrade);
            k+=5; 
        }
    }
}