import java.util.Scanner;

public class FindCustomer {

    static int[] customerIds = { 101, 102, 103, 104, 105 };

    public static void findCustomer(int[] customerIds) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Musteri ID-ni daxil edin(): ");
        int id = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < customerIds.length; i++) {
            if (customerIds[i] == id) {
                System.out.println("Musteri tapildi: " + id);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Musteri tapilmadi.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        findCustomer(customerIds);
    }
}
