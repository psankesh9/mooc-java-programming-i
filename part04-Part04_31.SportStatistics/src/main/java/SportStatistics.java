import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scanner.nextLine();

        System.out.println("Team:");
        String teamName = scanner.nextLine();

        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.parseInt(parts[2]);
                int visitingPoints = Integer.parseInt(parts[3]);

                if (homeTeam.equals(teamName) || visitingTeam.equals(teamName)) {
                    gamesPlayed++;
                    if ((homeTeam.equals(teamName) && homePoints > visitingPoints) ||
                        (visitingTeam.equals(teamName) && visitingPoints > homePoints)) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
