
import java.lang.Math;
public class Triangle {
   private double side1;
   private double side2;
   private double side3;
   
   public Triangle() {
   side1 = 1.0;
   side2 = 1.0;
   side3 = 1.0;
   }
   public Triangle(double a) {
   side1 = a;
   side2 = a;
   side3 = a;
   }
   public Triangle(double a, double b) {
   side1 = a;
   side2 = b;
   side3 = ((a+b)+1);
   }
   public Triangle(double a, double b, double c) {
   side1 = a;
   side2 = b;
   side3 = c;
   if (((a+b)< c)  || ((a+c) < b) || ((c+b) < a)) {
   side1 = 1.0;
   side2 = 1.0;
   side3 = 1.0;
   }
   }
   public boolean isRight() {
   boolean Right = false;
   if (((Math.sqrt((side1 * side1)+(side2 * side2)) == side3)) || ((Math.sqrt((side1 * side1)+(side3 * side3)) == side2)) || ((Math.sqrt((side3 * side3)+(side2 * side2)) == side1))) {
   Right = true;
   }
   return Right;
   }
   public boolean isIsosceles() {
   boolean Isosceles = false;
   if((side1==side2) || (side2==side3) || (side1==side3)) {
   Isosceles = true;
   }
   return Isosceles;
   }
   public boolean isEquilateral() {
   boolean Equilateral = false;
   if((side1==side2)&&(side2==side3)) {
   Equilateral = true;
   }
   return Equilateral;
   }
   

   public double perimeter() {
   return (side1 + side2 + side3);
   }
   public double area() {
   double s = (perimeter() / 2);
   return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

  }
  }
