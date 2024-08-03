public class Product {

    private String name;
    private String location;
    private int weight;

    // Existing constructor
    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    // New constructor 1: Name only
    public Product(String name) {
        this(name, "shelf", 1);
    }

    // New constructor 2: Name and location
    public Product(String name, String location) {
        this(name, location, 1);
    }

    // New constructor 3: Name and weight
    public Product(String name, int weight) {
        this(name, "shelf", weight);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }

    public static void main(String[] args) {
        Product tapeMeasure = new Product("Tape measure");
        Product plaster = new Product("Plaster", "home improvement section");
        Product tyre = new Product("Tyre", 5);

        System.out.println(tapeMeasure);
        System.out.println(plaster);
        System.out.println(tyre);
    }
}
