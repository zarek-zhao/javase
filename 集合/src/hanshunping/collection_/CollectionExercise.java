package hanshunping.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zarek
 * @version 1.0.0
 * @since 1.0.0
 */
public class CollectionExercise {
    public static void main(String[] args)
    {
        List<Dog> list = new ArrayList<Dog>();
        list.add(new Dog("小黑",3));
        list.add(new Dog("大黄",23));
        list.add(new Dog("大壮",7));

        // 使用增强for循环遍历
        for (Dog o : list) {
            System.out.println("Dog:"+o);
        }

        // 使用迭代器进行遍历
        System.out.println("===== 使用迭代器进行遍历 =====");
        Iterator<Dog> iterator = list.iterator();
        while (iterator.hasNext()) {
            Dog next = iterator.next();
            System.out.println("dog:"+next);
        }


    }
}

class Dog{
    private String name;
    private Integer age;

    public Dog(String name, Integer age)
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

    public Integer getAge()
    {
        return age;
    }

    public void setAge(Integer age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
