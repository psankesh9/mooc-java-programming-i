import java.util.Scanner;

public class AverageOfThreeNumbers {

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

        // Calculate the average of the numbers
        double average = (first + second + third) / 3.0;

        // Print the average
        System.out.println("The average is " + average);
    }
}
