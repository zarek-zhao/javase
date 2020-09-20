import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/*
java.util.Collection 集合接口
java.util.Collections 集合工具类,方便集合的操作
 */

public class CollectionTest {
    public static void main(String[] args) {
        //ArrayList集合不是线程安全的
        List<Person> list = new ArrayList<>();

        //通过Collections工具类将非线程安全的集合变为线程安全的集合
        Collections.synchronizedList(list);
        Person p1 = new Person(12);
        Person p2 = new Person(34);
        Person p3 = new Person(23);
        Person p4 = new Person(54);
        Person p5 = new Person(32);
        Person p6 = new Person(12);

        //排序
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);

        Collections.sort(list);

        for (Person s : list){
            System.out.println(s.age);
        }

    }
}

class Person implements Comparable<Person>{
    int age;

    public Person(int age){
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}
