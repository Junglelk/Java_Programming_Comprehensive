# ����*Generic*

���Ϳ��Բ��������͡��ŵ��ǿ����ڱ���ʱ����������ʱ��������
��JDK1.5��ʼ�����巺���ࡢ���ͽӿڡ����ͷ�����

## �����ࡢ�ӿ�

```java
package java.lang
public interface Comparable<T>{
	public int compareTo(T o)
}//���ͽӿ�
//<T>��ʾ��ʽ��������
```

*��ʽ��������*������*ʵ�ʾ�������*�滻���滻�������ͳ�Ϊ*����ʵ����*��

```java
ArrayList<String> list = new ArrayList<>();
```

�����������һ���ַ��������Ա�list��ֻ������ַ��������������������
��������ֻ���������ͣ�������int,double��char������������滻�������͡�

## ���ͷ���

���ͷ�������

```java
public static <E> �������� ������{

}
```

����

```java
����.<E>���ͷ�����(����);
//��
���ͷ����� (����);
```

���磺

```java
public class GenericMethodDemo {

	public static void main(String[] args) {
		Integer[] integers = {1,2,3,4,5,6,7};
		String[]  strings  = {"red","blue","black","yellow","pink"};
		/*
		 * �˴�Ҳ����ֱ����
		 * print(integers);
		 * print(string);
		 */
		GenericMethodDemo.<Integer>print(integers);
		GenericMethodDemo.<String>print(strings);
	}
	
	public static <E> void print(E[] list) {
		for(int i = 0;i<list.length;i++) {
			System.out.print(list[i]+" ");
		}
		System.out.println();
	}
}
```

*���޵�* ��������

```java
public static <E extends GeometricObject> boolean equalArea(E object1 , E object2){
	//��ʱ�ķ���ֻ����Geometric��������
}
```

���⻰��д���ⷢ�ֱ����ƺ�û��JavaFX������...


