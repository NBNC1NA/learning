import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double length, breadth;

        // Prompt the user to enter the length of rectangle
        System.out.print("Enter the length of rectangle: ");
        length = input.nextDouble();

        // Prompt the user to enter the breadth of rectangle
        System.out.print("Enter the breadth of rectangle: ");
        breadth = input.nextDouble();

        // Close the Scanner object
        input.close();

        // Calculate the perimeter of rectangle using the formula: 2 * (length + breadth)
        double perimeter = 2 * (length + breadth);

        // Display the result
        System.out.println("The perimeter of rectangle is " + perimeter + " units.");
    }
}
