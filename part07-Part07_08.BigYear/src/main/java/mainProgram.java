import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdDatabase database = new BirdDatabase();

        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();

            if (command.equalsIgnoreCase("Quit")) {
                break;
            }

            switch (command.toLowerCase()) {
                case "add":
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Name in Latin: ");
                    String latinName = scan.nextLine();
                    database.addBird(name, latinName);
                    break;
                case "observation":
                    System.out.print("Bird? ");
                    String birdName = scan.nextLine();
                    database.addObservation(birdName);
                    break;
                case "all":
                    database.printAllBirds();
                    break;
                case "one":
                    System.out.print("Bird? ");
                    String oneBirdName = scan.nextLine();
                    database.printOneBird(oneBirdName);
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
