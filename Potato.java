
public class Potato extends Vegetable {

	// needs to define method implemented from Food.java
	public float eat() {
		return 2f;
	}

	// needs to extend Vegetable.java
	@Override
	boolean isGreen() {
		return false;
	}
	
}
