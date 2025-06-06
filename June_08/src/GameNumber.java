import java.util.InputMismatchException;
import java.util.Scanner;

public class GameNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        System.out.println("Game Menu:");
        System.out.println("1. Start Game");
        System.out.println("2. Load Game");
        System.out.println("3. Help");
        System.out.println("4. Exit");

        System.out.print("Choose an option (1-4): ");

        try {
            option = scanner.nextInt();

            if (option >= 1 && option <= 4) {
                System.out.println("You selected option " + option);
            } else {
                System.out.println("Invalid option. Please select between 1 and 4.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a number.");
        }

        scanner.close();
    }
}
