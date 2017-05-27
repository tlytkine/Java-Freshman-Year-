public class HashMapOA implements HashmapInterface {
	private String key;
	private String value;

	public static void HashmapOA(String key, String value){
		HashmapNode<String, String> x = 
				new HashmapNode<String, String>(key, value);
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
		HashmapNode<String, String> x = 
				new HashmapNode<String, String>(key, value);

	}
	public HashmapNode<String,String> get(String key){
	String y = key;
	if (y != this.key){
		return null;
	}
	this.key = key;
	HashmapNode<String, String> x = 
				new HashmapNode<String, String>(key, value);
	return x;
	}
	
	public int getNumberOfBuckets(){
		HashmapNode<String, String> x = 
				new HashmapNode<String, String>(key, value);
		int count = 0;
		for(int i = 0; i <100; i++){
			x.getNext();
			count++;
		}

		return count;

	}

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

	public static void main(String[]args){

	}
	}