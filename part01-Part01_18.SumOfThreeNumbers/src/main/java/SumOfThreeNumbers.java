import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the first number
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        // Ask for the second number
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        // Ask for the third number
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());

        // Calculate the sum of the numbers
        int sum = first + second + third;

        // Print the result
        System.out.println("The sum of the numbers is " + sum);
    }
}
