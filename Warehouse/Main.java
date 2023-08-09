public class Main{
	public static void main(String[] args){

		Product product1 = new Product("T-Shirt", ProductType.CLOTHING);
		Product product2 = new Product("Chocolate", ProductType.GROCERY);
		Product product3 = new Product("Shampoo", ProductType.HOUSEHOLD);

		Product product4 = new Product("Bread", ProductType.GROCERY);
		Product product5 = new Product("Cheese", ProductType.GROCERY);
		Product product6 = new Product("Charger", ProductType.HOUSEHOLD);

		Warehouse warehouse = new Warehouse();
		warehouse.addProduct(product1, 9);
		warehouse.addProduct(product2, 15);
		warehouse.addProduct(product3, 4);
		warehouse.addProduct(product4, 127);
		warehouse.addProduct(product5, 12);
		warehouse.addProduct(product6, 3);

		Shop shop1 = new Shop("Shop CLOTHING_SHOP", ShopType.CLOTHING_SHOP, warehouse);

		Shop shop2 = new Shop("Shop GROCERY", ShopType.GROCERY, warehouse);
		Shop shop3 = new Shop("Shop HOUSEHOLD_SHOP", ShopType.HOUSEHOLD_SHOP, warehouse);

		shop1.sellProduct(product1, 800);
		warehouse.addStockToProduct(product1, 10000);
		shop1.sellProduct(product1, 800);
		warehouse.reduceStock(product1, 10000);

		shop2.sellProduct(product6, 10);


	}
}