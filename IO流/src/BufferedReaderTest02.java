import java.io.*;

public class BufferedReaderTest02 {
    public static void main(String[] args) throws Exception {
        //字节流
//        FileInputStream fis = new FileInputStream("1.txt");
//        //通过转换流转换(InputStreamReader将字节流转换为字符流)
//        //fis是节点流，reader是包装流
//        InputStreamReader reader = new InputStreamReader(fis);
//        //
//        //这个构造方法只能传一个字符流，不能传字节流。
//        //reader是节点流，br是包装流
//        BufferedReader br = null;
//
//        br = new BufferedReader(reader);
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("1.txt")));
        String s = null;
        while((s = br.readLine()) != null){
            System.out.println(s);
        }

        br.close();

    }
}
