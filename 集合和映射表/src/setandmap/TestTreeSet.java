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
		
		System.out.println("TreeSet内存储数据为："+treeSet);
		
		System.out.println("first():"+treeSet.first());			//返回集合第一个字符
		System.out.println("last():"+treeSet.last());			//返回集合最后一个字符
		System.out.println("headSet(\"New York\"):"+treeSet.headSet("New York"));//返回New York之前的字符
		System.out.println("tailSet(\"New York\"):"+treeSet.tailSet("New York"));//返回New York之后的字符
		System.out.println("lower(\"P\"): " + treeSet.lower("P"));//返回小于P的最大元素
	    System.out.println("higher(\"P\"): " + treeSet.higher("P"));//返回大于P的最小元素
	    System.out.println("floor(\"P\"): " + treeSet.floor("P"));//返回小于等于P的最大元素
	    System.out.println("ceiling(\"P\"): " + treeSet.ceiling("P"));//返回大于等于P的最小元素
	    System.out.println("pollFirst(): " + treeSet.pollFirst());//返回并删除头元素
	    System.out.println("pollLast(): " + treeSet.pollLast());//返回并删除尾元素
	    System.out.println("New tree set: " + treeSet);//打印删除元素后的新集合
	}

}
