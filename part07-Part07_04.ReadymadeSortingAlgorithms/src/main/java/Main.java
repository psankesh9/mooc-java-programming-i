import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

    public static void main(String[] args) {
        int[] intArray = {3, 5, 1, 4, 2};
        String[] stringArray = {"Charlie", "Alice", "Bob", "Eve", "David"};

        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(3, 5, 1, 4, 2));
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("Charlie", "Alice", "Bob", "Eve", "David"));

        sort(intArray);
        sort(stringArray);
        sortIntegers(intList);
        sortStrings(stringList);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(stringArray));
        System.out.println(intList);
        System.out.println(stringList);
    }
}
