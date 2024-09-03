public class DegreesConverter{
    public static void main(String[] args) {
        float fahrenheit = 98.6f; 
        float centigrade; 
        centigrade = (fahrenheit-32)*5/9;
        // c = 5/9 (f-32)
        System.out.println("Fahrenheit 98.6 converted to Centigrade is "+ centigrade);
    }
}