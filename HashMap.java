

// Part 2 
public class HashMap implements HashmapInterface {
	private String key;
	private String value;
	private int collisions; // Part 4 

	public static void Hashmap(String key, String value){
		HashmapNode<String, String> x = 
				new HashmapNode<String, String>(key, value);
	}
	public int getCollisionCount(){ // Part 4 

		return this.collisions;
	}
	public void clearCollisions(){ // Part 4 
		this.collisions = 0;
	}
	@Override 
	public void remove(String key){
		String y = key;
		if (y == this.key){
			this.key = null;
		}

	}
	public void put(String key, String value){
		this.key = key;
		this.value = value;
		this.collisions = collisions++; // Part 4 
		HashmapNode<String, String> x = 
				new HashmapNode<String, String>(key, value);

	}
	public HashmapNode<String,String> get(String key){
	String y = key;
	if (y != this.key){
		return null;
	}
	this.collisions = collisions++;	// Part 4 
	this.key = key;
	HashmapNode<String, String> x = 
				new HashmapNode<String, String>(key, value);
	return x;
	}
	// Part 3 
	
	public int getNumberOfBuckets(){
		HashmapNode<String, String> x = 
				new HashmapNode<String, String>(key, value);
		int num = 0;
		for(int i = hashCode(key); i<100; i++){
			x.getNext();
			num++;
		}

		return num;

	}
	// Part 1 
	public int hashCode(String key){
		char y [];
		int temp = 0;
		y = key.toCharArray();
		int l = key.length();
		for(int i=0; i< l; i++){
			temp+= y[i]; 
		}
		return temp % 12;
	}



	}