package filetest;

import java.io.File;

/**
 * @Author: rqxiao
 * @Date: 2019-8-1 13:30
 * @Description:
 */
public class filename {

    public static void main(String[] args) {

        File f = null;
        f = new File("D:\\A.txt");

        String name = f.getName();
        System.out.println(name);

    }
}
