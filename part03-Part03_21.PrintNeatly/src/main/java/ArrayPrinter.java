public class ArrayPrinter {
    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println(); // To move to the next line after printing all numbers
    }
    
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array); // Output should be 5, 1, 3, 4, 2
    }
}
