import java.util.HashMap;
import java.util.Map;

public class Warehouse {

    private final Map<Product, Integer> products;

    public Warehouse() {
        products = new HashMap<>();
    }

    public void addProduct(Product product, Integer quantity) {
        products.put(product, quantity);
    }

    public void addStockToProduct(Product product, int quantity) {
        Integer currentQuantity = products.get(product);
        products.put(product, currentQuantity + quantity);
    }

    public void reduceStock(Product product, int quantity) {
        Integer currentQuantity = products.get(product);
        if (currentQuantity >= quantity) {
            products.put(product, currentQuantity + quantity);
        } else {
            System.out.println("Product quantity cannot be negative.");
        }
    }

    public void addProductToShop(Product product, int quantity) {
        Integer currentQuantity = products.get(product);
        if (currentQuantity != null) {
            addProduct(product, currentQuantity + quantity);
        } else {
            addProduct(product, quantity);
        }

    }

    public void sellProduct(Product product, int quantity) {
        Integer currentQuantity = products.get(product);
        if (currentQuantity != null && currentQuantity >= quantity) {
            products.put(product, currentQuantity - quantity);
            System.out.println("Sold.");
        } else {
            System.out.println("Insufficient quantity to sell.");
        }
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

}