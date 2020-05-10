package list_stack_queue;

import java.util.Comparator;

@SuppressWarnings("serial")
public class GeometricObjectComparator implements Comparator<GeometricObject> , java.io.Serializable{
	@Override
	public int compare(GeometricObject arg0, GeometricObject arg1) {
		double area0 = arg0.getArea();
		double area1 = arg1.getArea();
		
		return area0>area1 ? 1 :(area0<area1 ? -1:0);
	}

}
