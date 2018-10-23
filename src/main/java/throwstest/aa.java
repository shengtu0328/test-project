package throwstest;

import java.io.*;

public class aa {

    public static void show() throws NullPointerException, FileNotFoundException {

        InputStream is = new FileInputStream("E:/iodemo/ch01.txt");

    }


    public static void aa()  {

        try {
            show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args)  {

        aa();
        System.out.println(2213123);
    }
}
