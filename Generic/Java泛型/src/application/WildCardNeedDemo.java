package application;


public class WildCardNeedDemo {

	public static void main(String[] args) {
		GenericStack<Integer> intStack = new GenericStack<>();
		
		intStack.push(1);
		intStack.push(7);
		intStack.push(5);
		intStack.push(-5);
		
		System.out.print("最大数为："+max(intStack));

	}
	
	public static double  max(GenericStack<? extends Number> stack) {
		double max = stack.pop().doubleValue();
		while (!stack.isEmpty()) {
			double value = stack.pop().doubleValue();
			if(value>max) max = value;
		}
		
		return max;
	}

}
