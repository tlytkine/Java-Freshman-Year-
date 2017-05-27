
// rnowusu@gwu.edu
// tdelhees@gwu.edu
// metongwe@gwu.edu

public class Main {
	
	// add arraylist

	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		
		Fruit banana = new Fruit("Banana", "yellow", 2);

		System.out.println(fruit.toString());
		System.out.println(banana.toString());
		
		Banana realBanana = new Banana();
		System.out.println(realBanana.name);
		realBanana.peel();
		System.out.println(realBanana.name);
		realBanana.cook();
		System.out.println(realBanana.name);
		
		Apple apple = new Apple();
		System.out.println(apple.toString());
		
		// Vegetable veggie = new Vegetable();
		Broccoli broccoli = new Broccoli();
		Potato potato = new Potato();
		System.out.println(broccoli.isGreen());
		System.out.println(potato.eat());
	}
}
