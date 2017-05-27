
public class Broccoli extends Vegetable {

	// needs to define method implemented from Food.java
	public float eat() {
		return .5f;
	}

	// needs to extend Vegetable.java
	@Override
	boolean isGreen() {
		return true;
	}
}
