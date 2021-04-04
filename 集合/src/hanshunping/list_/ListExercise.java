package hanshunping.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author zarek
 * @version 1.0.0
 * @since 1.0.0
 */
public class ListExercise {
    @SuppressWarnings("all")
    public static void main(String[] args)
    {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.add(1,"韩顺平教育");
        System.out.println("第五个元素为："+list.get(4));
        list.remove(5);
        list.set(6,"hello");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("obj:"+next);
        }

    }
}
