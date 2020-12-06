package exercises.class1;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner lengthInput = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        Integer length = lengthInput.nextInt();
        lengthInput.skip("\n");
        Scanner widthInput = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle:");
        Integer width = widthInput.nextInt();
        Integer area = length*width;
        System.out.println("The area of the rectangle with length of "+ length +
                " and width of "+ width + " is "+ area);
    }
}
