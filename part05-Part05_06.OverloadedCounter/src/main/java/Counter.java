public class Counter {
    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value++;
    }

    public void decrease() {
        this.value--;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            this.value -= decreaseBy;
        }
    }

    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(5);

        System.out.println("Initial value of counter1: " + counter1.value());
        System.out.println("Initial value of counter2: " + counter2.value());

        counter1.increase();
        counter2.decrease();

        System.out.println("Value of counter1 after increase: " + counter1.value());
        System.out.println("Value of counter2 after decrease: " + counter2.value());

        counter1.increase(10);
        counter2.decrease(3);

        System.out.println("Value of counter1 after increasing by 10: " + counter1.value());
        System.out.println("Value of counter2 after decreasing by 3: " + counter2.value());
    }
}
