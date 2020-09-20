package bean;

import java.io.Serializable;

public class Student implements Serializable {
    //IDEA工具自动生成序列化版本号
    private static final long serialVersionUID = -400632359059465835L;
    //Java虚拟机看到Serializable接口之后，会自动生成一个序列化版本号。
    //这里没有手动写出来，java虚拟机会默认提供这个序列化版本号。
    //建议将序列化版本号手动的写出来，不建议自动生成。
    //private static final long serialVersionUID = 1L;//java虚拟机识别一个类的时候先通过类名，类名相同再通过序列化版本号。
    private int no;
    // transient关键字表示游离的，不参与序列化
    private transient String name;

    public Student(){

    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }
}
