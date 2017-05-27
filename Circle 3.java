
import java.lang.Math;

public class Circle {
   private double radius;
   
   public Circle() {
   radius = 1.0;
   }
   public Circle(double r) {
   radius = r;
   }
   public void setRadius(double r) {
      radius = r;
      return;
   }

   public double perimeter() {
   return (2*(Math.PI)*radius);
   }
   public double area() {
   return (Math.PI*Math.pow(radius,2));
   }

  }
