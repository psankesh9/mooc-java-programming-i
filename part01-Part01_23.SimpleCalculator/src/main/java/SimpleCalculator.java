import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the first number
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        // Ask for the second number
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        // Calculate and print the sum
        int sum = first + second;
        System.out.println(first + " + " + second + " = " + sum);

        // Calculate and print the difference
        int difference = first - second;
        System.out.println(first + " - " + second + " = " + difference);

        // Calculate and print the product
        int product = first * second;
        System.out.println(first + " * " + second + " = " + product);

        // Calculate and print the quotient
        double quotient = (double) first / second;
        System.out.println(first + " / " + second + " = " + quotient);
    }
}
