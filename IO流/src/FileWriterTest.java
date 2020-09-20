import java.io.FileWriter;
import java.io.IOException;

/*
    FileWriter:
        文件字符输出流。写
        只能输出普通文本。
 */
public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter fw = null;


        try {
            fw = new FileWriter("filewriter.txt",true);
            String s = "你好我的朋友\n";
            char[] chars = s.toCharArray();

            fw.write(chars);

            fw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
