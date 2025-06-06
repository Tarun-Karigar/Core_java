import java.util.Scanner;

public class SlopeException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();

        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();

        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        try {
            double slope = (y2 - y1) / (x2 - x1);
            System.out.println("Slope: " + slope);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero (x1 and x2 are equal).");
        }

        sc.close();
    }
}
