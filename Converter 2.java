import java.util.Stack;
import java.util.*;
import java.util.Scanner;
	public class Converter {
		public static void main(String[]args){

			Scanner scnr = new Scanner(System.in);

			System.out.println("Infix to Postfix (Reverse Polish Notation) Converter");
			System.out.println("");
			
			System.out.println("Test 1:");
			String test1 = "A+B";
			System.out.println("Infix: " + test1);
			String output1 = Converter(test1);
			System.out.println("Postfix: " + output1);
			System.out.println("");
			System.out.println("Test 2:");
			String test2 = "A+B-C";
			System.out.println("Infix: " + test2);
			String output2 = Converter(test2);
			System.out.println("Postfix: " + output2);
			System.out.println("");
			System.out.println("Test 3:");
			String test3 = "(A+B)*(C+D)";
			System.out.println("Infix: " + test3);
			String output3 = Converter(test3);
			System.out.println("Postfix: " + output3);
			System.out.println("");
			System.out.println("Test 4:");
			String test4 = "(A+B)*C-(D-E)*(F+G)";
			System.out.println("Infix: " + test4);
			String output4 = Converter(test4);
			System.out.println("Postfix: " + output4);
			System.out.println("");
			
			/*
			System.out.println("Please enter an expression to be converted.");
			String userinput = scnr.nextLine();
			System.out.println("Infix: " + userinput);
			String useroutput = Converter(userinput);
			System.out.println("Postfix: " + useroutput);
			System.out.println("");
			*/


		}
		public static String Converter(String infix) {
			String rpn = " ";
			Character open = '(';
			Character close = ')';
			Character plus = '+';
			Character minus = '-';
			Stack<Character> st = new Stack<Character>();
			int i = 0; int j = 0;
			for(i=0; i<infix.length(); ++i){
				char x = infix.charAt(i);
				if (x == '('){
					st.push(x);
				}
				else if (x == ')'){
					Character y = st.peek();
					while(!(y.equals('(')) && !(st.isEmpty())) {
						rpn += y.charValue();
						st.pop();
						y = st.peek();
					}
					st.pop();
				}
				else if (Order(x)==2){
					if(st.isEmpty()) {
						st.push(x);
					}
					else {
						Character y = st.peek();
                    while (!(st.isEmpty() || y.equals(open) || y.equals(close))){
                        st.pop();
                        rpn += y.charValue();
                    }
                    st.push(x);
                }
            }
            else if (Order(x)==1) {
                if (st.isEmpty()) {
                    st.push(x);
                } else {
                    Character y = st.peek();
                    while (!y.equals(plus) && !y.equals(minus) && !st.isEmpty()) {
                        st.pop();
                        rpn += y.charValue();
                    }
                    st.push(x);
                }
            	} 
            	else {
                rpn += x;
            				}
        		}
        while (!st.isEmpty()) {
            Character y = st.peek();
            if (!y.equals(new Character('('))) {
                st.pop();
                rpn += y.charValue();
            }
        }
        return rpn;
		}
			
		public static int Order(char y){
			char test = y;
			int x = 0;
			if ((test == '*') || (test == '/')){
				x = 1;
			}
			else if ((test == '+') || (test == '-')){
				x = 2;
			}
			return x;
		}
		}


	
