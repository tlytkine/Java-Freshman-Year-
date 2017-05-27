public class oddNumbers {

public static void main(String []args){
 int sum = 0; // variable to hold the sum
 int odd = 1; // first odd number to be added
 for (int i=1; i <= 10; i++){
 sum += odd;
 odd += 2; // incrementing by 2 to get next odd number
 }
 System.out.println(sum);
 }
}