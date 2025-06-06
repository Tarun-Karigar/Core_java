import java.util.Scanner;

public class CoordinateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read user input for coordinates
            System.out.print("Enter X coordinate: ");
            String xInput = scanner.nextLine();

            System.out.print("Enter Y coordinate: ");
            String yInput = scanner.nextLine();

            double x = 0, y = 0;

            try {
                x = Double.parseDouble(xInput);
                if (x < -180 || x > 180) {
                    throw new IllegalArgumentException("X must be between -180 and 180");
                }
                System.out.println("Valid X: " + x);
            } catch (Exception e) {
                System.out.println("Invalid X coordinate: " + e.getMessage());
            }

            try {
                y = Double.parseDouble(yInput);
                if (y < -90 || y > 90) {
                    throw new IllegalArgumentException("Y must be between -90 and 90");
                }
                System.out.println("Valid Y: " + y);
            } catch (Exception e) {
                System.out.println("Invalid Y coordinate: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Unexpected error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
