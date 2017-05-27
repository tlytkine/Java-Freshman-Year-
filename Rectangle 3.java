
import java.lang.Math;

public class Rectangle {
   private double side1;
   private double side2;
   
   public Rectangle() {
   side1 = 1.0;
   side2 = 1.0;
   }
   public Rectangle(double s) {
   side1 = s;
   side2 = 1.0;
   }
   public Rectangle(double s1, double s2) {
   side1 = s1;
   side2 = s2;
   }
   public boolean isSquare() {
   boolean isSquare = false;
   if (side1==side2) {
   isSquare = true;
   }
   return isSquare;
   }
   
   public void setSides(double sideVal1, double sideVal2) {
      side1 = sideVal1;
      side2 = sideVal2;
      return;
   }

   public double perimeter() {
   return ((side1*2) + (side2*2));
   }
   public double area() {
   return (side1 * side2);
   }

  }
