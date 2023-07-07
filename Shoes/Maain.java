public class Maain{

	public static void main(String[]args){

		Shoe shoe = new Shoe();
		shoe.setSize(new int[] {37, 38, 39, 40});
		shoe.setPrice(3400);

		Shoe shoe2 = new Shoe();
		shoe2.setSize(new int[]{37, 36, 35, 34});
		shoe2.setPrice(4600);

		Shoe shoe3 = new Shoe();
		shoe3.setSize(new int[]{40, 42, 44, 46});
		shoe3.setPrice(7000);

		Person person = new Person();
		person.setFullName("Irina Shanhumyan");
		person.setShoeSize (38);
		person.setFreeMoney (20000);

		person.buyNewShoe(shoe);
		person.buyNewShoe(shoe2);
		person.buyNewShoe(shoe3);
		System.out.println("User : " + person.getFullName() + " has " + person.getFreeMoney() + " free money.");


	}
}
