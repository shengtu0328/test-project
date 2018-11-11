package io;

import java.io.File;

public class 递归输出文件 {


    public static  void getFileList(String strPath) {
        File f = new File(strPath);
        if (f.isDirectory()) {
            File[] fs = f.listFiles();
            for (int i = 0; i < fs.length; i++) {
                String fsPath = fs[i].getAbsolutePath();
                System.out.println(fsPath);
                getFileList(fsPath);
            }
        }
    }

    public static void main(String[] args) {
        递归输出文件.getFileList("d:\\file1");
    }
}


