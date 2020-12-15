package exercises.technology.main;

public class Computer extends AbstractEntity {
    private int yearMade;
    private String processorType;
    private String operatingSystem;
    private final int currentYear = 2020;
    private int identificationNumber = 0;

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

    public  int createID() {
        return identificationNumber ++;
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

    public int getIdentificationNumber() {
        return identificationNumber;
    }

}
