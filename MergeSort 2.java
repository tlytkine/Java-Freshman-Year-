import java.util.Random;

public class MergeSort {

		
		public static void main(String[] args) {
			
			Random generator=new Random(30);
			
			int[] testData10=new int[10];
			//generate random data
			for (int i=0; i < testData10.length; i++){
				int randomNumber=(int) (generator.nextDouble()*100) +1;
				testData10[i]=randomNumber;
			}
			
			int[] testData100=new int[100];
			//generate random data
			for (int i=0; i < testData100.length; i++){
				int randomNumber=(int) (generator.nextDouble()*100) +1;
				testData100[i]=randomNumber;
			}
			
			int[] testData1000=new int[1000];
			//generate random data
			for (int i=0; i < testData1000.length; i++){
				int randomNumber=(int) (generator.nextDouble()*100) +1;
				testData1000[i]=randomNumber;
			}
		
			
			mergeSort(testData10, 0, testData10.length); 
			
		}
		
		public static void mergeSort(int[] data){
			//call the recursive mergeSort method
			mergeSort(data, 0, data.length-1);
		}
		
		public static void merge(int[] A, int p, int q, int r){
			
			int n1 = q - p + 1;
			int n2 = r - q;
			int[] L = new int[n1 + 1];
			int[] R = new int[n2 + 1];
			int i;
			int j;
			int comp = 0;
			int swap = 0;
			for (i = 0; i <= n1; i++){
				L[i] = A[p + i];
			}
			
			for (j = 0; j < n2; j++){
				R[j] = A[q + j + 1];
			}
			
			L[n1] = 10000000;
			R[n2] = 10000000;
			i = 0;
			j = 0;
			
			for (int k = p; k <= r; k++){
				comp++;
				if (L[i] <= R[j]){
					A[k] = L[i];
					i++;
				}
				else {
					A[k] = R[j];
					j = j + 1;
					swap++;
				}
			}
			
			System.out.println("Number of comparisons: " + comp);
			System.out.println("Number of swaps: " + swap);
			
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