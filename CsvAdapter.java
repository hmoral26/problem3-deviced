// Adapter. Turns CSV lines into Product objects.
// Also helps print the raw CSV and search for a product by name.
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class CsvAdapter {
    private String filename;

    public CsvAdapter(String filename) {
        this.filename = filename;
    }

    // prints the raw CSV file
    public void printCsvContents() {
        System.out.println("--- File data ---");
        try {
            Scanner sc = new Scanner(new File(filename));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Could not read file");
        }
        System.out.println();
    }

    // looks for a product by name and returns it if found
    public Product findProduct(String searchName) {
        System.out.println("Searching for: " + searchName);
        try {
            Scanner sc = new Scanner(new File(filename));
            if (sc.hasNextLine()) sc.nextLine(); // skip header
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println("Reading: " + line);
                String[] parts = line.split(",");
                if (parts.length >= 1) {
                    String name = parts[0].trim();
                    System.out.println("Name in file: " + name);
                    if (name.equalsIgnoreCase(searchName)) {
                        System.out.println("Match found: " + name);
                        System.out.println();
                        Product p = createProductFromParts(parts);
                        sc.close();
                        return p;
                    }
                }
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
        System.out.println();
        return null;
    }

    // turns one CSV line into a Product
    private Product createProductFromParts(String[] parts) {
        String name = parts[0].trim();
        Product p;
        if (name.toLowerCase().contains("phone") || name.toLowerCase().contains("smartphone")) {
            p = new Smartphone(name);
        } else {
            p = new Laptop(name);
        }
        if (parts.length > 1) p.setProcessor(parts[1].trim());
        if (parts.length > 2) p.setRam(parts[2].trim());
        if (parts.length > 3) p.setStorage(parts[3].trim());
        if (parts.length > 4) p.setGraphics(parts[4].trim());
        if (parts.length > 5) p.setOs(parts[5].trim());
        if (parts.length > 6) {
            try { p.setPrice(Double.parseDouble(parts[6].trim())); } catch (Exception e) {}
        }
        return p;
    }
}
