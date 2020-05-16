package setandmap;

import java.util.*;

public class TestMap {

	public static void main(String[] args) {
		
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		
		hashMap.put("����", 23);
		hashMap.put("����", 25);
		hashMap.put("����", 27);
		hashMap.put("ţ��", 38);
		hashMap.put("����", 65);
		
		System.out.println(hashMap);
		Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>(16,0.75f,true);
		//��ʱ������linkedHashMap�ǿɰ�����˳������ 
		
		linkedHashMap.put("����", 29);
		linkedHashMap.put("����", 25);
		linkedHashMap.put("����", 54);
		linkedHashMap.put("ţ��", 38);
		linkedHashMap.put("����", 65);
		System.out.println(linkedHashMap);
		/*
		 * ��������˳������
		 */
		System.out.println(linkedHashMap.get("����"));//����һ���ֶκ󣬰�����˳������
		System.out.println(linkedHashMap);
		
		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("a", 29);
		treeMap.put("c", 25);
		treeMap.put("e", 54);
		treeMap.put("d", 38);
		treeMap.put("b", 65);
		
		System.out.println(treeMap);//treeĬ�ϰ�������������
		
	}

}
