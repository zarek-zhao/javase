

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest06 {
    public static void main(String[] args) {
        //创建FileInputStream输入字节流对象
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("IO流/src/4447.txt");
            byte[] bytes = new byte[fis.available()];

            int readCount = fis.read(bytes);
            System.out.println(new String(bytes,0,readCount,"gbk"));




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
