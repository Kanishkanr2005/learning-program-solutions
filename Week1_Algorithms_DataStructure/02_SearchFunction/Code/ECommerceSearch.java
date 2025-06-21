import java.util.Arrays;
import java.util.Comparator;

public class ECommerceSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.getProductId() == targetId) {
                return p;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int targetId) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (products[mid].getProductId() == targetId) {
                return products[mid];
            } else if (products[mid].getProductId() < targetId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Smartphone", "Electronics"),
            new Product(105, "Laptop", "Electronics"),
            new Product(103, "Headphones", "Accessories"),
            new Product(102, "Keyboard", "Accessories"),
            new Product(104, "Monitor", "Electronics")
        };
        int targetId = 103;

        // Linear Search
        Product foundLinear = linearSearch(products, targetId);
        System.out.println("\nPerforming Linear Search:");
        System.out.println(foundLinear != null 
            ? "Found: " + foundLinear 
            : "Product with ID " + targetId + " not found");

        // Binary Search
        // First sort the array by productId
        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));

        Product foundBinary = binarySearch(products, targetId);
        System.out.println("\nPerforming Binary Search:");
        System.out.println(foundBinary != null 
            ? "Found: " + foundBinary 
            : "Product with ID " + targetId + " not found");
    }
}
