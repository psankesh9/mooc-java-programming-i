import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for an integer
        int number = Integer.valueOf(scanner.nextLine());

        // Calculate and print the absolute value
        if (number < 0) {
            number = number * -1;
        }
        System.out.println(number);
    }
}
