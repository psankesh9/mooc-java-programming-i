import java.util.ArrayList;
import java.util.Scanner;

public class Items {
    private ArrayList<Item> itemsList;

    public Items() {
        this.itemsList = new ArrayList<>();
    }

    public void addItem(String name) {
        if (!name.isEmpty()) {
            this.itemsList.add(new Item(name));
        }
    }

    public void printItems() {
        for (Item item : itemsList) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Items items = new Items();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            items.addItem(name);
        }

        items.printItems();
    }
}
