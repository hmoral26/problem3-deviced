// Concrete builder for laptops.
// Implements ProductBuilder and builds a Laptop step by step.
public class LaptopBuilder implements ProductBuilder {
    private Laptop laptop;

    public LaptopBuilder() {
        laptop = new Laptop("Custom Laptop");
    }

    public ProductBuilder setName(String name) {
        laptop.name = name;
        return this;
    }

    public ProductBuilder setProcessor(String processor) {
        laptop.setProcessor(processor);
        return this;
    }

    public ProductBuilder setRam(String ram) {
        laptop.setRam(ram);
        return this;
    }

    public ProductBuilder setStorage(String storage) {
        laptop.setStorage(storage);
        return this;
    }

    public ProductBuilder setGraphics(String graphics) {
        laptop.setGraphics(graphics);
        return this;
    }

    public ProductBuilder setOs(String os) {
        laptop.setOs(os);
        return this;
    }

    public ProductBuilder setPrice(double price) {
        laptop.setPrice(price);
        return this;
    }

    public Product build() {
        return laptop;
    }
}
