// Test class. Builds a custom product and loads a product from the CSV.
public class ProductTest {
    public static void main(String[] args) {
        CsvAdapter adapter = new CsvAdapter("products.csv");

        // show the file first
        adapter.printCsvContents();

        // build a custom laptop
        ProductBuilder laptopBuilder = new LaptopBuilder();
        Product customLaptop = laptopBuilder
                .setName("My Laptop")
                .setProcessor("Intel i5")
                .setRam("8")
                .setStorage("256GB")
                .setGraphics("Integrated")
                .setOs("Windows 10")
                .setPrice(800.0)
                .build();

        System.out.println("Built product:");
        customLaptop.printDetails();

        // find a product from the file
        Product csvProduct = adapter.findProduct("Smartphone Model X");
        if (csvProduct != null) {
            System.out.println("Product from file:");
            csvProduct.printDetails();
        }
    }
}
