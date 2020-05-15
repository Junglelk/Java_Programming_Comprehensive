package setandmap;

import java.util.*;
import java.io.*;

public class CountKeywords {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);		
		/*
		 * �Ӽ��̶�ȡ����
		 * �Լ���������ļ�·�����������ļ���ʵ��
		 * �������ļ�ʵ��������������
		 * ������������һ�������ļ�ʵ��
		 * ����һ���ؼ��ּ���
		 * �Լ����ļ�ʵ��������
		 * ����������������ѭ���������ж�����Ϊcontains(words)
		 * ������������Ҫ�׳��쳣
		 */
		System.out.println("�����ļ�Ŀ¼");
		File file = new File(input.nextLine());
		input.close();
		if(file.exists()) {
			System.out.println("�ļ��ڹؼ��ָ���Ϊ��"+countKeywords(file));
		}
		else System.out.println("�ļ�������");
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
		 * ���д���Ǵ����
		 * ��ΪkeywordString�������ַ������飬���Ƿ���ʵ��
		 * Ӧ����Arrayת������
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
