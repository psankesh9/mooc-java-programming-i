import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking for a string
        System.out.println("Give a string:");
        String userInputString = scanner.nextLine();
        
        // Asking for an integer
        System.out.println("Give an integer:");
        int userInputInt = Integer.valueOf(scanner.nextLine());

        // Asking for a double
        System.out.println("Give a double:");
        double userInputDouble = Double.valueOf(scanner.nextLine());

        // Asking for a boolean
        System.out.println("Give a boolean:");
        boolean userInputBoolean = Boolean.valueOf(scanner.nextLine());

        // Printing the values given by the user
        System.out.println("You gave the string " + userInputString);
        System.out.println("You gave the integer " + userInputInt);
        System.out.println("You gave the double " + userInputDouble);
        System.out.println("You gave the boolean " + userInputBoolean);
    }
}
