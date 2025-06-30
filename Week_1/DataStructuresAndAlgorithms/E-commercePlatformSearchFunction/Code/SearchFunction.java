import java.util.Arrays;
import java.util.Comparator;
public class SearchFunction {
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(name)) return p;
        }
        return null;
    }
    public static Product binarySearch(Product[] products, String name) {
        int low = 0, high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].name.compareToIgnoreCase(name);
            if (cmp == 0) return products[mid];
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Laptop", "Electronics"),
            new Product(2, "Shoes", "Fashion"),
            new Product(3, "Book", "Education")
        };
        Product result = linearSearch(products, "Shoes");
        System.out.println("Linear search found: " + (result != null ? result.name : "Not found"));
        Arrays.sort(products, Comparator.comparing(p -> p.name));
        result = binarySearch(products, "Laptop");
        System.out.println("Binary search found: " + (result != null ? result.name : "Not found"));
    }
}