import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    @Override
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " + this.name + " is empty.";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("The collection ").append(this.name).append(" has ").append(this.elements.size()).append(this.elements.size() == 1 ? " element:" : " elements:").append("\n");

        for (int i = 0; i < this.elements.size(); i++) {
            sb.append(this.elements.get(i));
            if (i < this.elements.size() - 1) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        SimpleCollection s = new SimpleCollection("alphabet");
        System.out.println(s);
        System.out.println();
        s.add("a");
        System.out.println(s);
        System.out.println();
        s.add("b");
        System.out.println(s);
        System.out.println();
        s.add("c");
        System.out.println(s);
    }
}
