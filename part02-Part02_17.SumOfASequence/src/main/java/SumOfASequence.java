import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the last number
        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scanner.nextLine());

        // Calculate the sum
        int sum = 0;
        for (int i = 1; i <= lastNumber; i++) {
            sum += i;
        }

        // Print the sum
        System.out.println("The sum is " + sum);
    }
}
