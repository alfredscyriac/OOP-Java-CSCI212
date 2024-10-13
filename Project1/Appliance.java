public class Appliance{ 
    // Private instance variable for the serial number
    private String serialNumber; 
    
    // Constructor that takes a String serial number as a parameter
    // This is called when we create a new Appliance object. 
    public Appliance(String serialNumber) 
    { 
        this.serialNumber = serialNumber;
    }
    
    // Get method 
    // This allows us to retrieve the serial number of an appliance
    public String getSerialNumber() { 
        return serialNumber; 
    }

    // Set method
    // This lets us change the serial number of an appliance
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber; 
    }
    

    public String toString() {
        return serialNumber; 
    }

    // Determines the type of appliance by checking the first char in the string serialNumber
    // 'R' means Refrigerator, 'D' means Dishwasher, and 'M' means Microwave.
    // This is crucial for when we categorize all the serial numbers in Project1.java 
    public char getApplianceType() {
        return serialNumber.charAt(0); 
    }

    // It returns a value less than 0 if this appliance's serial number 
    // comes before the other appliance's serial number,
    // a value of 0 if they are the same, and a value greater than 0 
    // if this appliance's serial number comes after the other appliance's serial number.
    // This method is crucial for our selectionSort method in Project1.java
    public int compareTo(Appliance other) {
        return this.serialNumber.compareTo(other.serialNumber);
    }
}