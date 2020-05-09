package application;

public class AnyWildCardDemo {

	public static void main(String[] args) {
		GenericStack<Integer> intStack = new GenericStack<>();
		
		intStack.push(1);
		intStack.push(7);
		intStack.push(5);
		intStack.push(-5);
		
		print(intStack);
		
	}
	/*
	 * 此处换为print(GenericStack<Object> stack){
	 * }会出错，因为GenericStack<Integer>不是GenericStack<Object>的子类型
	 */
	public static void print(GenericStack<?> stack) {
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}
}
