package hanshunping.list_;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zarek
 * @version 1.0.0
 * @since 1.0.0
 */
public class ArrayListSource {
    public static void main(String[] args)
    {
        List list = new LinkedList();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        for (Object o :list) {
            System.out.println("o = " + o);
        }

    }
}
