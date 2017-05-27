
import java.util.Random;


public class MergeSort{
static int comparisons = 0;
	
	public static void main(String[] args) {
	int [] A = {5,3,8,9,1,7,0,2,6,4};
	for(int i=0; i<A.length; i++){
	if(i<A.length-1){
	System.out.print(A[i] + ", ");
	}	
	else {
		System.out.print(A[i]);
	}
	}
	System.out.println("");	
	mergeSort(A);
	for(int i=0; i<A.length; i++){
	if(i<A.length-1){
	System.out.print(A[i] + ", ");
	}	
	else {
		System.out.print(A[i]);
	}
	}
	System.out.println("");	

		
		
	}
	public static int[] insertionSort(int[] a){	
		int temp;
		int size = a.length;
		int comp3 = 0;
		int swapshift3 = 0;
		for (int i = 1; i < size; i++){
			comp3++;
			int j = i;
			temp = a[i];
			while (j > 0 && temp < a[j - 1]){
				a[j] = a[j - 1]; // right shifting
				j--;
				swapshift3++;
			}

			a[j] = temp;

		}
		
		System.out.println("Insertion Sort");
		System.out.println("Number of element-wise comparisons: " + comp3);
		System.out.println("Number of swap/shift operations: " + swapshift3);
		System.out.println("");
		return a;
	}
	public static void mergeSort(int[] data){
		//call the recursive mergeSort method
		mergeSort(data, 0, data.length-1);
	}
public static void merge(int[] A, int p, int q, int r){
     int n1 = q-p+1;                          
     int n2 = r-q;
     int[] L = new int[n1+1];
     int[] R = new int[n2+1]; 
     int i; int j;
     int comp = 0;
     int swap = 0;
     for (i=0; i<=n1; i++) {
     L[i]=A[p+i];
     }
     for(j=0; j<n2; j++){
     R[j]=A[q+j+1];
     }
     // part of improvement to merge method
     int rightmost = L.length;

     
     L[n1]=10000000;
     R[n2]=10000000;
     i=0; j=0;
      
     for(int k=p; k<=r; k++){
     	// part of improvement to merge method (1b)
		if (L[rightmost-1]<=R[0]){
			break;
		}
     	comp++;
     if(L[i]<=R[j]){
     A[k]=L[i];
     i++;
     }
     else{
     A[k]=R[j];
     j=j+1;
     swap++;
     }
 }

      	for(i=0; i<L.length; i++){
	if(i<L.length-1){
	System.out.print(L[i] + ", ");
	}	
	else {
		System.out.print(L[i]);
	}
	}
	System.out.println("");	
 	for(i=0; i<R.length; i++){
	if(i<R.length-1){
	System.out.print(R[i] + ", ");
	}	
	else {
		System.out.print(R[i]);
	}
	}
	System.out.println("");	
}
	private static void mergeSort(int[] data, int startIndex, int endIndex) {

		// recursion condition
		if (startIndex < endIndex){
			
			//find index of middle element
			int midIndex=(startIndex + endIndex)/2;
			
			//recursive calls to sort each side
			mergeSort(data, startIndex, midIndex);
			mergeSort(data, midIndex+1, endIndex);
			
			//merge the elements from each side of the array		
			merge(data, startIndex, midIndex, endIndex);
			
		}
	}
	
}
