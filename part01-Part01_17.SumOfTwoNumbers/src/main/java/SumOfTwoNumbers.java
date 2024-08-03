import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the first number
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        // Ask for the second number
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        // Calculate the sum of the numbers
        int sum = first + second;

        // Print the result
        System.out.println("The sum of the numbers is " + sum);
    }
}
