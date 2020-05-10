package list_stack_queue;

import java.util.*;

public class TestIterator {

	public static void main(String[] args) {
		Collection<String> colltection = new ArrayList<>();
		
		colltection.add("new york");
		colltection.add("dallas");
		colltection.add("madison");
		colltection.add("england");
		colltection.add("atlanta");
		colltection.add("mesa");
		
		Iterator<String> iterator = colltection.iterator();
		
		while (iterator.hasNext()) {
			System.out.print(iterator.next().toUpperCase()+" ");
			
		}
		System.out.println();
	}
}
