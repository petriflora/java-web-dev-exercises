package exercises.technology;

public class SmartPhone extends Computer {
    private String model;
    private boolean extendedWarranty;
    private String carrier;
    private String color;

    //constructor
    public SmartPhone (int year, String processor,String os, String model, boolean extWarr, String carrier, String color) {
        super (year,processor,os);
        this.model = model;
        this.extendedWarranty = extWarr;
        this.carrier = carrier;
        this.color = color;
    }

    //methods
    public boolean isCool() {
        if (color == "cobalt" || color == "rose gold") {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "SMARTPHONE SPECS for Phone Model: " + this.model +
                "\n\t" + "Year manufactured: " + this.getYearMade() +
                "\n\t" + "Processor: " + this.getProcessorType() +
                "\n\t" + "Operating System: " + this.getOperatingSystem() +
                "\n\t" + "Purchased Extended Warranty: " + this.extendedWarranty+
                "\n\t" + "Carrier: " + this.carrier +
                "\n\t" + "Color: " + this.color;
    }

    //getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isExtendedWarranty() {
        return extendedWarranty;
    }

    public void setExtendedWarranty(boolean extendedWarranty) {
        this.extendedWarranty = extendedWarranty;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
}
