import java.util.ArrayList;

public class IoobProgram {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.get(10); // This will cause an IndexOutOfBoundsException
    }
}
