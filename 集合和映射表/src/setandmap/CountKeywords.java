package setandmap;

import java.util.*;
import java.io.*;

public class CountKeywords {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);		
		/*
		 * 从键盘读取输入
		 * 以键盘输入的文件路径创建寄生文件类实例
		 * 将寄生文件实例传给计数方法
		 * 计数方法接受一个寄生文件实例
		 * 创建一个关键字集合
		 * 以寄生文件实例做输入
		 * 在仍有输入的情况下循环计数，判断条件为contains(words)
		 * 两个方法都需要抛出异常
		 */
		System.out.println("输入文件目录");
		File file = new File(input.nextLine());
		input.close();
		if(file.exists()) {
			System.out.println("文件内关键字个数为："+countKeywords(file));
		}
		else System.out.println("文件不存在");
	}
	
	public static int countKeywords(File file) throws Exception {
		String[] keywordString = {"abstract", "assert", "boolean", 
		        "break", "byte", "case", "catch", "char", "class", "const",
		        "continue", "default", "do", "double", "else", "enum",
		        "extends", "for", "final", "finally", "float", "goto",
		        "if", "implements", "import", "instanceof", "int", 
		        "interface", "long", "native", "new", "package", "private",
		        "protected", "public", "return", "short", "static", 
		        "strictfp", "super", "switch", "synchronized", "this",
		        "throw", "throws", "transient", "try", "void", "volatile",
		        "while", "true", "false", "null"};
		/*
		 * Set<String> keySet = new HashSet<String>(keywordString);
		 * 这个写法是错误的
		 * 因为keywordString本身是字符串数组，不是泛型实例
		 * 应当用Array转换才行
		 */
		
		Set<String> keySet = new HashSet<String>(Arrays.asList(keywordString));
		int count = 0;
		Scanner input = new Scanner(file);
		while(input.hasNext()) {
			String word = input.next();
			if(keySet.contains(word)) {
				count++;
			}
		}
		input.close();
		return count;
	}

}
