package exercises.technology.main;

public class Program {
    public static void main(String[] args){
        Laptop acer = new Laptop(2020,"AMD Ryzen 7 4700U","Windows","Acer Swift 3",24,14,2.7);
        System.out.println(acer);
        System.out.println("ID#: C" + acer.getId());
        System.out.println("This computer is lightweight: " + acer.isLightweight());
        System.out.println("This computer is powerful: " + acer.isPowerful());
        System.out.println("This computer is the latest model: " + acer.isNewestModel());
        System.out.println("This computer is ready for electronic recycling: " + acer.isReadyForElectronicRecycling());
        System.out.println("\n");

        Laptop acer2 = new Laptop(2015,"AMD Ryzen 7 4700U","Windows","Acer Swift 3",8,14,5.7);
        System.out.println(acer2);
        System.out.println("ID#: C" + acer2.getId());
        System.out.println("This computer is lightweight: " + acer2.isLightweight());
        System.out.println("This computer is powerful: " + acer2.isPowerful());
        System.out.println("This computer is the latest model: " + acer2.isNewestModel());
        System.out.println("This computer is ready for electronic recycling: " + acer2.isReadyForElectronicRecycling());
        System.out.println("\n");

        SmartPhone iPhone10 = new SmartPhone(2018,"A11 Bionic","iOS 12","iPhone10",false,"Verizon","rose gold");
        System.out.println(iPhone10);
        System.out.println("ID#: SP" + iPhone10.getId());
        System.out.println("This phone is cool: " + iPhone10.isCool());
        System.out.println("This phone is the latest model: " + iPhone10.isNewestModel());
        System.out.println("This phone is ready for electronic recycling: " + iPhone10.isReadyForElectronicRecycling());

        SmartPhone iPhone11 = new SmartPhone(2019,"A11 Bionic","iOS 12","iPhone11",false,"T-Mobile","silver");
        System.out.println(iPhone11);
        System.out.println("ID#: SP" + iPhone11.getId());
        System.out.println("This phone is cool: " + iPhone11.isCool());
        System.out.println("This phone is the latest model: " + iPhone11.isNewestModel());
        System.out.println("This phone is ready for electronic recycling: " + iPhone11.isReadyForElectronicRecycling());


        SmartPhone iPhone12 = new SmartPhone(2020,"A11 Bionic","iOS 12","iPhone12",false,"Verizon","cobalt blue");
        System.out.println(iPhone12);
        System.out.println("ID#: SP" + iPhone12.getId());
        System.out.println("This phone is cool: " + iPhone12.isCool());
        System.out.println("This phone is the latest model: " + iPhone12.isNewestModel());
        System.out.println("This phone is ready for electronic recycling: " + iPhone12.isReadyForElectronicRecycling());

    }

}
