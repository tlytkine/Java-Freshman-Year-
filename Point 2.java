import java.lang.Math;
public class Point {

   private double x;
   private double y;
   

   public Point(double x, double y) {
      this.x = x;
      this.y = y;
        }

   public double getX() {
      return x;
   }

   public double getY() {
      return y;
   }
   
    
   public void setX(double x) {
           this.x = x;
           
           return;
   }
   
   public void setY(double y) {
           this.y = y;
           
           return;
   }
   
  public double dist(Point P){
  return Math.sqrt(Math.pow(this.x-P.getX(),2)+Math.pow(this.y-P.getY(),2));
  }
}