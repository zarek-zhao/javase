import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
java.io.PrintStream：标准的字节输出流，默认输出到控制台。
 */
public class PrintStreamTest01 {
    public static void main(String[] args) throws Exception {
        System.out.println("hello world");

        PrintStream ps = new PrintStream("2.txt");
        ps.println("你好");

        //标准输出流不需要手动close()关闭
        //改变标准输出流的输出方向
        System.setOut(new PrintStream("1.txt"));
    }
}
