// Builder interface.
// Concrete builders (LaptopBuilder, SmartphoneBuilder) implement this.
public interface ProductBuilder {
    ProductBuilder setName(String name);
    ProductBuilder setProcessor(String processor);
    ProductBuilder setRam(String ram);
    ProductBuilder setStorage(String storage);
    ProductBuilder setGraphics(String graphics);
    ProductBuilder setOs(String os);
    ProductBuilder setPrice(double price);
    Product build();
}
