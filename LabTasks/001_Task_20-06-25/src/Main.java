import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1 : Alien Juice Calculator 🛸🥤
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Write here Banana juice with ml: ");
//        int bananaJuice = scanner.nextInt();
//
//        System.out.println("Write here Cactus juice with ml: ");
//        int cactusJuice = scanner.nextInt();
//
//        int totalJuice = bananaJuice + cactusJuice;
//        int fullGlasses = totalJuice / 250;
//
//        System.out.println("Whoa! That makes " + totalJuice + " ml of cosmic juice! Enough to " + fullGlasses + " full glasses!");
//
//        scanner.close();

        // Task 2: Office Supplies Audit 📦📊

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter number of pens: ");
//        int pens = scanner.nextInt();
//
//        System.out.print("Enter number of papers: ");
//        int papers = scanner.nextInt();
//
//        System.out.print("Enter number of markers: ");
//        int markers = scanner.nextInt();
//
//        int totalItems = pens + papers + markers;
//
//        boolean allAboveTen = (pens > 10) && (papers > 10) && (markers > 10);
//
//        double pensPercentage = (pens * 100.0) / totalItems;
//        double papersPercentage = (papers * 100.0) / totalItems;
//        double markersPercentage = (markers * 100.0) / totalItems;
//
//        System.out.println("Total items: " + totalItems);
//        System.out.println("All categories more than 10 ? " + allAboveTen);
//
//        System.out.println("Pens: " + pensPercentage + "%");
//        System.out.println("Papers: " + papersPercentage + "%");
//        System.out.println("Markers: " + markersPercentage + "%");
//
//        scanner.close();

        // Task 3: Annual Salary Simulation 💼🤑

        Scanner scanner = new Scanner(System.in);

        System.out.print("Employee name: ");
        String name = scanner.nextLine();

        System.out.print("Monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        double annualSalary = monthlySalary * 12;
        double bonus = annualSalary * 0.10;
        double totalIncome = annualSalary + bonus;
        boolean isMillionaire = totalIncome > 1_000_000;

        System.out.println("Employee: " + name);
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Income: " + totalIncome);
        System.out.println("Is Millionaire ? " + isMillionaire);
        System.out.println("Happy Employee ? " + isMillionaire);

        scanner.close();
    }
}