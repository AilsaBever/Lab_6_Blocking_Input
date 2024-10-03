import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = 0;
        boolean validInput = false;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (scanner.hasNextDouble()) {
                celsius = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
            }
        } while (!validInput);

        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
