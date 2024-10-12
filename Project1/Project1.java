import java.io.File;
import java.util.Scanner;
public class Project1 {
    public static void main(String[] args){
        Appliance[] refrigerators = new Appliance[100];
        Appliance[] dishwashers = new Appliance[100];
        Appliance[] microwaves = new Appliance[100];
        Appliance[] appliances = new Appliance[300]; 
        int applianceCount = 0, fridgeCount = 0, dishwasherCount = 0, microwaveCount = 0;
        File file = new File("Project1.txt");
        if (!file.exists() || !file.isFile()) {
            System.out.println("Input file not found. Please ensure Project1.txt is available.");
            return;
        }
        Scanner scanner = new Scanner(new File("Project1.txt"));
        while (scanner.hasNextLine()) {
            String serialNumber = scanner.nextLine().trim();
            appliances[applianceCount++] = new Appliance(serialNumber);
        }
        scanner.close();
    }
}