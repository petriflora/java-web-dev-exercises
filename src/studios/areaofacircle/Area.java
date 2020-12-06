package studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner firstInput = new Scanner(System.in);
        System.out.println("Enter the radius of a circle:");
        Double radius = firstInput.nextDouble();
        Double areaOfCircle = Circle.getArea(radius);
        System.out.println("The area of a circle of radius "+ radius + " is: " + areaOfCircle);
    }
}
