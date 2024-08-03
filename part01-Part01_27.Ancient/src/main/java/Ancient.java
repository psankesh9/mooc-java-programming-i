import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the year
        System.out.println("Give a year:");
        int year = Integer.valueOf(scanner.nextLine());

        // Check if the year is smaller than 2015
        if (year < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
