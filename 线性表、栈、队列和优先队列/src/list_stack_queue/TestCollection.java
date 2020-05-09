package list_stack_queue;

import java.util.*;

public class TestCollection {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList<String> collection1 = new ArrayList<>();
		
		collection1.add("北京");
		collection1.add("上海");
		collection1.add("南京");
		collection1.add("保定");
		collection1.add("天津");
		
		System.out.println("collection1 中的城市列表为：");
		System.out.println(collection1);
		
		System.out.println("南京在collection1内吗？"+collection1.contains("南京"));
		collection1.remove("南京");
		System.out.println("移除一个城市后，现在有 " + collection1.size()+" 个城市在collection1");
		
		Collection<String> collection2 = new ArrayList<>();
		
		collection2.add("广州");
		collection2.add("保定");
		collection2.add("厦门");
		collection2.add("天津");
		collection2.add("苏州");
		
		System.out.println("collection2有哪些城市？");
		System.out.println(collection2);
		/*
		 * 取并集
		 */
		ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
		c1.addAll(collection2);
		System.out.println("collection1和collection2内城市共有");
		System.out.println(c1);
		
		/*
		 * 取交集
		 */
		c1 = (ArrayList<String>)(collection1.clone());
		c1.retainAll(collection2);
		System.out.println("collection1和collection2内城市交集为");
		System.out.println(c1);
		
		/*
		 * 取差集
		 */
		c1 = (ArrayList<String>)(collection1.clone());
		c1.removeAll(collection2);
		System.out.println("collection1和collection2内城市差集为");
		System.out.println(c1);
	}
}