import java.util.*;

/*
1.1 每个集合对象的创建
    Set<E> hashSet = new HashSet<>();

1.2 向集合中添加元素  add()
1.3 从集合中取出某个元素
1.4 遍历集合 构造器遍历 转换为List集合遍历 用foreach遍历
1.5 测试HashSet集合的特点：无序不可重复
 */

public class HashSetTest {
    public static void main(String[] args) {
//        Set<String> hashSet = new HashSet<>();

//        hashSet.add("zhaoruiahg");
//        hashSet.add("negda");
//        hashSet.add("hello world");
//        hashSet.add("hello world");
//


//        Iterator<String> iterator = hashSet.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//


//        for (String s : hashSet){
//            System.out.println(s);
//        }


//        for (int i = 0; i < hashSet.size(); i++) {
//            System.out.println(hashSet.toString());
//        }


//        List<String> list = new ArrayList<>(hashSet);
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

        //创建Set集合，存储Student集合
        Set<Student> hashSet = new HashSet<>();
        hashSet.add(new Student(001,"小白龙"));
        hashSet.add(new Student(002,"孙悟空"));
        hashSet.add(new Student(003,"猪八戒"));
        hashSet.add(new Student(004,"沙僧"));
        hashSet.add(new Student(005,"唐僧"));

        List<Student> list = new ArrayList<Student>(hashSet);
//        list.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o2.no - o1.no;
//            }
//        });
//        Collections.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.no - o2.no;
//            }
//        });

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            int no = list.get(i).no;
            String name = list.get(i).name;
            System.out.println("姓名：" + name + ",编号：" + no);

        }

    }
}


class  Student implements Comparable<Student> {
    int no;
    String name;

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return no == student.no &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, name);
    }

    @Override
    public int compareTo(Student o) {
        return this.no - o.no;
    }
}