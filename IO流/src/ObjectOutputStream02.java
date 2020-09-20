/*
一次序列化多个对象？
    可以，可以将对象放在集合当中，序列化集合。

提示：
    参与序列化的ArrayList集合以及集合中的元素User都需要实现java.io.Serializable接口。
 */

import bean.User;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStream02 {
    public static void main(String[] args) throws Exception{
        List<User> userList = new ArrayList<>();
        userList.add(new User(1,"zhangsan"));
        userList.add(new User(2,"lisi"));
        userList.add(new User(3,"王五"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("User"));
        //序列化集合，这个集合对象中放了很多其他对象。
        oos.writeObject(userList);

        oos.flush();
        oos.close();
    }
}
