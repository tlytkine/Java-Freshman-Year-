
public class Fruit implements Food {

	// instance variables
	String name;
	String color;
	float grams;
	
	// default constructor
	public Fruit() {
		this(null, null, 0f);
	}
	
	// parameterized constructor
	public Fruit(String name, String color, float grams) {
		this.name = name;
		this.color = color;
		this.grams = grams;
	}

	// define method implemented from Food.java
	public void cook() {
		name = "Cooked " + name;
	}

	// define method implemented from Food.java
	public float eat() {
		return 1f;
	}
	
	public String toString() {
		return name + " : " + color + " : " + grams;
	}
}
