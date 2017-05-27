import java.util.Scanner;
import java.util.Random;
public class GuessingaNumber {

   public static void main(String[] args) {
       
   Random randGen = new Random();
   
   Random r = new Random();
          int Low = 2;  
          int High = 10;
          int Result = r.nextInt(High-Low) + Low;
          
  Scanner in = new Scanner(System.in );
   int a;
   a = in.nextInt();
   if (a == Result) {
   System.out.println("You won!");
   }
   else if (a > Result) {
   System.out.println("No, my number is bigger.");
   }
   else if (a < Result) {
   System.out.println("No, my number is smaller.");
   }
   int b;
   b = in.nextInt();
   if (b == Result) {
   System.out.println("You won!");
   }
   else if (b > Result) {
   System.out.println("No, my number is bigger.");
   }
   else if (b < Result) {
   System.out.println("No, my number is smaller.");
   }
   int c;
   c = in.nextInt();
   if (c == Result) {
   System.out.println("You won!");
   }
   else if (c > Result) {
   System.out.println("No, my number is bigger.");
   }
   else if (c < Result) {
   System.out.println("No, my number is smaller.");
   }

   

   }
}