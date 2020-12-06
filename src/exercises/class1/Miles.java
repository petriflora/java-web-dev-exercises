package exercises.class1;
import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        Scanner distanceInput = new Scanner(System.in);
        System.out.println("Enter the number of miles driven:");
        Integer distance = distanceInput.nextInt();
        distanceInput.skip("\n");
        Scanner gallonsInput = new Scanner(System.in);
        System.out.println("Enter the number of gallons of gas used:");
        Integer gallons = gallonsInput.nextInt();
        Integer mpg = distance / gallons;
        System.out.println("If you drive " + distance +
                " miles and use " + gallons + " gallons, your mpg is " + mpg);
    }
}