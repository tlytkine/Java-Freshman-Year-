// Homework 4 due April 13th
/*
MinHeap used to keep up to date list of the 
10 best scores.
Reads list of 1000 random numbers and returns 
10 highest numbers.
Keeps track of comparisons. 


How would you solve the problem of finding
the best 10 scores offline i.e. after having
read the entire list? How many comparisons
would be necessary and sufficient in the 
offline case?

ANSWER TO QUESTION:

You can use heapsort since the best case run time and worst case run time is n log n. 
In the offline case, 333 comparisons would be necessary and sufficient to determine the best
10 scores after having read the entire list. 




*/

import java.util.Random;

public class MinHeap {
    private int[] MH;
    private int arrlength;
    private int maxelements;
    
    // Declares and stores in memory the first position of the MinHeap array as always being 1 
    private static final int first = 1;
    // Returns the root (which is always at position 1)
    public int root(){
       int root = MH[1];
       return root;
    }
    // Sets the root as an integer value 
    public void makeRoot(int val){
        MH[1]=val;
    }
    // Sets the maximum number of elements in the int array MH 
    public MinHeap(int maxelements){
        this.maxelements = maxelements;
        this.arrlength = 0;
        MH = new int[this.maxelements + 1];
        MH[0] = Integer.MIN_VALUE;
    }
    // Checks whether or not if the index i is a leaf (as opposed to being the root)
        private boolean isLeaf(int i){
        boolean leaf = false; // returns false if the index is at the root index of 1 
        if (i>=(arrlength/2) && i<=arrlength){ // checks to if the index i is not 1 and that the length of the array                                  
            leaf = true;                       // is greater than i 
        // returns true if the index is at a leaf (not 1)
        }
        return leaf; 
    }
 // Returns the index of the parent, leftChild, and rightChild in the int [] MH
// Returns 0 for parent if the element is at the root index (1)
    private int parent(int i){  // Returns parent's index in int [] MH
        return i/2;          // If the element at i is not the root (at position 1), then the parent of 
                                // in the minHeap is always i / 2 
                               
    }
 
    private int leftChild(int i){ // Returns left child's index in int [] MH
        return (2*i); // left child's index is 2 * i 
    }
 
    private int rightChild(int i){ // Returns right child's index in int [] MH
        return (2*i)+1; // right child's index is (2 * i) + 1 (to the right of the left child)
    }
 


    private void swap(int a,int b){ // swaps the element at MH[a] and the element at MH[b]
        int x = MH[a]; // 1.temporary int variable x to store the element at index a 
        MH[a] = MH[b]; // 2.sets the value of the element in the array at index a equal to the element at index b
        MH[b] = x;     // 3.uses the stored temporary variable x with the original MH[a] value to complete the swap by setting the value of the 
                        // element at index b equal to x      
    }
    // sorts elements into a minHeap with the left child and right child greater than the root and swaps the small element up
    private void minHeapify(int i){ 
        if (isLeaf(i)==false){ // determines if the element at index i is the root 
            if ( (MH[i]>MH[leftChild(i)]) ||(MH[i]>MH[rightChild(i)])){ // checks if the element at index i is greater than the left or right child 
                if (MH[leftChild(i)] < MH[rightChild(i)]){ // checks if the left child is less than the right child
                    swap(i, leftChild(i)); // swaps the left child with the root (moves the smaller elements up)
                    minHeapify(leftChild(i)); // recursively calls minHeapify to sort the elements into a minHeap with the smallest element at the root 
                }
                else{ // the index is not at the root (index 1)
                    swap(i, rightChild(i)); //swaps the element at index i with the rightchild
                    minHeapify(rightChild(i)); // recursively calls minHeapify to sort the elements into a minHeap (smallest element at root (1))
                }
            }
        }
    }
    //inserts an integer x into the minheap 
    public void insert(int x){ 
        MH[++arrlength] = x; // sets the last element of MH[] to the integer x 
        int y = arrlength; //sets y equal to the size of MH[]
        while (MH[y] < MH[parent(y)]){ // runs loop until the last element of MH[] is less than the parent of y 
            // moves the last element into its place in the minheap (until the parent is smaller or it is at the root)
            swap(y,parent(y)); // swaps y and the parent of y 
            y = parent(y); // sets equal y to the parent of y to keep moving the element up to its proper position
        }	
    }
    // Removes the first element from the MinHeap array 
    public int remove() {
        int y = MH[first]; // sets temp variable y equal to first element in MH 
        MH[first] = MH[arrlength--]; // sets first index of MH to element in last index of MH
        minHeapify(first); // arranges newly sorted elements into minheap format 
        return y; // returns removed element 
    }
    // Prints out the ten maximum elements taken from the list of 1000 random integers
    public void print(){
        System.out.println("Ten highest \"scores\": ");
        for (int i = 1; i<=10; i++){
            System.out.println(i + ": " + MH[i]);
        }
    }
    // Constructs the minHeap using the size of MH[] given to the class MinHeap (the maximum number of elements)
    public void minHeap(){
        for (int i = (arrlength/2); i >= 1 ; i--){ // runs for loop until i is at the root (1)
            minHeapify(i); // puts the elements into their proper positions in the heap 
        }
    }

 
    public static void main(String...arg){
        int comp = 0; // declares integer variable to keep track of comparisons being made
        Random rand = new Random(); 
        MinHeap scores = new MinHeap(1001); // Declares the max size of the minHeap array as 10
        int [] test = new int[1000];
        for (int i =0; i<test.length; i++){
            test[i] = rand.nextInt(1000) + 1; // generates an integer array of 1000 random "scores" to find the 10 max values of 
        }
        for(int i =0; i<10; i++){
            int f = test[i];
            scores.insert(f); // Inserts first 10 elements of int array test into the MinHeap array
        }
        for(int i =10; i<1000; i++) {
            int e = test[i]; // declares and sets an integer variable e equal to the current value of the array
            int l = scores.root(); // sets int l equal to the root of the MinHeap
            scores.swap(1,10);
             // The root at position 1 is always the minimum value of the heap so 
            //the 10th value in the MinHeap array is swapped with the 1st value of the MinHeap array so that the largest value 
            //each time the for loop runs is put at the beginning of the array and the smaller value is moved down the list 
            //of the 10 max numbers, in turn removing the values that are smaller than the rest of the list from the MinHeap array 
            //and keeping the larger values in the list in order to form the list of the 10 max numbers. 
                if (e > l){
                comp++; // Counts the comparisons made in each iteration of the for loop 
                scores.makeRoot(e); // Makes the root (or first element) of the minHeap array equal to the value 
                // of test[i] in each iteration of the for loop.
                scores.minHeapify(1);
            }


        }


        scores.print(); // Prints out the minHeap array as a list of the 10 largest numbers in the int array test of 
        // 1000 random numbers 
        System.out.println("Number of comparisons: " + comp); // Prints out the number of comparisons made between each value 
        // in the int array test and the root of the minHeap array 


}
}