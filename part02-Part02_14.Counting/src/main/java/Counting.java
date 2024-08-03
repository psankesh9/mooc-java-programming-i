import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for an integer
        int number = Integer.valueOf(scanner.nextLine());

        // Print numbers from 0 to the given number
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
    }
}
