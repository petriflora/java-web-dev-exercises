package exercises.technology;

public class Computer {
    private int yearMade;
    private String processorType;
    private String operatingSystem;
    private final int currentYear = 2020;

    //constructor
    public Computer (int year, String processor,String os) {
        this.yearMade = year;
        this.processorType = processor;
        this.operatingSystem = os;
    }

    //methods
    public boolean isReadyForElectronicRecycling() {
        if (currentYear - yearMade >=5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNewestModel() {
        if (currentYear == yearMade) {
            return true;
        } else {
            return false;
        }
    }

    //getters only - not setting anything through child classes
    public int getYearMade() {
        return yearMade;
    }

    public String getProcessorType() {
        return processorType;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }




}
