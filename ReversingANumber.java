import java.util.Scanner;

public class ReversingANumber {
   public static void main(String[] args){
   
      Scanner scnr = new Scanner(System.in);
      System.out.println("Please enter the integer you would like reversed.");
     int n = scnr.nextInt();
      System.out.println("Here is your reversed integer.");
      while (n > 0) {
     System.out.print(n % 10);
     n = n / 10;
     
     
 
         }
         }
   
}