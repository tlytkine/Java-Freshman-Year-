
public class Banana extends Fruit {
	
	// default constructor calling Fruit(name,color,grams);
	public Banana() {
		super("Banana", "Yellow", 6.5f);
	}
	
	// additional method 
	public void peel() {
		name = "Peeled " + name;
		grams = 4.2f;
	}
}
