import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = 0, height = 0;
        boolean validInput;

        // Input for width of the rectangle
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                width = scanner.nextDouble();
                if (width > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a positive number.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); // Clear the invalid input
            }
        } while (!validInput);

        // Input for height of the rectangle
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (scanner.hasNextDouble()) {
                height = scanner.nextDouble();
                if (height > 0) {
                    validInput = true;
                } else {
                    System.out.println("Please enter a positive number.");
                    validInput = false;
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                validInput = false;
                scanner.next(); // Clear the invalid input
            }
        } while (!validInput);

        // Calculations
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        // Output results
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
        System.out.println("Length of the diagonal: " + diagonal);
    }
}


