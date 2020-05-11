package list_stack_queue;

import java.util.Stack;

public class EvaluateExpression {

	public static void main(String[] args) {
		String[] s = {"(18+21)*3-58"};
		args=s.clone();
		if (args.length!=1) {
			System.out.println("usage:input java expression:");
			System.exit(1);
		}
		try {
			System.out.println(evaluateExpression(args[0]));;
		} catch (Exception ex) {
			System.out.println("wrong expression:"+args[0]);
		}
	}
	
	public static int evaluateExpression(String args) {
		
		Stack<Integer> operand    = new Stack<Integer>();
		Stack<Character> operator = new Stack<Character>();
		String expression = insterBlank(args);
		String[] tokens = expression.split(" ");
		
		for (String token : tokens) {
			if (token.length()==0) {
				continue;
			}
			else if (token.charAt(0)=='+'||token.charAt(0)=='-') {
				while (!operator.isEmpty()&&
						(operator.peek()=='+'||
						operator.peek()=='-'||
						operator.peek()=='*'||
						operator.peek()=='/')){
					/*
					 * 此处运算符栈非空和栈顶为加减乘除为之一为栈顶为且
					 * 的关系，下同理
					 */
					processAnOperator(operand, operator);
				}
				operator.push(token.charAt(0));
			}
			else if (token.charAt(0)=='*'||token.charAt(0)=='/') {
				while (!operator.isEmpty()&&
						(operator.peek()=='*'||
						operator.peek()=='/')) {
					processAnOperator(operand, operator);
				}
				operator.push(token.charAt(0));
			}
			else if (token.trim().charAt(0)=='(') {
				operator.push('(');
			}
			else if (token.trim().charAt(0)==')') {
				while (operator.peek()!='(') {
					processAnOperator(operand, operator);
				}
				operator.pop();
			}
			else operand.push(Integer.valueOf(token));
			/*
			 * String转Integer的方式
			 */
		}
		
		while (!operator.isEmpty()) {
			processAnOperator(operand, operator);
		}
		return operand.pop();
	}
	
	public static void processAnOperator(Stack<Integer> operand, Stack<Character> operator) {
		char op = operator.pop();
		int op1 = operand.pop();
		int op2 = operand.pop();
		if(op == '+')
			operand.push(op2+op1);
		else if (op == '-') 
			operand.push(op2-op1);
		else if (op == '*') 
			operand.push(op2*op1);					
		else if (op == '/') 
			operand.push(op2/op1);			
		
	}
	
	public static String insterBlank(String args) {
		String result = "";
		for (int i = 0; i < args.length(); i++) {
			if(args.charAt(i)=='+'||args.charAt(i)=='-'||args.charAt(i)=='*'||args.charAt(i)=='/'||args.charAt(i)=='('
					||args.charAt(i)==')') {
				result = result + " "+args.charAt(i)+" ";
			}
			else 
				result += args.charAt(i);
		}
		return result;
	}

}
