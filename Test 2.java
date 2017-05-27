public class Test {

	public static void main(String[]args){
		Queue test = new Queue(4);
		test.enqueue("A"); // Adds A to tail
		test.enqueue(1); // Adds 1 to tail
		System.out.println(test.size()); // Prints size (2)
		test.dequeue(); // Removes A from head
		System.out.println(test.size()); // Prints size after Dequeue (1)
		if(test.isEmpty()){
			System.out.println("The queue is empty.");
		}
		else {
			System.out.println("The queue is not empty.");
		}



	}
	
}