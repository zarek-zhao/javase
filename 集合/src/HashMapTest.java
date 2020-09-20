import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//        1.1 每个集合对象的创建
//        1.2 向集合中添加元素
//        1.3 从集合中取出某个元素
//        1.4 遍历集合
public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<>();

        hashMap.put(1,"吕布");
        hashMap.put(2,"赵云");
        hashMap.put(3,"典韦");
        hashMap.put(4,"关羽");
        hashMap.put(5,"马超");
        hashMap.put(6,"张飞");

        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();

//        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        for (Map.Entry<Integer,String> hero : entries){
            System.out.println("英雄：" + hero.getValue() + "战力第" + hero.getKey());

        }

        for (Map.Entry<Integer,String> hero : entries){
            System.out.println(hero);
        }

//        Set<Integer> integers = hashMap.keySet();
//
//        Iterator<Integer> iterator = integers.iterator();
//
//        while (iterator.hasNext()){
//
//            System.out.println(iterator.next());
//        }

    }
}
