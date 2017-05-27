import java.util.Scanner;

public class P5{

   public static void main(String[] args){
   
   Scanner in = new Scanner(System.in );
   
   int a;
   a = in.nextInt();
   
   int b;
   b = in.nextInt();
   
   System.out.println("Average: " + (a + b) / 2); 
   
   if (a > b) {
   System.out.println("Biggest value: " + a);
   }
   
   else {
   System.out.println("Biggest value: " + b);
   }
   
   System.out.println("Remainder: " + (a % b));
   
      }
}