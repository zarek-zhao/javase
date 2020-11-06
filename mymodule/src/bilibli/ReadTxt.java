package bilibli;

import java.io.*;

public class ReadTxt {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("mymodule/34道作业题.txt")));
        String s ="";
        while((s = bufferedReader.readLine()) != null ){
            if(s.length() == 0){
            }else{
                if(s.charAt(0) > 48 && s.charAt(0) <57){
                    System.out.println(s);
                }
            }

        }
        bufferedReader.close();
    }
}
