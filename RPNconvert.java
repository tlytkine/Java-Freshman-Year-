import java.util.Stack;

public class RPNconvert{

	public static void main(String[]args) {
			String input1 = "A+B";
			System.out.println("Test 1:");
			System.out.println("Input:");
			System.out.println(input1);
			String output1 = RPNconvert(input1);
			System.out.println("Output:");
			System.out.println(output1);
	}	

	public static String RPNconvert(String expressionSIN){
		String x = expressionSIN;
		Stack y = new Stack();
		String expressionRPN = "";
		boolean first = false;
		for(int i = 0; i < x.length(); i++){
			char current = x.charAt(i);
			if(!Operations(current)){
				expressionRPN += Character.toString(current);
				if(i == (x.length()-1)){
					while(!y.empty()){
						expressionRPN += y.pop();
					}
				}
			}else{
				if(first){
					if(AddSubtract(current) && AddSubtract((Character)y.peek())){
						expressionRPN += y.pop();
						y.push(current);
						if(i == (x.length()-1)){
							while(!y.empty()){
								expressionRPN += y.pop();
							}
						}
					}else if(MultiplyDivide(current) && MultiplyDivide((Character)y.peek())){
						expressionRPN += y.pop();
						y.push(current);
						if(i == (x.length()-1)){
							while(!y.empty()){
								expressionRPN += y.pop();
							}
						}
					}else if(AddSubtract(current) && MultiplyDivide((Character)y.peek())){
						expressionRPN += y.pop();
						y.push(current);
						if(i == (x.length()-1)){
							while(!y.empty()){
								expressionRPN += y.pop();
							}
						}
					}else if(MultiplyDivide(current) && AddSubtract((Character)y.peek())){
						y.push(current);
						if(i == (x.length()-1)){
							while(!y.empty()){
								expressionRPN += y.pop();
							}
						}
					}else{
						expressionRPN += Character.toString(current);
						if(i == (x.length()-1)){
							while(!y.empty()){
								expressionRPN += y.pop();
							}
						}
					}
				}else{
					y.push(current);
					first = true;
				}
			}
		}
		return expressionRPN;
	}

	public static boolean Operations(char z){
		switch(z){
			case '+':
				return true;
			case '-':
				return true;
			case '/':
				return true;
			case '*':
				return true;
			case '^':
				return true;
			default:
				return false;
		}
	}

	public static boolean AddSubtract(char z){
		switch(z){
			case '+':
				return true;
			case '-':
				return true;
			default:
				return false;
		}
	}

	public static boolean MultiplyDivide(char z){
		switch(z){
			case '*':
				return true;
			case '/':
				return true;
			default:
				return false;
		}
	}

}
