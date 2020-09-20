/*
 File类的常用方法：

 */

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        File f1 = new File("IO流/src/4447.txt");
        //获取文件名
        System.out.println(f1.getName());
        //判断是否是一个目录

        System.out.println(f1.isDirectory());
        //判断是否是一个文件
        System.out.println(f1.isFile());
        //获取文件的最后一个修改时间
        long haomiao = f1.lastModified();//这个毫秒是从1970年到现在的总毫秒数
        Date time = new Date(haomiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年-MM月-dd号 HH:mm:ss SSS");
        String strTime = sdf.format(time);
        System.out.println(strTime);

        //获取文件大小
        System.out.println(f1.length());//字节


    }
}
