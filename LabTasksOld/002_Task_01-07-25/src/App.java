import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner Barista = new Scanner(System.in);

       
        System.out.print("Welcome to Java Coffee! Please enter your age: ");
        int age = Barista.nextInt();

       
        if (age < 12) {
            System.out.println("You get a FREE drink! 🎁");
        } else if (age >= 12 && age <= 18) {
            System.out.println("You get a 20% student discount! 🧑‍🎓");
        } else if (age >= 65) {
            System.out.println("You get a 30% senior discount! 👴");
        } else {
            System.out.println("No discount applied.");
        }

        
        System.out.println("\n☕ Coffee Menu:");
        System.out.println("1. Espresso");
        System.out.println("2. Cappuccino");
        System.out.println("3. Latte");
        System.out.println("4. Mocha");

       
        System.out.print("Please choose your coffee (1-4): ");
        int customerChoice = Barista.nextInt();

    
        System.out.println();
        switch (customerChoice) {
            case 1:
                System.out.println("You selected Espresso. Enjoy! ☕");
                break;
            case 2:
                System.out.println("You selected Cappuccino. Enjoy! ☕");
                break;
            case 3:
                System.out.println("You selected Latte. Enjoy! ☕");
                break;
            case 4:
                System.out.println("You selected Mocha. Enjoy! ☕");
                break;
            default:
                System.out.println("Invalid customerChoice. Please select a number from 1 to 4.");
        }

        Barista.close();
    }
}
