import java.util.Scanner;

public class HomeworkOne {

public static void main(String[]args) {

Scanner scnr = new Scanner(System.in);
int a = 0;
int b = 0;
int c = 0;
int d = 0;
int i = 0;
int min = 0;


System.out.println("Please enter the first integer.");
a = scnr.nextInt();
System.out.println("Please enter the second integer.");
b = scnr.nextInt();
System.out.println("Please enter the third integer.");
c = scnr.nextInt();
System.out.println("Please enter the fourth integer.");
d = scnr.nextInt();

/* 24 Combinations of ABCD in total (combination is reversed when printed so it is in increasing order) */
   
   // 1: ABCD  
   if (a > b & b > c & c > d)  {
   System.out.println(d + "," + c + "," + b + "," + a);
   }
   
   // 2 ABDC 
   else if (a > b & b > d & d > c) {
   System.out.println(c + "," + d + "," + b + "," + a);
   }
   
   // 3 ACBD 
   else if (a > c & c > b & b > d) {
   System.out.println(d + "," + b + "," + c + "," + a);
   }
   
   // 4 ACDB 
   else if (a > c & c > d & d > b) {
   System.out.println(b + "," + d + "," + c + "," + a);
   }
   
   // 5 ADBC
   else if (a > d & d > b & b > c) {
   System.out.println(c + "," + b + "," + d + "," + a);
   }
   
   // 6 ADCB
   else if (a > d & d > c & c > b) {
   System.out.println(b + "," + c + "," + d + "," + a);
   }
   
   // 7 BACD 
   else if (b > a & a > c & c > d) {
   System.out.println(d + "," + c + "," + a + "," + b);
   }
   
   // 8 BADC
   else if (b > a & a > d & d > c) {
   System.out.println(c + "," + d + "," + a + "," + b);
   }
   
   // 9 BDAC
   else if (b > d & d > a & a > c) {
   System.out.println(c + "," + a + "," + d + "," + b);
   }
   
   // 10 BDCA
   else if (b > d & d > c & c > a) {
   System.out.println(a + "," + c + "," + d + "," + b);
   }
   
   // 11 BCAD
   else if (b > c & c > a & a > d) {
   System.out.println(d + "," + a + "," + c + "," + b);
   }
   
   // 12 BCDA
   else if (b > c & c > d & d > a) {
   System.out.println(a + "," + d + "," + c + "," + b);
   }
   
   // 13 CABD
   else if (c > a & a > b & b > d) {
   System.out.println(d + "," + b + "," + a + "," + c);
   }
   
   // 14 CADB
   else if (c > a & a > d & d > b) {
   System.out.println(b + "," + d + "," + a + "," + c);
   }
   
   // 15 CBAD 
   else if (c > b & b > a & a > d) {
   System.out.println(d + "," + a + "," + b + "," + c);
   }
   
   // 16 CBDA
   else if (c > b & b > d & d > a) {
   System.out.println(a + "," + d + "," + b + "," + c);
   }
   
   // 17 CDAB
   else if (c > d & d > a & a > b) {
   System.out.println(b + "," + a + "," + d + "," + c);
   }
   
   // 18 CDBA
   else if (c > d & d > b & b > a) {
   System.out.println(a + "," + b + "," + d + "," + c);
   }
   
   // 19 DABC
   else if (d > a & a > b & b > c) {
   System.out.println(c + "," + b + "," + a + "," + d);
   }
   
   // 20 DACB
   else if (d > a & a > c & c > b) {
   System.out.println(b + "," + c + "," + a + "," + d);
   }
   
   // 21 DBAC
   else if (d > b & b > a & a > c) {
   System.out.println(c + "," + a + "," + b + "," + d);
   }
   
   // 22 DBCA
   else if (d > b & b > c & c > a) {
   System.out.println(a + "," + c + "," + b + "," + d);
   }
   
   // 23 DCAB
   else if (d > c & c > a & a > b) {
   System.out.println(b + "," + a + "," + c + "," + d);
   }
   
   // 24 DCBA
   else if (d > c & c > b & b > a) {
   System.out.println(a + "," + b + "," + c + "," + d);
   }

}





}

