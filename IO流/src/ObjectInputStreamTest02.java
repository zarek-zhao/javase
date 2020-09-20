import bean.User;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectInputStreamTest02 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("User"));
//        Object obj = ois.readObject();
//        System.out.println(obj instanceof List);
        List<User> userList = (List<User>)ois.readObject();
        for (User user : userList){
            System.out.println(user);
        }
        ois.close();
    }
}
