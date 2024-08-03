import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for an integer
        int number = Integer.valueOf(scanner.nextLine());

        // Print numbers from the given number to 100
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
