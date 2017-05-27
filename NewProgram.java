import java.util.Scanner;

public class NewProgram {

public static void main(String[]args) {
Scanner scnr = new Scanner(System.in);
int n = 0;
System.out.println("Please enter a number.");
n = scnr.nextInt();
if (n>0) {
System.out.println("This number is positive.");
}
else {
System.out.println("This number is negative.");
}




}
}