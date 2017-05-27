
public class HashEntry{
	private int key;
	private int value;
	private HashTable next;

	HashEntry(int key,int value){
		this.key = key;
		this.value = value;
		this.next = null;
	}
	public int getValue(){
		return value;
	}
	public void setValue(int value){
		this.value = value;
	}
	public int getKey(){
		return key;

	}
	public HashEntry getNext(){
		return next;
	}
	public void setNext(HashEntry next){
		this.next = next;

	}

}
