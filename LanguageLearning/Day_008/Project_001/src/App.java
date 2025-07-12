import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Weight converter program
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Welcome to the weight converter program!");
        System.out.print("Enter your weight (with kg): ");
        weight = scanner.nextDouble();

        System.out.println("Choose the conversion type:");
        choice = scanner.nextInt();

        if (choice == 1) {
            // Convert from pounds to kilograms
            newWeight = weight;
            System.out.printf("Your weight in Kilograms is: %.2f kg%n", newWeight);
        } else if (choice == 2) {
            // Convert from kilograms to pounds
            newWeight = weight * 2.20462;
            System.out.printf("Your weight in Pounds is: %.2f lbs%n", newWeight);
        } else {
            System.out.println("Invalid choice! Please select 1 or 2.");
        }
        scanner.close();
    }
}
