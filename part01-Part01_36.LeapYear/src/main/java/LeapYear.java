import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a year
        System.out.println("Give a year:");
        int year = Integer.valueOf(scanner.nextLine());

        // Check if the year is a leap year
        if (year % 4 != 0) {
            System.out.println("The year is not a leap year.");
        } else if (year % 100 != 0) {
            System.out.println("The year is a leap year.");
        } else if (year % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
