import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the number you want to guess :");
            int usernum = scanner.nextInt();

            System.out.println("The entered number is: " + usernum);

            Random random = new Random();
            int randomNumber = random.nextInt(100);

            System.out.println("The random number generated is: " + randomNumber);


            if (usernum == randomNumber) {
                System.out.println("The user-entered number is equal to the random number generated.");
                System.out.println("Congratulations! You won.");
            } else {
                System.out.println("The entered number is wrong.");
            }
        } catch (InputMismatchException exception) {
            System.out.println("wrong num enter a valid integer number.");
        }
        finally {
            scanner.close();
        }
    }
}
