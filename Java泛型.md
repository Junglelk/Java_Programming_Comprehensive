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

## 通配泛型

非受限通配、受限通配和下限通配。

* 非受限通配
  * <\?> 相当于<? extends Object>
* 受限通配
  * <\? extends T>，表示T或T的子类
  
 ```java
  public class WildCardNeedDemo {

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();

        intStack.push(1);
        intStack.push(7);
        intStack.push(5);
        intStack.push(-5);

        System.out.print("最大数为："+max(intStack));

    }
//意指传入的类型为Number的子类即可
    public static double  max(GenericStack<? extends Number> stack) {
        double max = stack.pop().doubleValue();
        while (!stack.isEmpty()) {
            double value = stack.pop().doubleValue();
            if(value>max) max = value;
        }

        return max;
    }

}
```

* 下限通配
  * <\? super T>, 表示T或T的一个父类。

```java
public class SuperWildCardDemo {

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        GenericStack<Object> stack2 = new GenericStack<>();
        stack2.push("Java");
        stack2.push(2);
        stack1.push("sun");
        add(stack1,stack2);
        AnyWildCardDemo.print(stack2);
    }
    public static <T>void add(GenericStack<T> stack1 , GenericStack<? super T> stack2) {
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
}
```
