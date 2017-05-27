// This program compares two integers
import java.util.Scanner;

public class OddEven {

	public static void main(String [] args) {
 
        Scanner scnr   = new Scanner(System.in);
		int myInt1  = 0;
		

    	System.out.print(" Enter the first integer: " );
        myInt1 = scnr.nextInt();
        
      System.out.println("");
      
        if (myInt1 % 2==0) {
			System.out.println(" even ");
		}
      
        else {
        System.out.println(" odd ");
        }
        System.out.println("");
   return;

}
}

