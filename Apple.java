
public class Apple extends Fruit {
	
	// default constructor calling another self constructor
	public Apple() {
		this("Red");
	}
	
	// parameterized constructor calling Fruit(name,color,grams)
	public Apple(String color) {
		super("Apple", color, 5f);
	}
}
