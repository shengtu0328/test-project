package io;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Fileinputstreamtest {
    // 从硬盘存在的一个文件中，读取其内容到程序中。使用FileInputStream
    // 要读取的文件一定要存在。否则抛FileNotFoundException
    @Test
    public void testFileInputStream1() throws Exception {
        // 1.创建一个File类的对象。
        File file = new File("d:\\hello.txt");
        // 2.创建一个FileInputStream类的对象
        FileInputStream fis = new FileInputStream(file);
        // 3.调用FileInputStream的方法，实现file文件的读取。
        /*
         * read():读取文件的一个字节。当执行到文件结尾时，返回-1
         */
        // int b = fis.read();
        // while(b != -1){
        // System.out.print((char)b);
        // b = fis.read();
        // }
        int b;
        while ((b = fis.read()) != -1) {

            if(b==118){
                System.out.print(b+"======");

                System.out.println((char) b);
            }


        }
        // 4.关闭相应的流
        fis.close();
    }

    // 使用try-catch的方式处理如下的异常更合理:保证流的关闭操作一定可以执行
    @Test
    public void testFileInputStream2() {
        // 2.创建一个FileInputStream类的对象
        FileInputStream fis = null;
        try {
            // 1.创建一个File类的对象。
            File file = new File("d:\\hello.txt");
            fis = new FileInputStream(file);
            // 3.调用FileInputStream的方法，实现file文件的读取。
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 4.关闭相应的流
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}
