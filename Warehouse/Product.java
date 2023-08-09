import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Product {
	private final String id;
	private final String prefix;
	private final String name;
	private final ProductType type;
	private static int counter = 0;

	public Product(String name, ProductType type){
		this.id = generateUniqueId(name);
		this.name = name;
		this.type = type;
		this.prefix = generatePrefix();
	}

	public String getId() {
		return id;
	}

	public String getName(){
		return name;
	}

	public ProductType getType(){
		return type;
	}

	public String getPrefix(){
		return "PR";
	}
	 
	private String generateUniqueId(String productId){
		return "PR-"+ productId;
	}

	public String generatePrefix(){
		counter++;
		return "PR-" + counter;
	}

}