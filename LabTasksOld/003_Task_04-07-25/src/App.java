import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner player = new Scanner(System.in);

        int energy = 100;
        int bonus = 0;

        System.out.println("🌋 Running from Vulcanic Island");
        System.out.println("One day you're waking up on a volcanic island, and you need to escape before the volcano erupts!");
        System.out.print("Write your Name: ");
        String playerName = player.nextLine();

        System.out.println("\nWelcome, " + playerName + "! Adventure started!");
        System.out.println("Get ready... The volcano may erupt! \n");

        // ZONE 1: Math Canyon
        System.out.println("=> Zone 1: Math Canyon");
        System.out.println("Ali is 3 years old, his brother is 2 years younger. When Ali is 10, how old will his brother be ?");
        int answer = player.nextInt();
        if (answer == 8) {
            System.out.println("=> Not bad logic! Energy -10, Bonus +5");
            bonus += 10;
        } else {
            System.out.println("=> Improve your logic! Energy -10");
            energy -= 10;
        }

        // ZONE 2: Dark Cave
        System.out.println("\n=> Zone 2: Dark Cave");
        System.out.println("To pass the cave, you have to climb the steps that are equal to the meaning of life...");
        System.out.print("How many steps do you need to climb? ➤ ");
        int steps = player.nextInt();
        if (steps == 42) {
            for (int i = 1; i <= 42; i++) {
            System.out.println("Step " + i + "...");
            }
            System.out.println("=> Correct! You climbed the steps! Energy -10, Bonus +5");
            energy -= 10;
            bonus += 10;
        } else {
            for (int i = 1; i <= steps; i++) {
            System.out.println("🔦 Step " + i + "...");
            }
            System.out.println("=> Wrong answer! You fell down! Energy -10");
            energy -= 20;
        }

        // ZONE 3: Broken Bridge
        System.out.println("\n=> Zone 3: Broken Bridge");
        System.out.print("There are two ways: [L]eft and [R]ight. Which do you choose? ➤ ");
        char yol = player.next().toUpperCase().charAt(0);

        if (yol == 'L') {
            System.out.println("=> Safe way! Bonus +10");
            bonus += 10;
        } else {
            System.out.println("=> You fell into a trap! energy -20");
            energy -= 20;
        }

        // ZONE 4: Volcano Gates
        System.out.println("\n=> Zone 4: Volcano Gates");
        int qapi;
        do {
            System.out.print("There are 3 doors: 1, 2, and 3. Find the correct door! ➤ ");
            qapi = player.nextInt();

            switch (qapi) {
                case 1:
                    System.out.println("=> Door 1: An empty room. energy -5");
                    energy -= 5;
                    break;
                case 2:
                    System.out.println("=> Door 2: Lava flow! energy -15");
                    energy -= 15;
                    break;
                case 3:
                    System.out.println("=> Door 3: Emergency rescue helicopter!");
                    bonus += 15;
                    break;
                default:
                    System.out.println("=> Wrong choice! No such door.");
                    energy -= 5;
            }
        } while (qapi!= 3);

        // RESULT
        System.out.println("\n=> Game Over! " + playerName);
        System.out.println("=> Energy: " + energy);
        System.out.println("=> Bonus: " + bonus); 

        if (energy > 50 && bonus >= 30) {
            System.out.println("=> GREAT ESCAPE! You survived like a hero!");
        } else if (energy > 0) {
            System.out.println("=> Weak escape. But you survived!");
        } else {
            System.out.println("=> Unfortunately, the volcano got you...");
        }

        System.out.println("\nThank you for playing, " + playerName + "!");

        player.close();
    }
}