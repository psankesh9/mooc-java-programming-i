import java.util.ArrayList;

public class Stack {
    private ArrayList<String> values;

    public Stack() {
        this.values = new ArrayList<>();
    }

    public boolean isEmpty() {
        return this.values.isEmpty();
    }

    public void add(String value) {
        this.values.add(value);
    }

    public ArrayList<String> values() {
        return this.values;
    }

    public String take() {
        if (this.isEmpty()) {
            return null;
        }
        return this.values.remove(this.values.size() - 1);
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);
        
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");
        
        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
    }
}
