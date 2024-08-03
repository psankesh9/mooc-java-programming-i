import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int begin = 0;
        int end = books.size() - 1;

        while (begin <= end) {
            int middle = (begin + end) / 2;
            int middleId = books.get(middle).getId();

            if (middleId == searchedId) {
                return middle;
            } else if (middleId < searchedId) {
                begin = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Book A"));
        books.add(new Book(2, "Book B"));
        books.add(new Book(3, "Book C"));
        books.add(new Book(4, "Book D"));
        books.add(new Book(5, "Book E"));

        System.out.println("Linear search:");
        System.out.println(linearSearch(books, 3)); // Output: 2
        System.out.println(linearSearch(books, 6)); // Output: -1

        Collections.sort(books, (a, b) -> a.getId() - b.getId());

        System.out.println("Binary search:");
        System.out.println(binarySearch(books, 3)); // Output: 2
        System.out.println(binarySearch(books, 6)); // Output: -1
    }
}
