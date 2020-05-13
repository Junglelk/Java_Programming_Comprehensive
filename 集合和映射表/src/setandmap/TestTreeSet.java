package setandmap;

import java.util.*;

public class TestTreeSet {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("London");
		set.add("Paris");
		set.add("Shanghai");
		set.add("New York");
		set.add("San Francisco");
		set.add("Beijing");
		set.add("Shanghai");
		System.out.println(set);
		TreeSet<String> treeSet = new TreeSet<String>(set);
		
		System.out.println("TreeSet�ڴ洢����Ϊ��"+treeSet);
		
		System.out.println("first():"+treeSet.first());			//���ؼ��ϵ�һ���ַ�
		System.out.println("last():"+treeSet.last());			//���ؼ������һ���ַ�
		System.out.println("headSet(\"New York\"):"+treeSet.headSet("New York"));//����New York֮ǰ���ַ�
		System.out.println("tailSet(\"New York\"):"+treeSet.tailSet("New York"));//����New York֮����ַ�
		System.out.println("lower(\"P\"): " + treeSet.lower("P"));//����С��P�����Ԫ��
	    System.out.println("higher(\"P\"): " + treeSet.higher("P"));//���ش���P����СԪ��
	    System.out.println("floor(\"P\"): " + treeSet.floor("P"));//����С�ڵ���P�����Ԫ��
	    System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));//���ش��ڵ���P����СԪ��
	    System.out.println("pollFirst(): " + treeSet.pollFirst());//���ز�ɾ��ͷԪ��
	    System.out.println("pollLast(): " + treeSet.pollLast());//���ز�ɾ��βԪ��
	    System.out.println("New tree set: " + treeSet);//��ӡɾ��Ԫ�غ���¼���
	}

}
