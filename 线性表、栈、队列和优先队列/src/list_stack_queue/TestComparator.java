package list_stack_queue;

public class TestComparator {

	public static void main(String[] args) {
		GeometricObject g1 = new Rectangle(3,5);
		GeometricObject g2 = new Circle(8);
		
		GeometricObject g  = max(g1,g2,new GeometricObjectComparator()); 
		
		System.out.printf("最大的GeometricObject为：%.2f", g.getArea());
	}

	public static GeometricObject max(GeometricObject g1 ,GeometricObject g2 ,GeometricObjectComparator compare) {
		if(compare.compare(g1, g2)>0) return g1;
		else return g2;
	}
}
