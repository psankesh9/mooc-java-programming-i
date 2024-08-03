import java.util.ArrayList;

public class GradeStatistics {

    public static double calculateAverage(ArrayList<Integer> points) {
        int sum = 0;
        for (int point : points) {
            sum += point;
        }
        return 1.0 * sum / points.size();
    }

    public static double calculatePassingAverage(ArrayList<Integer> points) {
        int sum = 0;
        int count = 0;
        for (int point : points) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }
        if (count == 0) {
            return 0.0;
        }
        return 1.0 * sum / count;
    }

    public static double calculatePassPercentage(ArrayList<Integer> points) {
        int count = 0;
        for (int point : points) {
            if (point >= 50) {
                count++;
            }
        }
        return 100.0 * count / points.size();
    }

    public static void printGradeDistribution(ArrayList<Integer> points) {
        int[] grades = new int[6];

        for (int point : points) {
            if (point < 50) {
                grades[0]++;
            } else if (point < 60) {
                grades[1]++;
            } else if (point < 70) {
                grades[2]++;
            } else if (point < 80) {
                grades[3]++;
            } else if (point < 90) {
                grades[4]++;
            } else {
                grades[5]++;
            }
        }

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
