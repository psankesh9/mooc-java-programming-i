public class Printer {
    public static void printArrayInStars(int[] array) {
        for (int number : array) {
            for (int i = 0; i < number; i++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after printing stars for the current number
        }
    }
    
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
}
