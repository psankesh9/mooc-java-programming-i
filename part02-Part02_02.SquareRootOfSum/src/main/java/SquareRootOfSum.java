import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for two integers
        int first = Integer.valueOf(scanner.nextLine());
        int second = Integer.valueOf(scanner.nextLine());

        // Calculate the square root of the sum
        int sum = first + second;
        double squareRoot = Math.sqrt(sum);

        // Print the square root
        System.out.println(squareRoot);
    }
}
