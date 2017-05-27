public class BasicOperations 
{
   public static void main (String[] args)
   {
      int x1 = 10, x2 = 10;
      int y = 3 + (--x1);Syste
      int z = 3 + (x2--);
      System.out.println("Result y = " + y);
      System.out.println("Result z = " + z);
      System.out.println(x2);
      System.out.println(x1);
      
      x1 += 9;
      x1++;
      System.out.println("Result x1 = " + x1);
      
      }
   }