
public class MaxValRecursion {

		public static void main(String[]arg){
			
			int[] arr1 = {1,3,4,10,11,3,7,2,9,11};
	
			System.out.println("Non-random array: ");
				for (int i = 0; i < arr1.length; i++){
					System.out.print(arr1[i] + ", "); 
				}
			System.out.println("");
			System.out.println("Max: ");
			System.out.println(LargestInt(arr1, 0, 0));
			System.out.println("");
			
			int[] rand1 = new int[25];
			System.out.println("1st Random Array: ");
				for (int i = 0; i < rand1.length; i++){
					rand1[i] = (int) (Math.random() * 100);
				}
				for (int i = 0; i < rand1.length; i++){
					System.out.print(rand1[i] + ", ");
				}
			System.out.println("");
			System.out.println("Max: ");
			System.out.println(LargestInt(rand1, 0, 0));
			System.out.println("");
			
			int[] rand2 = new int[50];
			System.out.println("2nd Random Array: ");
				for (int i = 0; i < rand2.length; i++){
					rand2[i] = (int) (Math.random() * 100);
				}
				for (int i = 0; i < rand2.length; i++){
					System.out.print(rand2[i] + ", ");
				}
			System.out.println("");
			System.out.println("Max: ");
			System.out.println(LargestInt(rand2, 0, 0));
		}
		
		
	
		public static int LargestInt(int[] array, int index, int max){
			
			if(index == array.length){
				return max;
			}
				
			
			if (array[index] > max){
				max = array[index];
			}
			
			return LargestInt(array, index + 1, max);
			
		}
	
}