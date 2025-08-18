import javax.naming.InvalidNameException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {

//        try (Scanner sc = new Scanner(System.in))  {
//            System.out.print("Birinci ededi daxil edin:");
//            int num1 = Integer.parseInt(sc.nextLine());
//
//            System.out.print("Ikinci ededi daxil edin:");
//            int num2 = Integer.parseInt(sc.nextLine());
//
//            int result = num1 / num2;
//            System.out.println("Netice: " + result);
//        } catch (NumberFormatException e) {
//            System.out.println("Xeta: yalniz tam eded daxil et");
//        } catch (ArithmeticException e) {
//            System.out.println("Xeta: Sifira bolmek olmaz");
//        }

        // ------------------------------------------------------

//        try (Scanner sc = new Scanner(System.in))  {
//            System.out.println("Birinci ad daxil edin:");
//            String input = sc.nextLine();
//
//            if (input.length() < 3) {
//                System.out.println(input);
//                throw new InvalidNameExceptionR("Xeta min 3 herf olmalidir.");
//            }
//        } catch (InvalidNameExceptionR e) {
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.print("program sonduruldu");
//        }

        // ------------------------------------------------------



        // Custom Exception
        class InvalidAgeException extends Exception {
            public InvalidAgeException(String message) {
                super(message);
            }
        }

        class AgeChecker {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    try {
                        System.out.print("Yaşınızı daxil edin: ");
                        String input = scanner.nextLine();
                        int age = Integer.parseInt(input);

                        if (age < 0 || age > 120) {
                            throw new InvalidAgeException("Xəta: Yaş 0 ilə 120 arasında olmalıdır!");
                        }

                        System.out.println("All done !!!");
                        break; // düzgün yaş daxil ediləndə çıxır

                    } catch (NumberFormatException e) {
                        System.out.println("Xəta: Yalnız tam ədəd daxil etməlisiniz!");
                    } catch (InvalidAgeException e) {
                        System.out.println(e.getMessage());
                    }
                }

                scanner.close();
            }
        }

    }
}
