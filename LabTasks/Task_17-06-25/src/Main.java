import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Java Home Task: "Fitness Tracker Assistant" - Create a small console-based
        // "Fitness Tracker" Assistant that collects user input, performs calculations
        // using operators, and prints meaningful feedback.
        // ***************************************************************************
        // I wrote Line-by-Line Requirements:
        // 1. Collect User Info
        // 2. Calculate and Display BMI
        // 3. Apply Assignment and Arithmetic Operators
        // 4. Logical Checks
        // 5. Final Output
        // 💡 Bonus Challenge (Optional):

        Scanner scanner = new Scanner(System.in);

        // - Name (String)
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        // - Age (int)
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();

        // - Weight in kg (double)
        System.out.print("What is your Weight: ");
        double weight = scanner.nextDouble();

        // - Height in meters (double)
        System.out.print("What is your Height: ");
        double height = scanner.nextDouble();

        // - Has Gym Membership? (boolean)
        System.out.print("Has Gym Membership? ? (true/false) ");
        boolean hasGym = scanner.nextBoolean();

        // - Calculating BMI
        double bmi = weight / (height * height);

        // - Count of Steps
        System.out.print("How many steps you have today ?");
        double step = scanner.nextDouble();

        // Solutions
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your weight is " + weight + "kg");
        System.out.println("Your height is " + height + "m");
        if (hasGym) {
            System.out.print("Your membership is active !");
        } else {
            System.out.print("Your membership is not active !");
        }
        // - - - - - - - - - - - - - - - - - - - - - - - - - -
        if ( bmi < 18.5 ) {
            System.out.println("Your BMI result is: Underweight");
        } else if ( bmi < 24.9 ) {
            System.out.println("Your BMI result is: Normal");
        } else if ( bmi < 29.9 ) {
            System.out.println("Your BMI result is: Overweight");
        } else {
            System.out.println("Your BMI result is: Obese");
        }
        // - - - - - - - - - - - - - - - - - - - - - - - - - -
        // Increase weight by 2.5 kg (+=)
        System.out.println("Your weight is increased, right now you are: "+ ( weight + 2.5 ) + "kg");

        // Reduce age by 1 (=)
        System.out.println("Also your age are reduced, right now you are: "+ ( age -= 1  ) + "years old");

        // Multiply height by 1.01 to simulate slight growth (=)
        System.out.println("Also your height are increased, right now you are: "+ ( height * 1.01  ) + "m");
        // - - - - - - - - - - - - - - - - - - - - - - - - - -
        // Is the user over 18 AND has a gym membership?
        if ( age > 18 && hasGym ) {
            System.out.println("Your age is 18+ and You have Gym membership");
        } else {
            System.out.println("Your age is not 18+ or You don't have Gym membership !");
        }

        // Is the user under 18 OR has a BMI over 25?
        if (  age < 18 || bmi > 25 ) {
            System.out.println("Your are under 18 ");
        } else {
            System.out.println("You has a BMI over 25!");
        }

        // Is the user not a gym member?
        if ( !hasGym ) {
            System.out.println("You are not gym member !");
        } else {
            System.out.println("You are gym member !");
        }

        // - - - - - - - - - - - - - - - - - - - - - - - - - -

        // 💡 Bonus Challenge (Optional):
        if ( step % 10.000 == 0 ) {
            System.out.println("\uD83C\uDF89 Great job!");
        } else {
            System.out.println("\uD83D\uDEB6 Keep going!");
        }
        scanner.close();
    }
}