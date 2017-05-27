import java.util.Stack;
public class Problem1{
public static void main(String[]args){
String input1 = "A+B";
System.out.println("Test 1:");
System.out.println("Input:");
System.out.println(input1);
String output1 = InfixToPostFix(input1);
System.out.println("Output:");
System.out.println(output1);

String input2 = "1+2/3+4+5";
System.out.println("Test 2:");
System.out.println("Input:");
System.out.println(input2);
String output2 = InfixToPostFix(input2);
System.out.println("Output:");
System.out.println(output2);
}

public static String InfixToPostFix(String input) {
    if (input == null)
        return "";
    char[] in = input.toCharArray();
    Stack<Character> stack = new Stack<Character>();
    StringBuilder out = new StringBuilder();

	for (int i = 0; i < in.length; i++)
	        switch (in[i]) {
	        case '+':
	        case '-':
	            while (!stack.empty() && (stack.peek() == '*' || stack.peek() == '/')) {
	                out.append(' ');
	                out.append(stack.pop());
	            }
	            out.append(' ');
	            stack.push(in[i]);
	            break;
	        case '*':
	        case '/':
	            out.append(' ');
	            stack.push(in[i]);
	            break;
	        case '(':
	            stack.push(in[i]);
	            break;
	        case ')':
	            while (!stack.empty() && stack.peek() != '(') {
	                out.append(' ');
	                out.append(stack.pop());
	            }
	            stack.pop();
	            break;
	        
	        default:
	            out.append(in[i]);
	            break;
	        }

    while (!stack.isEmpty())
        out.append(' ').append(stack.pop());

    return out.toString();
}
}