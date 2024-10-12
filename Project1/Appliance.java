public class Appliance{ 
    private String serialNumber; // Private instance variable for the serial number
    public Appliance(String serialNumber) { // Constructor that takes a String serial number as a parameter
        this.serialNumber = serialNumber;
    }
    public String getSerialNumber() { // Get method 
        return serialNumber; 
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber; // Set method
    }
    public String toString() {
        return serialNumber; 
    }
    public char getApplianceType() {
        return serialNumber.charAt(0); // Determines the type of appliance by checking the first char in the string serialNumber
    }
    public int compareTo(Appliance other) {
        return this.serialNumber.compareTo(other.serialNumber);
    }
}