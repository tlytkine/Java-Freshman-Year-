class A {
 int x;
 public A(int x){
 this.x=x;
 }
 int op() { return x % 10; }
}
class B extends A{
 int y;
 public B(int y){
 super(y);
 this.y=y;
 }
 int op(){ return super.op() + (y / 10) % 10;}
}
class test2 {
 public static void main(String args[])
 {
  B obj2 = new B(17);
 A obj1 = new A(13); //LINE 1im //LINE 2
 int a=obj2.op(); // LINE 3
 System.out.println(a);
 }
}