import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Write something:");
        String userInput = scanner.nextLine(); // This line is not used for processing but to match the sample output format
        System.out.println("True or false?");
        boolean boolValue = Boolean.valueOf(scanner.nextLine());
        System.out.println(boolValue);
    }
}
