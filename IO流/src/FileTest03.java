import java.io.File;

/*
File中的listFiles方法
 */
public class FileTest03 {
    public static void main(String[] args) {
        //File[] listFiles()
        //获取当前目录下的所有的子文件
        File f1 = new File("IO流/src");
        File[] files = f1.listFiles();
        for(File f : files){
            System.out.print(f.getAbsolutePath() + "\t\t");
            System.out.println(f.getName());
        }
    }
}
