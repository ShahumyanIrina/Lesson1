import java.util.HashMap;
import java.util.Map;

public class Shop {

    private final String id;
    private final String name;
    private final ShopType type;
//    private final Map<Product, Integer> productsInShop;
    private final Warehouse warehouse;

    public Shop(String name, ShopType type, Warehouse warehouse) {
        this.id = generateUniqueId(name);
        this.name = name;
        this.type = type;
//        this.productsInShop = new HashMap<>();
        this.warehouse = warehouse;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ShopType getType() {
        return type;
    }

//    public Map<Product, Integer> getProductsInShop() {
//        return productsInShop;
//    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

//    public void addProduct(Product product, int quantity) {
//        productsInShop.put(product, quantity);
//    }

    private String generateUniqueId(String shopId) {
        return "SHOP-" + shopId;
    }

//    public void addProductToShop(Product product, int quantity) {
//        Integer currentQuantity = productsInShop.get(product);
//        if (currentQuantity != null) {
//            addProduct(product, currentQuantity + quantity);
//        } else {
//            addProduct(product, quantity);
//        }
//
//    }

    public void sellProduct(Product product, int quantity) {
        if (product.getType() == ProductType.GROCERY && this.type == ShopType.GROCERY) {
            warehouse.sellProduct(product, quantity);
        } else if (product.getType() == ProductType.HOUSEHOLD && this.type == ShopType.HOUSEHOLD_SHOP) {
            warehouse.sellProduct(product, quantity);
        } else if (product.getType() == ProductType.CLOTHING && this.type == ShopType.CLOTHING_SHOP) {
            warehouse.sellProduct(product, quantity);
        } else {
            System.out.println("You cannot buy " + product.getType() + " type product from " + this.type);
        }
    }

//    public void removeProduct(Product product) {
//        productsInShop.remove(product);
//    }

}