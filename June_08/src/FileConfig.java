import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileConfig {
    public static void main(String[] args) {
        String mainFile = "main_config.txt";
        String backupFile = "backup_config.txt";

        try {
            System.out.println("Trying to load main config...");
            loadFile(mainFile);
        } catch (FileNotFoundException e) {
            System.out.println("Main config not found. Attempting to load backup config...");

            try {
                loadFile(backupFile);
            } catch (FileNotFoundException ex) {
                System.out.println("Backup config also not found. Cannot proceed.");
            }
        }
    }

    public static void loadFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        System.out.println("Loaded config: " + filename);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
