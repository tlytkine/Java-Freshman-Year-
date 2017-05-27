
public abstract class Vegetable implements Food {
	
	// member method
	public void cook() {
		System.out.println("Boil water in a pot then throw it in");
	}
	
	// needs to be implemented by subclasses
	abstract boolean isGreen();
}
