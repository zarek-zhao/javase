import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
int read(byte[] b)
一次最多读取b.length个字节
减少硬盘和内存的交互，提高程序的执行效率。
往byte[]数组当中读。
*/
public class FileInputStreamTest03 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            //相对路径的话，相对路径一定是从当前的位置作为起点开始找
            //IDEA默认的当前路径是哪里？工程project的跟就是IDEA的默认当前路径
            fis = new FileInputStream("IO流/src/1.txt");

            //开始读，采用byte数组，一次读取多个字节，最多读取”数组.length“个字节。
            byte[] bytes = new byte[100];
            //这个方法的返回值是：读取到的字节的数量。(不是字节本身)
            int readCount = fis.read(bytes);
            System.out.println(new String(bytes,0,readCount,"GBK"));


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
