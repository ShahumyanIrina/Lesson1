public class Person {
	private String fullName;
	private Shoe[] shoes;
	private double freeMoney;
	private int shoeSize;

	public Person() {
		shoes = new Shoe[0];
	}
	
	public Person(Shoe[] shoes) {
		this.shoes = shoes;
	}

	public Person(double freeMoney) {
		this.freeMoney = freeMoney;
	}

	public Person(int shoeSize) {
		this.shoeSize = shoeSize;
	}

	public Shoe[] getShoes(){
		return shoes;
	}

	public void buyNewShoe(Shoe shoe){

		boolean isContainsCorrectSize = false;

		for (int size: shoe.getSize()) {
			if (size == shoeSize) {
				isContainsCorrectSize = true;
				break;
			}
		}

		if(isContainsCorrectSize && this.shoes.length <= 50 && this.freeMoney >= shoe.getPrice()){
			this.freeMoney = (this.freeMoney - shoe.getPrice());
			// how to add new shoe in shoe array
		}

	}

	public double getFreeMoney(){
		return freeMoney;
	}

	public void setFreeMoney(double freeMoney){
		this.freeMoney = freeMoney;
	}	

	public String getFullName(){
		return fullName;
	}

	public void setFullName(String fullName){
		this.fullName = fullName;
	}	
	
	public int getShoeSize(){
		return shoeSize;
	}

	public void setShoeSize(int shoeSize){
		this.shoeSize = shoeSize;
	}

}
