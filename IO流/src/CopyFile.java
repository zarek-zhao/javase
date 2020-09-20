import java.io.*;
import java.util.Scanner;

public class CopyFile {

    private FileInputStream fis = null;
    private FileOutputStream fos = null;

    public static void main(String[] args) {
        CopyFile cf = new CopyFile();
        Scanner sc= new Scanner(System.in);
        System.out.println("请输入你要复制的目录(绝对路径或相对路径)");
        String sourcePath = sc.nextLine();
        System.out.println("请输入你要拷贝到的目录(绝对路径或相对路径)");
        String aimPath = sc.nextLine();
        long time1= System.currentTimeMillis();
        cf.copy(sourcePath,aimPath);;
        long time2 = System.currentTimeMillis() - time1;
        System.out.println("拷贝完成。。。。"+"共耗费" + time2 + "毫秒");
    }



    public void copy(){

    }

//
//    String path = "IO流/src/4447.txt";
//    String copyPath = "/1.txt";
    public void copy(String sourcePath,String aimPath){
        //定义要拷贝的文件和拷贝到哪里的位置
        //创建输入输出字节流对象
        File file1 = new File(sourcePath);
        File file2 = new File(aimPath);
//        System.out.println(file2.getAbsolutePath());


        try {
            this.fis = new FileInputStream(file1);
            this.fos = new FileOutputStream(file2);


            //创建字节数组，接收输入字节流
            byte[] bytes = new byte[10];
            int readCout = 0;
            while((readCout = fis.read(bytes)) != -1){
                //将字节数组输出到文件中
                fos.write(bytes,0,readCout);
            }

            //刷新输出流通道
            fos.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭输入输出流通道
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

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
