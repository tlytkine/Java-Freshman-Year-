import java.util.Scanner;
public class Test {
	public static void main(String[]args){
	int i;
	int j;
	int n;
	int x = 0;
	int count =0;
	Scanner scnr = new Scanner(System.in);
	n = scnr.nextInt();
	for (i=1; i<=n; i++){
		for (j=1; j<=i; j++){
			x=x+5;
			count++;
		}
	}
	System.out.println("The value of x is: " + x);
	System.out.println("The number of additions is: " + count);
	}
}