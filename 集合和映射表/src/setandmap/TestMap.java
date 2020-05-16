package setandmap;

import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("张三", 23);
		hashMap.put("李四", 25);
		hashMap.put("王二", 27);
		hashMap.put("牛二", 38);
		hashMap.put("建国", 65);
		
		System.out.println(hashMap);
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>(16,0.75f,true);
		//此时创建的linkedHashMap是可按访问顺序排序 
		
		linkedHashMap.put("张三", 29);
		linkedHashMap.put("李四", 25);
		linkedHashMap.put("王二", 54);
		linkedHashMap.put("牛二", 38);
		linkedHashMap.put("建国", 65);
		System.out.println(linkedHashMap);
		/*
		 * 按照输入顺序排序
		 */
		System.out.println(linkedHashMap.get("王二"));//访问一个字段后，按访问顺序排序
		System.out.println(linkedHashMap);
		
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("a", 29);
		treeMap.put("c", 25);
		treeMap.put("e", 54);
		treeMap.put("d", 38);
		treeMap.put("b", 65);
		
		System.out.println(treeMap);//tree默认按键的升序排序
		
	}

}
