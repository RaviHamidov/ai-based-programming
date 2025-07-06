import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Compound interest calculator

        Scanner input = new Scanner(System.in);

        double principial;
        double rate;
        double timesCompounded;
        int years;
        double amount;
        
        System.out.print("Enter the principal amount: ");
        principial = input.nextDouble();

        System.out.print("Enter the annual interest rate (in %): ");
        rate = input.nextDouble() / 100;

        System.out.print("Enter the number of times interest is compounded per year: ");
        timesCompounded = input.nextInt();  

        System.out.print("Enter the number of years: ");
        years = input.nextInt();

        amount = principial * Math.pow((1 + rate / timesCompounded), timesCompounded * years);

        System.out.println("The amount after + " + years + " years is: " + "$" + amount);

        input.close();
    }
}
