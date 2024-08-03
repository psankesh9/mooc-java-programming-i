public class AdvancedAstrology {

    public static void main(String[] args) {
        printTriangle(3);
        System.out.println();
        christmasTree(4);
        System.out.println();
        christmasTree(10);
    }

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(2 * i - 1);
            System.out.println(); // print a newline character at the end of each line
        }
    }

    public static void christmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars(2 * i - 1);
            System.out.println(); // print a newline character at the end of each line
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
            System.out.println(); // print a newline character at the end of each line
        }
    }
}
