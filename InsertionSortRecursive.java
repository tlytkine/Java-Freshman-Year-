import java.util.Random;

public class InsertionSortRecursive {
	
	public static void main(String[]arg){
		

		System.out.println("1st Array Sorted (non-random): ");
		int[] arr1 = {2,4,6,7,1,2,3,4,10,23};
		RecursiveInsertionSort(arr1, 0, 9);
		
		for(int i = 0; i < arr1.length ; i++){
			System.out.println(arr1[i]);
		}

		System.out.println("2nd Array Sorted (random): ");
		int[] arr2 = new int[30];
		for (int i = 0; i < arr2.length; i++){
			arr2[i] = (int) (Math.random() * 100);
		}
		int first = 0;
		int last = arr2.length - 1;
		
		RecursiveInsertionSort(arr2, first, last);
		
		for (int i = 0; i < arr2.length; i++){
			System.out.println(arr2[i]);
		}
		
	}
		
		

	public static void insert(int element, int[] a, int first, int last){
		
		if (element >= a[last]){
			a[last+1] = element;
		}
		else if (first < last) {
			a[last+1] = a[last];
			insert(element, a, first, last-1);
		}
		else {
			a[last+1] = a[last];
			a[last] = element;
		}
	}
	
	public static void RecursiveInsertionSort(int[] arr, int first, int last){
		
		if (first < last){
			RecursiveInsertionSort(arr, first, last-1);
			insert(arr[last], arr, first, last-1);
		}
		
	}
	
}