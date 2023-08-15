package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) throws IOException {
        String filePath = "D:\\test2.txt";
        FileWriter fw = new FileWriter(filePath);

        String str="sdndanudn中华人民共和国主席，daduca1266d8523189588";
        int type = 103658;
        char ch = 'A';

        fw.write(str);
        fw.write('\n');
        fw.write(type+"");                     //若直接用type作为参数，写入的是type按ascll码对应的字符
        fw.write('\n');                        //换行符也可以直接写入
        fw.write(ch);                          //字符可以直接写入
        fw.flush();
        fw.close();
    }
}
