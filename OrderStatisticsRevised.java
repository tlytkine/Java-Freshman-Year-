/*
1. Order Statistics:
A. Given two sorted arrays X and Y of equal size n, use Quick-Select to find the median 
of all 2n elements in arrays X and Y. Can you improve Quick-Select by choosing better
pivots at every step?
B. Show some experiments of your improved Quick-Select with arrays of size n=50. You
can assume, if you want, that all the elements in the two arrays are distinct.
*/
import java.util.Random;
public class OrderStatisticsRevised {


	public static int RandomizedPartition(int[]A ,int l, int r){
		int i = random(l,r-2);
		swap(A,i,r);
		return partition(A,l,r);

	}

	public static int QuickSelect(int []A, int l, int r, int k){

		if (l==r){
			return A[k];
		}
		int j = RandomizedPartition(A,l,r);
		if (j==k){
			return A[j];
		}
		else if (k<j){
			return QuickSelect(A,l,j-1,k);
		}
		else {
				return QuickSelect(A,j,r,k);
			}
	}
	// improved QuickSelect 
	public static int QuickSelectImproved(int []A, int l, int r, int k){
		if (l==r){
			return A[k];
		}
		int z = A.length;
		int a = (z / 2) - 1; // median element 
		int j = partition(A,a,r);
		if (j==k){
			return A[j];
		}
		else if (k<j){
			return QuickSelectImproved(A,l,j-1,k);
		}
		else {
				return QuickSelectImproved(A,j+1,r,k);
			}
	}
	public static int partition(int []A, int l, int r){
		int x = A[r];
		int i=l-1;
		for(int j=l; j<r; j++){
			if(A[j]<=x){
				i++;
				swap(A,i,j);
			}
		}
		swap(A,i+1,r);
		return i+1;
	}
	public static void swap(int []A, int i, int j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;

	}

	public static void RandomizedQuickSort(int [] A, int p, int r ) { 
	if (p < r ) { 
		int q=RandomizedPartition(A, p, r ) ;

		RandomizedQuickSort(A, p, q-1);
		RandomizedQuickSort(A, q+1, r );
		}
			}



	public static int random(int x, int y){
		Random rand = new Random();
		int z = rand.nextInt(y) + x;
		return z;

	}
	public static void QuickSort(int []A, int p, int r){
		if (p<r){
			int q = partition(A,p,r);
			QuickSort(A,p,q-1);
			QuickSort(A,q+1,r);
		}
	}



	public static void main(String[]args){
		int n = 5;
		int i = n/2; 
		int [] X = {1,3,5,7,9};
		int [] Y = {2,4,6,8,10};
		int [] XY = new int[10];
		for (int d=0; d<n; d++){
			XY[d] = X[d];
			}
		for (int k=5; k<10; k++){
			XY[k] = Y[k-5];
		}

		int MedianX = QuickSelect(X,0,4,i);
		int MedianY = QuickSelect(Y,0,4,i);
		System.out.println("Problem 1A");
		System.out.println("");
		System.out.println("Array X: ");
		for(int s = 0; s < X.length; s++){
			System.out.print(X[s] + " ");
		}
		System.out.println("");
		System.out.print("The median of X is: ");
		System.out.print(MedianX);
		System.out.println("");
		System.out.println("");
		System.out.println("Array Y");
		for(int s = 0; s < Y.length; s++){
			System.out.print(Y[s] + " ");
		}
		System.out.println("");
		System.out.print("The median of Y is: ");
		System.out.print(MedianY);
		System.out.println("");
		System.out.println("");
		System.out.println("Array X and Y combined");
		for(int s = 0; s < XY.length; s++){
			System.out.print(XY[s] + " ");
		}
		System.out.println("");
		System.out.println("");
		QuickSort(XY,0,9);
		System.out.println("Array X and Y combined and sorted using QuickSort");
		for(int s = 0; s < XY.length; s++){
			System.out.print(XY[s] + " ");
		}
		System.out.println("");
		int MedianXY = QuickSelect(XY,0,9,4);
		System.out.println("");
		System.out.print("The median of the elements in arrays X and Y is: ");
		System.out.print(MedianXY);
		System.out.println("");
		System.out.println("");

		
		// QuickSelect can be improved for this particular case when the elements 
		// of the arrays are already sorted by instead of using a randomized 
		// partitioning method, using a regular partition method with the median element. 
		// Otherwise, in general, using a randomized 
		// partition method is less likely to be the worst case run time of O(n^2).
		System.out.println("Problem 1B");
		System.out.println("");
		int size = 50;
		int f = size/2; 
		int [] test1 = new int[size];
		int [] test2 = new int[size];
		int [] test12 = new int[100];
		Random rand = new Random();
		for (i=0; i<size; i++){
			test1[i] = rand.nextInt(100) + 1;
			test2[i] = rand.nextInt(100) + 1;
		}
		System.out.print("Array 1: ");
		for(int s = 0; s < test1.length; s++){
			System.out.print(test1[s] + " ");
		}
		System.out.println("");
		System.out.println("");
		System.out.print("Array 2: ");
				for(int s = 0; s < test2.length; s++){
			System.out.print(test2[s] + " ");
		}
		System.out.println("");
		System.out.println("");
		for (int d=0; d<size; d++){
			test12[d] = test1[d];
			}
		for (int k=50; k<size*2; k++){
			test12[k] = test2[k-50];
		}
		System.out.print("Array 1 and 2 Combined: ");
				for(int s = 0; s < test12.length; s++){
			System.out.print(test12[s] + " ");
		}
		System.out.println("");
		System.out.println("");
		QuickSort(test12,0,99);
		System.out.print("Array 1 and 2 Combined and Sorted with QuickSort: ");
				for(int s = 0; s < test12.length; s++){
			System.out.print(test12[s] + " ");
		}
		int qsi = QuickSelectImproved(test12,0,99,49);
		System.out.println();
		System.out.println("");
		System.out.println("Median of Array 1 and 2 using improved QuickSelect method: " + qsi);


	}







	

}