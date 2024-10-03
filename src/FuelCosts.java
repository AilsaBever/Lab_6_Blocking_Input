import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallons = 0, efficiency = 0, pricePerGallon = 0;
        boolean validInput;

        // Input for gallons of gas in the tank
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (scanner.hasNextDouble()) {
                gallons = scanner.nextDouble();
                if (gallons > 0) {
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

        // Input for fuel efficiency in miles per gallon
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                efficiency = scanner.nextDouble();
                if (efficiency > 0) {
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

        // Input for price of gas per gallon
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (scanner.hasNextDouble()) {
                pricePerGallon = scanner.nextDouble();
                if (pricePerGallon > 0) {
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
        double costToDrive100Miles = 100 / efficiency * pricePerGallon;
        double distanceWithFullTank = gallons * efficiency;

        // Output results
        System.out.println("Cost to drive 100 miles: $" + costToDrive100Miles);
        System.out.println("Distance the car can go with a full tank: " + distanceWithFullTank + " miles");
    }
}
