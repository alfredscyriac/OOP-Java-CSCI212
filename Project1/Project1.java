public class Project1 {
    public static void main(String[] args){
        Appliance[] refrigerators = new Appliance[100];
        Appliance[] dishwashers = new Appliance[100];
        Appliance[] microwaves = new Appliance[100];
        Appliance[] appliances = new Appliance[300]; 
        int applianceCount = 0, fridgeCount = 0, dishwasherCount = 0, microwaveCount = 0;
        TextFileInput fileInput = new TextFileInput("input.txt");
        // Read the file line by line
        String line;
        while ((line = fileInput.readLine()) != null) {
            appliances[applianceCount++] = new Appliance(line.trim());
        }
        fileInput.close();
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
    }
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