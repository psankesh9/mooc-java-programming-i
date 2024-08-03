import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for a number
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        // Calculate the factorial
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the factorial
        System.out.println("Factorial: " + factorial);
    }
}
