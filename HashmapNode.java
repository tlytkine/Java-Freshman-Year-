/**
 * HashmapNode
 * ===========
 * 
 * Simple, generic, linked-list node class.
 * 
 * @author collin <cgduncan@gwu.edu>
 * @date Spring 2017
 *
 * @param <K> - type of key
 * @param <V> - type of value
 */
public class HashmapNode<K,V> {
	private K key;
	private V value;
	private HashmapNode<K,V> next;
	
	public HashmapNode(K key, V value) {
		this.key = key;
		this.value = value;
		this.next = null;
	}
	
	public K getKey() {
		return key;
	}
	
	public void setKey(K key) {
		this.key = key;
	}
	
	public V getValue() {
		return value;
	}
	
	public void setValue(V value) {
		this.value = value;
	}
	
	public HashmapNode<K,V> getNext() {
		return next;
	}
	
	public void setNext(HashmapNode<K,V> next) {
		this.next = next;
	}
	
	public String toString() {
		return getKey() + ": " + getValue();
	}
}
