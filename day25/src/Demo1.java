import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();

        Product p1 = new Product(1,"可乐");
        Product p2 = new Product(2,"可乐");


        System.out.println(p1.equals(p2));

        System.out.println("p1的hashCode="+p1.hashCode());
        System.out.println("p2的hashCode="+p2.hashCode());

        set.add(p1);
        set.add(p2);

        for(Product data : set){
            System.out.println(data);
        }

    }
}
