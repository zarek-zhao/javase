package hanshunping.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zarek
 * @version 1.0.0
 * @since 1.0.0
 */
public class CollectionMethod {
    @SuppressWarnings("all")
    public static void main(String[] args)
    {

        List list = new ArrayList();
        list.add(new Person("赵云", 85));
        list.add(new Person("关羽", 23));
        list.add(new Person("张飞", 34));
        list.add(new Person("刘备", 56));

        // 使用迭代器对实现iterable的集合进行遍历
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            System.out.println("obj=" + next);
//        }

        // 如果使用同一迭代器进行二次遍历，需要将迭代器进行重置，如果不进行重置，会报noSuchElementException
//        iterator = list.iterator();
//        System.out.println("第二次遍历");
//        while (iterator.hasNext()) {
//            Object next = iterator.next();
//            System.out.println("obj=" + next);
//        }

        // 使用增强for循环进行遍历，增强for可以理解成简化版的iterator，快捷键方式 I
        for (Object o : list) {
            System.out.println("book=" + o);
        }

        // 增强for循环可以使用于数组的遍历
    }

}

class Person {
    private String name;
    private int age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
