import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        // Check if the number is exactly 1984
        if (number == 1984) {
            System.out.println("Orwell");
        }
    }
}
