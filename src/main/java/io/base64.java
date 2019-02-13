package io;

import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-01-31 15:08
 **/
public class base64 {


    /**
     * @Description: 根据图片地址转换为base64编码字符串
     * @Author:
     * @CreateTime:
     * @return
     */
    public static String getImageStr(String imgFile) {
        InputStream inputStream = null;
        byte[] data = null;
        try {
            inputStream = new FileInputStream(imgFile);
            data = new byte[inputStream.available()];
            inputStream.read(data);
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 加密
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data);
    }


    public static void main(String[] args) {
        String strImg = getImageStr("d:/扣划款授权书.JPG");
        String s = strImg.replaceAll("\r|\n", "");
        System.out.println(s);

        System.out.println("________________");



    }
}
