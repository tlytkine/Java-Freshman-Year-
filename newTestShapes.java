import java.util.Random;
import java.util.ArrayList;
public class newTestShapes {
   
   //Methods we use\\
   
   public static int findMinArea(ArrayList<Shape> Shapes){
      double min = 0;
      int size = Shapes.size();
      int index = 0;
      for (int i = 0; i<size; i++){
         if (i==0){
            min = Shapes.get(i).computeArea();
         }
         else {
            if (Shapes.get(i).computeArea()< min){
               min = Shapes.get(i).computeArea();
               index = i;
            }
         }
      }
      return index;
   }
   public static int findMinPerimeter(ArrayList<Shape> Shapes){
      double min = 0;
      int size = Shapes.size();
      int index = 0;
      for (int i = 0; i<size; i++){
         if (i==0){
            min = Shapes.get(i).computePerimeter();
         }
         else {
            if (Shapes.get(i).computePerimeter()< min){
               min = Shapes.get(i).computePerimeter();
               index = i;
            }
         }
      }
      return index;
   }
   public static void printArrayList(ArrayList<Shape> Shapes){
      int size = Shapes.size();
      for (int i = 0; i<size; i++){
         System.out.println(Shapes.get(i));
      }
      return;
   } 
 
   public static void main(String[] args){
      Random randGen = new Random();
      
      //Points\\
      double min = 0;
      double max = 10;
      double random1 = new Random().nextDouble();
      double P1X = min + (random1 * (max-min));
      System.out.println(P1X);
      double random2 = new Random().nextDouble();
      double P2X = min + (random2 * (max-min));
      System.out.println(P2X);
      double random3 = new Random().nextDouble();
      double P3X = min + (random3 * (max-min));
      System.out.println(P3X);
      double random4 = new Random().nextDouble();
      double P1Y = min + (random4 * (max-min));
      System.out.println(P1Y);
      double random5 = new Random().nextDouble();
      double P2Y = min + (random5 * (max-min));
      System.out.println(P2Y);
      double random6 = new Random().nextDouble();
      double P3Y = min + (random6 * (max-min));
      System.out.println(P3Y);
      Point P1 = new Point(P1X, P1Y);
      Point P2 = new Point(P2X, P2Y);
      Point P3 = new Point(P3X, P3Y);
      System.out.println("The distance between P1 and P2 is " + P1.dist(P2));
      System.out.println("The distance between P1 and P3 is " + P1.dist(P3));
      System.out.println("The distance between P2 and P3 is " + P2.dist(P3));
      //Triangles\\
      
      Triangle Tri = new Triangle(P1, P2, P3);
      System.out.println ("The perimeter of the triangle is " + Tri.computePerimeter());
      System.out.println ("The area of the triangle is " + Tri.computeArea());
      if (Tri.isRight() == true) {
         System.out.println ("This is a right triangle");
      }
      else {
         System.out.println ("This is not a right triangle");
      }
      if (Tri.isEquilateral() == true) {
         System.out.println ("This is an equilateral triangle");
      }
      else {
         System.out.println ("This is not an equilateral triangle");
      }
      
      //Rectangles\\
      
      Rectangle rekt1 = new Rectangle(P1, P2);
      Rectangle rekt2 = new Rectangle(P1, P3);
      Rectangle rekt3 = new Rectangle(P2, P3);
      
      System.out.println("The area of the rectangles from 1 to 3 is " + rekt1.computeArea() + " " + rekt2.computeArea() + " " + rekt3.computeArea());
      System.out.println("The perimeter of the rectangles from 1 to 3 is " + rekt1.computePerimeter() + " " + rekt2.computePerimeter() + " " + rekt3.computePerimeter());
      if (rekt1.isSquare() == true) {
         System.out.println ("Rectangle 1 is a square");
      }
      else {
         System.out.println ("Rectangle 1 is not a square");
      }
      if (rekt2.isSquare() == true) {
         System.out.println ("Rectangle 2 is a square");
      }
      else {
         System.out.println ("Rectangle 2 is not a square");
      }
      if (rekt3.isSquare() == true) {
         System.out.println ("Rectangle 3 is a square");
      }
      else {
         System.out.println ("Rectangle 3 is not a square");
      }
      
      //Circles\\
      
      Circle Circ1 = new Circle(P1, P1.dist(P2));
      Circle Circ2 = new Circle(P2, P2.dist(P3));
      System.out.println ("The area of Circle 1 is " + Circ1.computeArea());
      System.out.println ("The area of Circle 2 is " + Circ2.computeArea());
      System.out.println ("The perimeter of Circle 1 is " + Circ1.computePerimeter());
      System.out.println ("The perimeter of Circle 2 is " + Circ2.computePerimeter());
      
      //Array list\\
      ArrayList<Shape> Shapes = new ArrayList<Shape>();
      Shapes.add(Tri);
      Shapes.add(rekt1); 
      Shapes.add(rekt2); 
      Shapes.add(rekt3);
      Shapes.add(Circ1);
      Shapes.add(Circ2);
      ArrayList<Shape> TempArea = new ArrayList<Shape>();
      int index = 0;
      while(Shapes.size()>0){
         index = (findMinArea(Shapes));
         TempArea.add(Shapes.get(index));
         Shapes.remove(index);
      }
      Shapes = TempArea;
      printArrayList(Shapes);//This prints out some random stuff at the end of the shapes, but it still is helpful for bug testing
      ArrayList<Shape> TempPerimeter = new ArrayList<Shape>();
      index = 0;
      while(Shapes.size()>0){
         index = (findMinPerimeter(Shapes));
         TempPerimeter.add(Shapes.get(index));
         Shapes.remove(index);
      }
      Shapes = TempPerimeter;
      printArrayList(Shapes);

   }
}
    

      





