package setandmap;
import java.util.*;
public class TestLinkedHashSet {

	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		
		set.add("Nanjing");
		set.add("Beijing");
		set.add("Shanghai");
		set.add("Xuzhou");
		set.add("Beijing");
		
		System.out.println(set);
		
		for (String string : set) {
			System.out.print(string.toUpperCase() + "  ");
		}
	}
}
