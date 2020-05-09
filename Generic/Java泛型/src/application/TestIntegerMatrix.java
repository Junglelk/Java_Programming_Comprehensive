package application;

public class TestIntegerMatrix {

	public static void main(String[] args) {
		Integer[][] m1 = {{1,2,5,4},{5,8,9,1},{7,2,7,4},{3,5,2,1}};
		Integer[][] m2 = {{7,2,2,4},{5,3,9,2},{7,9,5,4},{4,5,6,1}};
		
		IntegerMatrix integer = new IntegerMatrix();
		System.out.println("m1+m2为 ");
		GenericMatrix.printResult(m1, m2, integer.addMatrix(m1, m2), '+');
		
		System.out.println("m1*m2为 ");
		GenericMatrix.printResult(m1, m2, integer.multiplyMatrix(m1, m2), '*');
	}

}
