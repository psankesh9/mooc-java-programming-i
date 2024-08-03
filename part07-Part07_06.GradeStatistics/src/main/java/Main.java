import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<>();

        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            if (point == -1) {
                break;
            }
            if (point >= 0 && point <= 100) {
                points.add(point);
            }
        }

        System.out.println("Point average (all): " + GradeStatistics.calculateAverage(points));
        double passingAverage = GradeStatistics.calculatePassingAverage(points);
        if (passingAverage == 0.0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passingAverage);
        }
        System.out.println("Pass percentage: " + GradeStatistics.calculatePassPercentage(points));
        GradeStatistics.printGradeDistribution(points);
    }
}
