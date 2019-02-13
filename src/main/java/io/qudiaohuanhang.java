package io;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-01-31 16:50
 **/
public class qudiaohuanhang {

    public static void main(String[] args) {

        String s = "'sds gdasda" + "\r\n" + "edaeafd'";
        System.out.println("转换前："+s);


        s = s.replaceAll("\r|\n", "");

        System.out.println("转换后："+s);

    }
}
