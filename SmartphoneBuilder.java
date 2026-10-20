// Concrete builder for smartphones.
// Implements ProductBuilder and builds a Smartphone step by step.
public class SmartphoneBuilder implements ProductBuilder {
    private Smartphone phone;

    public SmartphoneBuilder() {
        phone = new Smartphone("Custom Smartphone");
    }

    public ProductBuilder setName(String name) {
        phone.name = name;
        return this;
    }

    public ProductBuilder setProcessor(String processor) {
        phone.setProcessor(processor);
        return this;
    }

    public ProductBuilder setRam(String ram) {
        phone.setRam(ram);
        return this;
    }

    public ProductBuilder setStorage(String storage) {
        phone.setStorage(storage);
        return this;
    }

    public ProductBuilder setGraphics(String graphics) {
        phone.setGraphics(graphics);
        return this;
    }

    public ProductBuilder setOs(String os) {
        phone.setOs(os);
        return this;
    }

    public ProductBuilder setPrice(double price) {
        phone.setPrice(price);
        return this;
    }

    public Product build() {
        return phone;
    }
}
