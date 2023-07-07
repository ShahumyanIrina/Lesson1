 public class Shoe {
 	private int[] size;
 	private double price;

 	public Shoe() {
 	}

 	public Shoe(int[] size) {
 		this.size = size;
 	}

 	public Shoe(double price) {
 		this.price = price;
 	}

 	public int[] getSize(){
 		return size;
 	}
 	public void setSize(int[] size){
 		this.size = size;
 	}
 	public double getPrice(){
 		return price;
 	}
 	public void setPrice(double price){
 		this.price = price;
 	}

	
}