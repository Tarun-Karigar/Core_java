import java.util.Scanner;

public class ShoppingIndex {
    public static void main(String[] args) {
        String[] shoppingList = {"Milk", "Eggs", "Bread", "Butter", "Cheese"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index of the item you want to fetch (0 to " + (shoppingList.length - 1) + "): ");

        try {
            int index = scanner.nextInt();
            System.out.println("Item at index " + index + ": " + shoppingList[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter a number between 0 and " + (shoppingList.length - 1));
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }

        scanner.close();
    }
}
