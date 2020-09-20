import java.io.*;

public class BufferedWriterTest01 {
    public static void main(String[] args) throws Exception {

        //带有缓冲区的字符输出流
        BufferedWriter out = new BufferedWriter(new FileWriter("3.txt"));

//        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("2.txt")));

        //开始写
        out.write("年后我要去看年会");
        //刷新
        out.flush();
        //关闭最外层
        out.close();
    }
}
