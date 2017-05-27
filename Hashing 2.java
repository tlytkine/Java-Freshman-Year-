import java.util.Scanner;

public class Hashing {


	public static int HashingFunction(String x){
		char y [];
		int temp = 0;
		y = x.toCharArray();
		int l = x.length();
		for(int i=0; i< l; i++){
			temp+= y[i]; 
		}
		return temp % 12;
	}


	
	
	public static void main(String[]args){

	}
}