import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the speed
        System.out.println("Give speed:");
        int speed = Integer.valueOf(scanner.nextLine());

        // Check if the speed is greater than 120
        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}

