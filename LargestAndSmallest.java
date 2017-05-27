import java.util.Scanner;

public class LargestAndSmallest {
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      int n = -1, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
      
      System.out.println("How many numbers?");
      
      n = scnr.nextInt();
      
      System.out.println("Give me " + n + " numbers.");
      for (int i = 0; i < n; i++) {
        int user = scnr.nextInt();
        if (user < min) min = user;
        if (user > max) max = user;         
         }
        System.out.println("Smallest number is " + min + ".");
        System.out.println("Largest number is " + max + ".");
   }
   
}