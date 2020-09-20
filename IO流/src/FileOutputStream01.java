
/*
文件字节输出流，负责写
从内存到硬盘
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {
    public static void main(String[] args) {
        FileOutputStream fos = null;

        try {
            //以追加的方式在文件末尾写入，不会清空原文件内容
            fos = new FileOutputStream("myfile.txt",true);
            //开始写
            byte[] bytes = {97,98,99,100,127};
            //将byte数组的全部写出！
            String s = "我是一个中国人，我骄傲！";

            byte[] bytes1 = s.getBytes();
            fos.write(bytes1);

            //将byte数组的一部分写出
//            fos.write(bytes,0,2);
            //写完之后一定要刷新
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
