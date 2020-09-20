/*
1. TreeSet集合底层实际上是一个TreeMap
2. TreeMap集合底层是一个二叉树
3. 方法TreeSet集合中的元素，等同于放到TreeMap集合key部分了。
4. TreeSet集合中的元素：无序不可重复，但是可以按照元素的大小自动排序。
称为：可排序集合
 */


import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("张三");
        ts.add("李四");
        ts.add("王五");


        for(String s : ts){
            System.out.println(s);
        }


    }
}
