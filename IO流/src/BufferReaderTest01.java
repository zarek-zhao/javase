import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
BufferedReader:
    带有缓冲区的字符输入流，
    使用这个流的时候不需要自定义char[]数组，或者说不需要自定义byte数组，自带缓冲
 */

public class BufferReaderTest01 {
    public static void main(String[] args) throws IOException {
        //当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流
        //外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流。
        //FileReader 是一个节点流，BufferedReader是一个处理流/包装流
        FileReader fr = new FileReader("1.txt");

        BufferedReader br = null;
        br = new BufferedReader(fr);
        //br.readLine()方法读取一个文本行，但是不带换行符
        String s = br.readLine();
        while((s = br.readLine()) != null){
            System.out.println(s);
        }
//        关闭流
        //对于包装流来说，只需要关闭最外层流就行，里面的节点会自动关闭。(可以看源代码，read在bufferedreader中是一个实例变量，在bufferedreader调用close方法的时候，也将read对象关闭)
        br.close();
    }
}
