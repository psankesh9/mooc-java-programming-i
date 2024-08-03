import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of days
        System.out.println("How many days would you like to convert to seconds?");
        int numberOfDays = Integer.valueOf(scanner.nextLine());

        // Calculate the number of seconds in the given number of days
        int secondsInADay = 86400;
        int totalSeconds = numberOfDays * secondsInADay;

        // Print the result
        System.out.println(totalSeconds);
    }
}
