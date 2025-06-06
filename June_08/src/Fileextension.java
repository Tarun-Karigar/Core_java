import java.util.Scanner;

public class Fileextension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a File name ");
        String file = sc.nextLine();

        int i = file.lastIndexOf('.');
        if (i != -1) {
            System.out.println(file.substring(i));
        } else {
            System.out.println("No extension found");
        }
        sc.close();
    }
}
