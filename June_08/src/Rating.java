import java.util.InputMismatchException;
import java.util.Scanner;

public class Rating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rating = 0;
        boolean valid = false;

        while (!valid) {
            System.out.print("Please enter your rating (1 to 5): ");
            try {
                rating = scanner.nextInt();

                if (rating >= 1 && rating <= 5) {
                    valid = true;
                } else {
                    System.out.println("Error: Rating must be between 1 and 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        System.out.println("Thank you! You rated: " + rating);
        scanner.close();
    }
}
