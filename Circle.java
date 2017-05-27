import java.lang.Math;
public class Circle extends Shape {
private Point Center;
private double radius;

Circle(Point c, double r) {
this.Center = c;
this.radius = Math.abs(r);
}
public void moveCenter(Point P) {
this.Center = P;
return;
}
public void changeRadius(double rad) {
this.radius = rad;
}
@Override 
public double computeArea() {
return (Math.PI * radius * radius);
}
@Override
public double computePerimeter() {
return (2 * Math.PI * radius);
}

}