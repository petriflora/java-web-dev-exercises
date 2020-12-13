package exercises.technology;

import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;

public class Program {
    public static void main(String[] args){
        Laptop acer = new Laptop(2020,"AMD Ryzen 7 4700U","Windows","Acer Swift 3",24,14,2.7);
        System.out.println(acer);
        System.out.println("This computer is lightweight: " + acer.isLightweight());
        System.out.println("This computer is powerful: " + acer.isPowerful());
        System.out.println("This computer is the latest model: " + acer.isNewestModel());
        System.out.println("This computer is ready for electronic recycling: " + acer.isReadyForElectronicRecycling());
        System.out.println("\n");

        SmartPhone iPhone10 = new SmartPhone(2018,"A11 Bionic","iOS 12","iPhone10",false,"Verizon","rose gold");
        System.out.println(iPhone10);
        System.out.println("This phone is cool: " + iPhone10.isCool());
        System.out.println("This phone is the latest model: " + iPhone10.isNewestModel());
        System.out.println("This phone is ready for electronic recycling: " + iPhone10.isReadyForElectronicRecycling());

    }

}
