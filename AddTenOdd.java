import java.util.Scanner;

public class AddTenOdd {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      int i = 1;
      int sum = 0;
      int odd = 1;
      while (i++ <= 10) {
         
         sum += odd;
         odd += 2;
         System.out.println( "i = " + 1 + ", sum = " + sum );
      }
      
      System.out.println(sum);
      return;
    }
}
