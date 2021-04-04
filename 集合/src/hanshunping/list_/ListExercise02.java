package hanshunping.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zarek
 * @version 1.0.0
 * @since 1.0.0
 */
public class ListExercise02 {
    public static void main(String[] args)
    {
        List list = new ArrayList();
        list.add(new Book("红楼梦","曹雪芹",24));
        list.add(new Book("水浒传","施耐庵",53));
        list.add(new Book("西游记","吴承恩",45));
        list.add(new Book("三国","罗贯中",13));
        System.out.println(list);
        sort(list);
        System.out.println(list);
    }

    public static void sort(List list)
    {

        int length = list.size();
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                // 冒泡排序
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j+1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }


}

class Book {

    private String name;
    private String author;
    private Integer price;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public Integer getPrice()
    {
        return price;
    }

    public void setPrice(Integer price)
    {
        this.price = price;
    }

    public Book(String name, String author, Integer price)
    {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return "Book " + name + "\tAuthor " + author + "\tPrice " + price;
    }
}

