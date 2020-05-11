package list_stack_queue;

public class TestQueue {

	public static void main(String[] args) {
		java.util.Queue<String> queue = new java.util.LinkedList<String>();
		
		queue.offer("鸡");
		queue.offer("鸭");
		queue.offer("鹅");
		queue.offer("老鹰");
		queue.offer("铁锤");
		queue.offer("钢弹");
		
		while (!queue.isEmpty()) {
			System.out.print(queue.remove()+" ");
			
		}
	}

}
