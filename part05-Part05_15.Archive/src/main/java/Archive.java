import java.util.ArrayList;
import java.util.Scanner;

public class Archive {
    private String identifier;
    private String name;

    public Archive(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Archive)) {
            return false;
        }
        Archive other = (Archive) obj;
        return this.identifier.equals(other.identifier);
    }

    @Override
    public int hashCode() {
        return this.identifier.hashCode();
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Archive newArchive = new Archive(identifier, name);
            if (!archives.contains(newArchive)) {
                archives.add(newArchive);
            }
        }

        System.out.println("==Items==");
        for (Archive archive : archives) {
            System.out.println(archive);
        }
    }
}

