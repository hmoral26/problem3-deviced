// Abstract product. Laptop and Smartphone both extend this.
// Holds the common fields and the print method.
public abstract class Product {
    protected String name;
    protected String processor;
    protected String ram;
    protected String storage;
    protected String graphics;
    protected String os;
    protected double price;

    public Product(String name) {
        this.name = name;
        this.price = 800.0;
    }

    public String getName() { return name; }
    public String getProcessor() { return processor; }
    public String getRam() { return ram; }
    public String getStorage() { return storage; }
    public String getGraphics() { return graphics; }
    public String getOs() { return os; }
    public double getPrice() { return price; }

    public void setProcessor(String processor) { this.processor = processor; }
    public void setRam(String ram) { this.ram = ram; }
    public void setStorage(String storage) { this.storage = storage; }
    public void setGraphics(String graphics) { this.graphics = graphics; }
    public void setOs(String os) { this.os = os; }
    public void setPrice(double price) { this.price = price; }

    // prints the product details in a simple list
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("CPU: " + processor);
        System.out.println("Memory: " + ram);
        System.out.println("Drive: " + storage);
        System.out.println("GPU: " + graphics);
        System.out.println("System: " + os);
        System.out.println("Cost: $" + price);
        System.out.println();
    }
}
