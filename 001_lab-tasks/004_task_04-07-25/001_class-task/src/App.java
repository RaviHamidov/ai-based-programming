public class App {
    public static void main(String[] args) throws Exception {
        // Task 001 - Write a loop that prints numbers from 1 to 20, each on a new line
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }
        // Task 002 - Create a loop that prints all even numbers between 1 and 50.
        for (int j = 0; j <= 50; j++) {
            if (j % 2 != 0) {
                System.out.println(j);
            } else {
                continue;
            }
        }
        // Task 003 - Write a loop that prints the message “I am learning Java” 10 time
        for (int k = 0; k <= 10; k++) {
            System.out.println("I am learning Java");
        }
    }
}
