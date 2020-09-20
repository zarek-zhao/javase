import java.io.File;
import java.io.IOException;

/*
File:
    1.  File类和四大家族灭有关系，所以File类不能完成文件的读和写
    2. File对象代表什么？
        文件和目录路径名的抽象表示形式
    3. File类中的常用方法


 */
public class FileTest01 {
    public static void main(String[] args) throws Exception {
//        File file1 = new File("IO流/src/444.txt");
//        //判断是否存在
//        System.out.println(file1.exists());
//        //如果不存在以目录的形式创建出来
//        if(!file1.exists()){
//            file1.mkdir();
//        }
//        //如果不存在，则以文件的形式创建出来
//        if(!file1.exists()){
//            file1.createNewFile();
//        }
//        File f2 = new File("d:/a/b/c/d/e/f");
//        if(!f2.exists()){
//            //以多重目录的形式新建。
//            f2.mkdirs();
//        }

        File f3 = new File("IO流/src/4447.txt");
        //获取文件的父路径
        String parentPath = f3.getParent();
        System.out.println(parentPath);
        File parentFile = f3.getParentFile();
        System.out.println(parentFile.getAbsolutePath());
        File f4 = new File("集合");
        System.out.println(f4.getAbsolutePath());
        System.out.println();
    }
}
