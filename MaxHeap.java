public class MaxHeap {

	private int[] Heap;
	private int size;
	private int max;

	private static final int FRONT = 1;

	public MaxHeap(int max) {
	this.max = max;
	this.size = 0;
	Heap = new int[this.max + 1];
	Heap[0] = Integer.MAX_VALUE; 
	}

	public int size(){
	this.size = Heap.length;
	return size;
	}

	public void insert(int x){
        Heap[++size] = x;
        int y = size;

        while(Heap[y] >= Heap[parent(y)]){
            swap(parent(y),y);
            y = parent(y);
        }

	}

	private int parent(int position){
		return position / 2;
	}

	private int leftChild(int position){
		return (2*position);
	}

	private int rightChild(int position){
		return (2*position)+1;
	}

	private boolean isLeaf(int position){
        if (position>=(size/2)&&position<=size){
            return true;
        }
        return false;
    }

	private void swap(int first,int second){
        int temp;
        temp = Heap[first];
        Heap[first] = Heap[second];
        Heap[second] = temp;
    }

	public int delete(){
        int d = Heap[1];
        Heap[1] = Heap[size--];
        while(!isLeaf(1)) {
        	if(Heap[1] > Heap[rightChild(1)]){
        	swap(1,rightChild(1));
        	if(Heap[rightChild(1)] > Heap[leftChild(1)]){
        		swap(leftChild(1),rightChild(1));
        	}
        } 
    }
        return d;
    }

    public void maxHeapify(int[]A,int i, int n){
    	int k = i;
 		int t;
 		if ( (2*i+1 <= n) && (A[2*i+1]>A[k]) ){
 			k=2*i+1;
 		}
 		if ((2*i <= n)&&(A[2*i]>A[k])){
 			k=2*i;
 		}
		if (k!=i){
 			t=A[i];
 			A[i]=A[k];
 			A[k]=t;
 			maxHeapify(A,k,n);
 			} 

    }
    public void print(){
        for (int i = 1; i <= size / 2; i++){
            System.out.println("Parent: " + Heap[i]);
            System.out.println("Left Child: " + Heap[2*i]);
            System.out.println("Right Child: " + Heap[2 *i +1]);
            System.out.println();
        }
    }


    public void heapSort(int[]a){
    	for(int i =0; i<a.length; i++){
    		insert(a[i]);
    		maxHeapify(a,i,a.length-1);
    	}


    }
    public static void main(String[]args){
    	MaxHeap test = new MaxHeap(5);
    	int [] a = new int[5];
  			a[0] = 10;
  			a[1] = 11;
  			a[2] = 9;
  			a[3] = 5;
  			a[4] = 4;
        test.heapSort(a);
        test.print();



    }

}









