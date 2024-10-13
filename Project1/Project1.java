// Author: Alfred Siby Cyriac 
// CSCI212 Lab Section: 121E
import javax.swing.*; // This package allows the program to incorporate GUI components like JFrame and JTextArea
public class Project1 {
    public static void main(String[] args){
        // We are going to be storing all serial numbers in the appliances array and then sorting them using
        // our method and then categorizing them in their own arrays per appliance 
        // so that we can increment from start to finish of that array and print the sorted group
        Appliance[] refrigerators = new Appliance[100]; 
        Appliance[] dishwashers = new Appliance[100];
        Appliance[] microwaves = new Appliance[100];
        Appliance[] appliances = new Appliance[300]; 
        int applianceCount = 0, fridgeCount = 0, dishwasherCount = 0, microwaveCount = 0;

        // Read the file line by line
        // We reach the end of the file when there is null
        // For each line in the input we create an object appliance and store in previously created array
        // Close the file after we are done reading all information in
        TextFileInput fileInput = new TextFileInput("Project1.txt");
        String line;
        while ((line = fileInput.readLine()) != null) 
        {
            appliances[applianceCount++] = new Appliance(line.trim()); 
            
        }
        fileInput.close(); 

        // Loop through all the appliances that have been read in and stored into our appliances array
        // For each element that we reach using the for loop we check what the first char is to identify 
        // what kind of appliance it is. This is done using .getApplianceType method in Appliance.java.
        // Once we know what category it falls into, 
        // we want to add it to that specific array (which we created) so we can sort by category
        for (int i = 0; i < applianceCount; i++) 
        {
            Appliance appliance = appliances[i];
            if (appliance.getApplianceType() == 'R') 
            {
                refrigerators[fridgeCount++] = appliance;
            } 
            else if (appliance.getApplianceType() == 'D') 
            {
                dishwashers[dishwasherCount++] = appliance;
            } 
            else if (appliance.getApplianceType() == 'M') 
            {
                microwaves[microwaveCount++] = appliance;
            }
        }

        // Sort each individual category's array using selection sort function (can be found at the bottom of this files)
        selectionSort(refrigerators, fridgeCount);
        selectionSort(dishwashers, dishwasherCount);
        selectionSort(microwaves, microwaveCount);
        
        // Create our GUI
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the program when the window is closed.
        frame.setLayout(new java.awt.GridLayout(1, 3)); // Creates 3 sections/columns for refrigerators, dishwashers, microwave
        frame.setTitle("Project1 - Appliance List");
        
        // Refrigerators section will be the first column 
        // We are printing the sorted array we have of refridgerator serial numbers
        JTextArea fridgeArea = new JTextArea();
        for (int i = 0; i < fridgeCount; i++) {
            fridgeArea.append(refrigerators[i].toString() + "\n");
        }
        frame.add(new JScrollPane(fridgeArea));
        
        // Dishwasher section will be the second/ middle column 
        // We are printing the sorted array we have of dishwasher serial numbers
        JTextArea dishwasherArea = new JTextArea();
        for (int i = 0; i < dishwasherCount; i++) {
            dishwasherArea.append(dishwashers[i].toString() + "\n");
        }
        frame.add(new JScrollPane(dishwasherArea));
        
        // Microwave section will be the third/last column 
        // We are printing the sorted array we have of microwave serial numbers
        JTextArea microwaveArea = new JTextArea();
        for (int i = 0; i < microwaveCount; i++) {
            microwaveArea.append(microwaves[i].toString() + "\n");
        }
        frame.add(new JScrollPane(microwaveArea));
        
        // Display the GUI frame and setting its size
        frame.setSize(600, 400);
        frame.setVisible(true);
    }

    // This method is being used to sort each categories array 
    // Every incrementation of the for loop checks if we've found a smaller value than our minIndex variable
    // If so, we update our minIndex variable
    // To begin, we assume that that the first element in the array is our smallest value just for reference
    // The last portion within the scope of the first for loop with the temp variable is to ensure we don't
    // lose any elements from our array when we swap elements around 
    private static void selectionSort(Appliance[] array, int applianceCount) {
        for (int i = 0; i < applianceCount - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < applianceCount; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Appliance temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}