# 泛型*Generic*

泛型可以参数化类型。优点是可以在编译时而不是运行时检测出错误。
从JDK1.5开始允许定义泛型类、泛型接口、泛型方法。

## 泛型类、接口

```java
package java.lang
public interface Comparable<T>{
    public int compareTo(T o)
}//泛型接口
//<T>表示形式泛型类型
```

*形式泛型类型*可以用*实际具体类型*替换，替换泛型类型称为*泛型实例化*。

```java
ArrayList<String> list = new ArrayList<>();
```

上述代码产生一个字符串的线性表，list内只能添加字符串，否则会产生编译错误。
泛型类型只能是引用型，不能是int,double或char这类基本类型替换泛型类型。

## 泛型方法

泛型方法声明

```java
public static <E> 返回类型 方法名{

}
```

调用

```java
类名.<E>泛型方法名(变量);
//或
泛型方法名 (变量);
```

例如：

```java
public class GenericMethodDemo {

    public static void main(String[] args) {
        Integer[] integers = {1,2,3,4,5,6,7};
        String[]  strings  = {"red","blue","black","yellow","pink"};
        /*
         * 此处也可以直接用
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

*受限的* 泛型类型

```java
public static <E extends GeometricObject> boolean equalArea(E object1 , E object2){
    //此时的泛型只能是Geometric的子类型
}
```

题外话，写到这发现本章似乎没有JavaFX的内容...
