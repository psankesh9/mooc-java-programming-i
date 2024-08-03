import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 3, 5, 7, 9};
        
        // Print the array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        // Get two indices from the user
        System.out.println("Give two indices to swap:");
        int index1 = Integer.valueOf(scanner.nextLine());
        int index2 = Integer.valueOf(scanner.nextLine());
        
        // Swap the values at the two indices
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        
        // Print the array again
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
