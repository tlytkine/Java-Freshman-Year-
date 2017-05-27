public class Triangle extends Shape {
private Point vertex1;
private Point vertex2;
private Point vertex3;
protected double side1;
protected double side2;
protected double side3;

Triangle(Point one, Point two, Point three) {
vertex1 = one;
vertex2 = two;
vertex3 = three;
this.position = vertex1;
this.position = vertex2;
this.position = vertex3;
this.side1 = Math.sqrt(Math.abs(((vertex1.getX()-vertex2.getX())*(vertex1.getX()-vertex2.getX())) + ((vertex1.getY()-vertex2.getY())*(vertex1.getY()-vertex2.getY()))));
this.side2 = Math.sqrt(Math.abs(((vertex2.getX()-vertex3.getX())*(vertex2.getX()-vertex3.getX())) + ((vertex2.getY()-vertex3.getY())*(vertex2.getY()-vertex3.getY()))));
this.side3 = Math.sqrt(Math.abs(((vertex3.getX()-vertex1.getX())*(vertex3.getX()-vertex1.getX())) + ((vertex3.getY()-vertex1.getY())*(vertex3.getY()-vertex1.getY()))));
if ((vertex1.getY() == vertex2.getY()) && (vertex2.getY() == vertex3.getY())) { // All 3 vertices are on a line (triangle is not defined) so sides are set equal to zero
side1 = 0;
side2 = 0;
side3 = 0;
}
}

   @Override
   
   
   public double computeArea() {
   double S = ((side1 + side2 + side3)/2);
   return (Math.sqrt((S*(S-side1)*(S-side2)*(S-side3)))); 
   }
   @Override
   public double computePerimeter() {
   return (side1 + side2 + side3);
   
   }
   

public boolean isRight() {
boolean right = false;
if ( ((side1*side1)+(side2*side2)) == (side3*side3) ) {
right = true;
}
else if ( ((side1*side1)+(side3*side3))==(side2*side2) ) {
right = true;
}
else if ( ((side3*side3)+(side2*side2))==(side1*side1) ) {
right = true;
}

return right;
}

public boolean isEquilateral() {
boolean equilateral = false;
if ( (side1==side2) && (side2==side3) ) {
equilateral = true;
}
return equilateral;
}
}