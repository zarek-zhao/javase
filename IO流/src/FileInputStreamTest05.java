import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream类的其他常用方法：
    int available():返回流当中剩余的没有读到的字节数量
    long skip(long n) :跳过几个字节不读
 */
public class FileInputStreamTest05 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("IO流/src/4447.txt");

//            byte[] bytes = new byte[fis.available()];//这种方式不太适合大文件，因为byte[]数组不能太大
//            int readCount = fis.read(bytes);
//            System.out.println(new String(bytes,"GBK"));
            byte[] bytes = new byte[4];
            int readCount = 0;
            while((readCount = fis.read()) != -1){
                System.out.println(new String(bytes,0,readCount));
            }

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
