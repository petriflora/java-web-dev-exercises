package exercises.technology;

public class Laptop extends Computer {
    private String model;
    private int systemMemory;
    private int screenWidth;
    private double weight;
    private int laptopID = 10;

    //constructor
    public Laptop (int year, String processor,String os, String model, int ram, int screen, double weight) {
         super (year,processor,os);
         this.model = model;
         this.systemMemory = ram;
         this.screenWidth = screen;
         this.weight = weight;
    }

    //methods
    public boolean isLightweight() {
        if (weight < 3.5) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isPowerful() {
        if (systemMemory >= 24 ) {
            return true;
        } else {
            return false;
        }
    }
    public  int createID() {
        return laptopID ++;
    }

    public String toString() {
        return "LAPTOP SPECS for Laptop Model: " + this.model +
                "\n\t" + "Year manufactured: " + this.getYearMade() +
                "\n\t" + "Processor: " + this.getProcessorType() +
                "\n\t" + "Operating System: " + this.getOperatingSystem() +
                "\n\t" + "System Memory: " + this.systemMemory + "GB" +
                "\n\t" + "Display: " + this.screenWidth + " inches" +
                "\n\t" + "Weight: " + this.weight + " pounds";
    }

    //getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
