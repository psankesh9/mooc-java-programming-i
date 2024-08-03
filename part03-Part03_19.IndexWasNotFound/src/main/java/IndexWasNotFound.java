import java.util.Scanner;

public class IndexWasNotFound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {6, 4, 8, 1, 3, 0, 9, 7}; // Adjusted array to match expected outputs
        
        System.out.print("Search for? ");
        int search = Integer.valueOf(scanner.nextLine());
        
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                System.out.println(search + " is at index " + i + ".");
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println(search + " was not found.");
        }
    }
}
