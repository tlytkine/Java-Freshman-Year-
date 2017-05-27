public class Queue {
	private int tail; // index where new elements are added
	private int head = 0; // index of front of Queue
	private Object[] a; // array of objects to have operations peformed on
	private int size;
public Queue(int y){ // uses array with y elements 
	a = new Object[y];
}
public void enqueue(Object x){ // adds Object x to tail of Queue, increments tail index and updates size of Queue 
	if (size == a.length) {
            throw new IllegalStateException("Queue is full.");
        }

	a[tail] = x; // adds x to tail of Queue 
	tail = (tail+1)% a.length; // increments tail when Objects are added 
	size++; /// updates number of items in Queue 

}
public Object dequeue(){
	if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
        }
	Object x = a[head];
	a[head] = null;
	head = (head+1)%a.length;
	size--;
	return x; 

}
public Object peek(){
if (isEmpty()) {
            throw new IllegalStateException("Queue is empty.");
    }

	return a[size-1];

}
public int size(){
	return size;

}
public boolean isEmpty(){
	return size == 0;

}
}