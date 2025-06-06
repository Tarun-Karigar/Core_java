import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        String input = scanner.nextLine();

        try {
            double celsius = Double.parseDouble(input);
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid temperature input.");
        } finally {
            scanner.close();
        }
    }
}
