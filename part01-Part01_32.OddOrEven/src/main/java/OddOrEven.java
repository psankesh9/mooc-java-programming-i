import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number
        System.out.println("Give a number:");
        int number = Integer.valueOf(scanner.nextLine());

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
    }
}
