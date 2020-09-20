import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * java.util.Map接口中常用的方法：
 *  1. Map和Collection没有继承关系
 *  2. Map集合以key和value的方式储存数据：键值对
 *      key和value都是引用数据类型
 *      key起到主导的地位，value是key的一个附属品
 */

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap();
        map.put(1,"张三");
        map.put(2,"李四");
        map.put(3,"扣子");

        map.put(4,"李四");
        map.put(4,"王五");
//
//        Set<Integer> integers = map.keySet();
//        Iterator<Integer> iterator = integers.iterator();
//        while(iterator.hasNext()){
//            Integer key = iterator.next();
//            System.out.println(key + "=" + map.get(key));
//        }
//
//        for(Integer key : integers){
//            System.out.println(map.get(key));
//        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//        for(Map.Entry<Integer, String> data: entries){
//            System.out.println(data);
//        }
        for(Map.Entry<Integer,String> node : entries){
            System.out.println(node.getKey()+"----->"+node.getValue());
        }


    }
}
