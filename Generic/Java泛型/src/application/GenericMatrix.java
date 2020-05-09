package application;
/*
 * public abstract class GenericMatrix<T extends Number>{
 * }
 * 泛型类在类名后用尖括号包裹泛型标识符
 * 由于矩阵是数字类型，所以将泛型受限为Number的子类
 */
public abstract class GenericMatrix<E extends Number> {
	
	protected abstract  E add(E element1 , E element2);
	protected abstract  E multiply(E element1 , E element2);
	protected abstract  E zero();
	
	@SuppressWarnings("unchecked")
	public E[][]  addMatrix(E[][] matrix1 , E[][] matrix2) {
		if((matrix1.length!=matrix2.length)||(matrix1[0].length!=matrix2[0].length)) {
			throw new RuntimeException("矩阵不同阶");
		}
		
		E[][] result = (E[][]) new Number[matrix1.length][matrix1[0].length];
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				
				result[i][j] = add(matrix1[i][j], matrix2[i][j]);				
			}
			
		}
		return  result;
	}
	
	@SuppressWarnings("unchecked")
	public E[][] multiplyMatrix(E[][] matrix1 , E[][] matrix2){
		if((matrix1[0].length!=matrix2.length)) {
			throw new RuntimeException("矩阵1行阶不等于矩阵2的列阶，不能相乘。");
		}
		
		E[][] result = (E[][]) new Number[matrix1.length][matrix2[0].length];
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[0].length; j++) {
				result[i][j] = zero();
				
				for (int k = 0; k < result.length; k++) {
					result[i][j] = add(result[i][j], multiply(matrix1[i][k], matrix2[k][j]));
					
				}
			}
		}
		return result;
	}
	
	public static void printResult(Number[][] m1 , Number[][] m2 , Number[][] m3 ,char op) {
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[0].length; j++)
				System.out.print(" "+m1[i][j]);
				
			if(i==m1.length/2)
				System.out.print("  "+op+ "  ");
			else 
				System.out.print("    ");
			
			for (int j = 0; j < m2.length; j++) 
				System.out.print(" "+m2[i][j]);
				
			if(i==m1.length/2)
				System.out.print("   = ");
			else 
				System.out.print("    ");
			for (int j = 0; j < m3.length; j++) 
				System.out.print(m3[i][j]+"  ");
			
			System.out.println();
			
			
		}
	}
}
