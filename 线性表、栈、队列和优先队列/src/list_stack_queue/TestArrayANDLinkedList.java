package list_stack_queue;
import java.util.*;
public class TestArrayANDLinkedList {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(5);
		arrayList.add(1);
		arrayList.add(7);
		System.out.println("线性表arrayList内含有数据为：");
		System.out.println(arrayList);
		System.out.println();
		/*
		 * LinkedList<String> linkedList = new LinkedList<String>(arrayList);
		 * 有两处错误，前面参数不应为String而应为Object
		 * 后面一样
		 */
		LinkedList<Object> linkedList = new LinkedList<>(arrayList);
		
		linkedList.add(1, "red");
		linkedList.removeLast();
		linkedList.addFirst("yellow");
		
		ListIterator<Object> iterator = linkedList.listIterator();
		System.out.println("正序显示链表内容：");
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");			
		}
		System.out.println();
		System.out.println();
		iterator = linkedList.listIterator(linkedList.size());
		System.out.println("反序显示链表内容：");
		while (iterator.hasPrevious()) {
			System.out.print(iterator.previous()+" ");
		}
		System.out.println();
	}

}
