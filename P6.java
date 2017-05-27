import java.util.Scanner;

public class P6{

   public static void main(String[] args){
   
   Scanner in = new Scanner(System.in );
   
   double a;
   a = in.nextDouble();
   
   double b;
   b = in.nextDouble();
   
   double c;
   c = in.nextDouble();
   
   System.out.println("Biggest value: " + Math.max(a, Math.max(b, c)));
   
         }
}