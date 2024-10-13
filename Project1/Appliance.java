public class Appliance{ 
    // Private instance variable for the serial number
    private String serialNumber; 
    
    // Constructor that takes a String serial number as a parameter
    public Appliance(String serialNumber) 
    { 
        this.serialNumber = serialNumber;
    }
    
    // Get method 
    public String getSerialNumber() { 
        return serialNumber; 
    }

    // Set method
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber; 
    }
    

    public String toString() {
        return serialNumber; 
    }

    // Determines the type of appliance by checking the first char in the string serialNumber
    public char getApplianceType() {
        return serialNumber.charAt(0); 
    }

    
    public int compareTo(Appliance other) {
        return this.serialNumber.compareTo(other.serialNumber);
    }
}