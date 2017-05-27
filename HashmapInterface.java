/**
 * Interface for implementation of Hashmap in lab 13
 * @author collin <cgduncan@gwu.edu>
 * @date Spring 2017
 */
public interface HashmapInterface {
	
	/**
	 * Method which returns the total number of buckets in the current Hashmap
	 * instance.
	 * @return
	 */
	int getNumberOfBuckets();
	
	/**
	 * Hashing function which takes in a user's name and returns the hash code.
	 * @param key
	 * @return
	 */
	int hashCode(String key);
	
	/**
	 * Method which searches the hashmap for the given key and returns the instance
	 * of a HashmapNode which contains the given key.
	 * @param key
	 * @return
	 */
	HashmapNode<String,String> get(String key);
	
	/**
	 * Method which allows us to insert a new key, value pair into the hashmap. This
	 * method should create a new instance of HashmapNode<String, String> and put it
	 * it in the correct location in the hashmap.
	 * @param key
	 * @param value
	 */
	void put(String key, String value);
	
	/**
	 * Method which allows us to remove a node with the given key if one exists.
	 * @param key
	 */
	void remove(String key);
}