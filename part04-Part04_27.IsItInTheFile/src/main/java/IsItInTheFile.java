import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        System.out.println("Search for:");
        String searchString = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            boolean found = false;
            while (fileScanner.hasNextLine()) {
                if (fileScanner.nextLine().contains(searchString)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + fileName + " failed.");
        }
    }
}

