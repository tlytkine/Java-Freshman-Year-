import java.util.Scanner;

public class HexadecimalNumbers {
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      System.out.println("Please enter the integer you would like converted to a hexadecimal.");
      int x = 0;
      String hex = "";
      x = scnr.nextInt();
      hex = Integer.toHexString(x);
      System.out.println(hex);
         }
   
}