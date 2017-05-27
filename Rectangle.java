import java.lang.Math;
public class Rectangle extends Shape {

   private double length, height;

   Rectangle(Point upperRight, Point lowerLeft) {
      this.position = upperRight;
      this.position=lowerLeft;
      this.length = Math.abs(upperRight.getX()-lowerLeft.getX());
      this.height = Math.abs(lowerLeft.getY()-upperRight.getY());
   }
  @Override
   public double computeArea() {
      return (length * height);
   }
   public double computePerimeter(){
     return (length+ length+ height+ height);
   }
   public boolean isSquare(){
      if (length == height){
         return true;
      }
      else {
         return false;
      }
   }
}