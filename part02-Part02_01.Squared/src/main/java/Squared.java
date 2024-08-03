import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for an integer
        int number = Integer.valueOf(scanner.nextLine());

        // Calculate and print the square of the number
        int square = number * number;
        System.out.println(square);
    }
}
