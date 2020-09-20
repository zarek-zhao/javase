/*
java.io.FileInputStream:
    1. 文件字节输入流，万能的，任何类型的文件都可以采用这个流来读
    2. 字节的方式，完成输入的操作，完成读的操作，(硬盘--->内存)
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        //创建字节输入流对象
        try {
            fis = new FileInputStream("E:\\work_place\\test.txt");

//            int readData = fis.read(); //这个方法的返回值是：读取到"字节"本身
//            System.out.println(readData);//97

            while(fis.read() != -1){
                System.out.println(fis.read());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {//在finally语句块中确保流一定关闭
            if(fis != null){//避免空指针异常
                // 关闭流的前提是：流不是空，流是null的时候没必要关闭，
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
