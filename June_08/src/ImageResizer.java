import java.util.Scanner;

public class ImageResizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter new width: ");
            int width = scanner.nextInt();
            System.out.print("Enter new height: ");
            int height = scanner.nextInt();

            if (width < 0 || height < 0) {
                throw new IllegalArgumentException("Width and height must be non-negative.");
            }

            System.out.println("Image resized to " + width + "x" + height);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers.");
        }

        scanner.close();
    }
}

