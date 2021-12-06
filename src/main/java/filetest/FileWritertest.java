package filetest;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritertest {


    public static void main(String[] args) throws IOException {
        String filePath = "/tmp/logs/test2.txt";
        FileWriter fw = new FileWriter(filePath);

        String str="呵呵好久啊  啊撒打算的";
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
