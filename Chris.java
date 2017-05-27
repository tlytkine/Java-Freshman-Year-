import java.util.Scanner;
public class Chris {
public static void main(String[]args) {
Scanner scnr = new Scanner(System.in);
System.out.println("Hello Chris.");
System.out.println("Enter how much money you would like.");
long n = 0;
n = scnr.nextInt();
for (int i=0; i<n; i++) {
if (n < 1000000) {
System.out.println("Not enough money.");
System.out.println("Enter how much money you would like.");
n = scnr.nextInt();
}
}
System.out.println("");
System.out.println("Congratulations Chris!");
System.out.println("");
System.out.println("Your bank account balance is: " + n);
}
}