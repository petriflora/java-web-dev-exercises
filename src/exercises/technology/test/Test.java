package exercises.technology.test;
import exercises.technology.main.Computer;
import exercises.technology.main.Laptop;
import exercises.technology.main.SmartPhone;
import org.junit.Before;
import static org.junit.Assert.*;

public class Test {

    Computer test_computer;
    Laptop test_laptop;
    Laptop test_weakLaptop;
    SmartPhone test_smartphone;
    SmartPhone test_blueSmartPhone;

    @Before
    public void createComputerObject() { test_computer = new Computer(2014,"Really Fast Processor","Windows8K"); }

    @Before
    public void createLaptopObject() { test_laptop = new Laptop(2020,"AMD Ryzen 7 4700U","Windows","Acer Swift 3",24,14,2.7);}

    @Before
    public void createNewLaptopObject() { test_weakLaptop = new Laptop(2020,"AMD Ryzen 7 4700U","Windows","Acer Swift 3",8,14,5.0);}

    @Before
    public void createSmartPhoneObject() { test_smartphone = new SmartPhone(2018,"A11 Bionic","iOS 12","iPhone10",false,"Verizon","rose gold");}

    @Before
    public void createNewSmartPhoneObject() { test_blueSmartPhone = new SmartPhone(2018,"A11 Bionic","iOS 12","iPhone10",false,"Verizon","blue");}

    @org.junit.Test
    public void emptyTest() {
        assertEquals(10,10);
    }
    //1. test computer method - uses Computer with old year model
    @org.junit.Test
    public void testComputerIsNotReadyForElectronicRecycling() {
        assertTrue (test_computer.isReadyForElectronicRecycling());
    }
    //2. test computer method - uses Laptop with latest year model
    @org.junit.Test
    public void testComputerIsReadyForElectronicRecycling() {
        assertFalse (test_laptop.isReadyForElectronicRecycling());
    }
    //3. test computer method - uses Computer with old year model
    @org.junit.Test
    public void testComputerIsNotNewestModel() {
        assertFalse (test_computer.isNewestModel());
    }
    //4. test computer method - uses Laptop with latest year model
    @org.junit.Test
    public void testComputerIsNewestModel() {
        assertTrue (test_laptop.isNewestModel());
    }
    //1. test laptop method
    @org.junit.Test
    public void testLaptopIsPowerful() {
        assertTrue (test_laptop.isPowerful());
    }
    //2. test laptop method
    @org.junit.Test
    public void testLaptopIsNotPowerful() {
        assertFalse (test_weakLaptop.isPowerful());
    }
    //3. test laptop method
    @org.junit.Test
    public void testLaptopIsLightweight() {
        assertTrue (test_laptop.isLightweight());
    }
    //4. test laptop method
    @org.junit.Test
    public void testLaptopIsNotNotLightweight() {
        assertFalse (test_weakLaptop.isLightweight());
    }
    //1. test smartphone method
    @org.junit.Test
    public void testSmartPhoneIsCool() {
        assertTrue (test_smartphone.isCool());
    }
    //2. test smartphone method
    @org.junit.Test
    public void testSmartPhoneIsNotCool() {
        assertFalse (test_blueSmartPhone.isCool());
    }

}
