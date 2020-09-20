import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader:
    文件字符输入流，只能读取普通文本
    读取文本内容时，比较方便，快捷。
 */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("西游记.txt");
            System.out.println(fr.getEncoding());
            char[] chars = new char[10];
            int readCount = 0;
            while((readCount = fr.read(chars)) != -1){
                System.out.println(new String(chars,0,readCount));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
