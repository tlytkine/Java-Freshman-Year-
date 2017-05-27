/**
 * Simple test for HashmapNode class
 * @author collin <cgduncan@gwu.edu>
 * @date Spring 2017
 */
public class HashmapNodeTest {
	public static void main(String[] args) {
		HashmapNode<String, String> root = 
				new HashmapNode<String, String>("Jam", "123 Test St.");
		HashmapNode<String, String> n1 = 
				new HashmapNode<String, String>("Jem", "234 Test St.");
		HashmapNode<String, String> n2 = 
				new HashmapNode<String, String>("Jim", "345 Test St.");
		HashmapNode<String, String> n3 = 
				new HashmapNode<String, String>("Jom", "456 Test St.");
		HashmapNode<String, String> n4 =
				new HashmapNode<String, String>("Jum", "567 Test St.");
		HashmapNode<String, String> n5 = 
				new HashmapNode<String, String>("Jym", "678 Test St.");
		
		root.setNext(n1);
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		n4.setNext(n5);
		
		HashmapNode<String, String> current = root;
		
		while (current != null) {
			System.out.println(current);
			current = current.getNext();
		}
	}
}
