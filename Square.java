
import java.lang.Math;

public class Square {
   private double side;
   
   public Square() {
   side = 1.0;
   }
   public Square(double s) {
   side = s;
   }

 
   public void setSide(double sideVal) {
      side = sideVal;

      return;
   }

   public double perimeter() {
   return (side * 4);
   }
   public double area() {
   return (side * 2);
   }

  }
