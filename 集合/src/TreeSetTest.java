
//        1.1 每个集合对象的创建
//        1.2 向集合中添加元素
//        1.3 从集合中取出某个元素
//        1.4 遍历集合
//        1.5 测试TreeSet集合的特点：有序不可重复
//        1.6 测试TreeSet集合中存储的类型是自定义的
//        1.7 测试实现Comparable接口的方式
//        1.8 测试实现Comparator接口的方式（测试一下匿名内部类）

import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
//        Set<Integer> treeSet = new TreeSet<>();
//
//        treeSet.add(12);
//        treeSet.add(14);
//        treeSet.add(423);
//        treeSet.add(134);
//        treeSet.add(14);
//        treeSet.add(5);
//        treeSet.add(134);
//
//        Iterator<Integer> iterator = treeSet.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println("------------------");
//        iterator = treeSet.iterator();
//        for(;iterator.hasNext(); System.out.println(iterator.next()));

//        List<Integer> list = new ArrayList<>(treeSet);
//
//        for (int i = 0;i < list.size();i++){
//            int a  = list.get(i);
//            System.out.println(a);
//        }

//
//        for(Integer i : treeSet){
//            System.out.println(i);
//        }

        //创建一个TreeSet集合，添加商品对象
        Set<Product> treeSet = new TreeSet<>();

        treeSet.add(new Product(3.5,"可乐"));
        treeSet.add(new Product(0.5,"亲嘴烧"));
        treeSet.add(new Product(4,"青柠蜜柚"));
        treeSet.add(new Product(12,"捞仔饭"));
        treeSet.add(new Product(3.5,"可乐"));



//        for (Product p : treeSet){
//            System.out.println(p);
//        }
    }
}

class Product implements Comparable<Product> {

    double price;
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public Product() {
    }

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public int compareTo(Product o) {
        int result = 0;
        if((this.price - o.price) > 0){
            return 1;
        }else if((this.price - o.price) < 0){
            return -1;
        }else{
            return 0;
        }
    }
}
