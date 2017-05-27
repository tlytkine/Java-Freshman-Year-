import java.util.Scanner;
public class cc {
	public static void main(String[]args){
		Scanner scnr  = new Scanner(System.in);
		String input = "";
		System.out.println("Caesar's Cypher");
		System.out.println("Enter the statement which you would like encrypted.");
		input = scnr.nextLine();
		int s = input.length();
		Queue cc = new Queue(s); // makes new Queue with size of string taken as input from user
		System.out.println("Enter the integer value of the key.");
		int z = 0;
		z = scnr.nextInt();

		for(int i=0; i<s; i++){
		char x = input.charAt(i);
		x+=z;
		cc.enqueue(x);
		System.out.print(x);
		}
		System.out.println();



		

	}
}