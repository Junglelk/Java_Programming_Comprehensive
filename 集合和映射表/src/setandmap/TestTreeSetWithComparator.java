package setandmap;
import java.util.*;
public class TestTreeSetWithComparator {

	public static void main(String[] args) {
		Set<GeometricObject> set = new TreeSet<>(new GeometricObjectComparator());
		
		set.add(new Circle(40));
		set.add(new Rectangle(5,9));
		set.add(new Circle(35));
		set.add(new Rectangle(5,7));
		
		System.out.println("对Geometric Object已排序的集合：");
		for (GeometricObject geometricObject : set) {
			System.out.println("面积 = "+geometricObject.getArea());
		}
	}		
}
