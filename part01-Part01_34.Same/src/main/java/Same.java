import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first string
        System.out.println("Enter the first string:");
        String first = scanner.nextLine();

        // Prompt the user for the second string
        System.out.println("Enter the second string:");
        String second = scanner.nextLine();

        // Check if the strings are the same
        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
