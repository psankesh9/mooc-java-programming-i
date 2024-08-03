import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the lower limit
        System.out.println("Where from?");
        int whereFrom = Integer.valueOf(scanner.nextLine());

        // Ask for the upper limit
        System.out.println("Where to?");
        int whereTo = Integer.valueOf(scanner.nextLine());

        // Print numbers from the given lower limit to the upper limit
        for (int i = whereFrom; i <= whereTo; i++) {
            System.out.println(i);
        }
    }
}
