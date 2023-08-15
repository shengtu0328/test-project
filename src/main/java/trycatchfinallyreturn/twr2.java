package trycatchfinallyreturn;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public class twr2 {

    public static void printFile() throws IOException {
        InputStream input = null;
        try {
            input = new FileInputStream("data.txt");
            int data = input.read();
            while(data != -1){
                System.out.print((char) data);
                data = input.read();
            }
        } finally {
            if(input != null){
//                input.close();
            }
        }
    }

    @SneakyThrows
    public static int aa() {


        try(FileInputStream input = new FileInputStream("data.txt")) {
            int data = input.read();
            while(data != -1){
                System.out.print((char) data);
                data = input.read();
            }

        }
//
//        System.out.println("\n");
//        System.out.printf("aa");

        return 3;
    }


    public static void main(String[] args) throws IOException {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("bvbyyyy-MM-dd HH:mm:ss");
//        System.out.println(simpleDateFormat.format(new Date()));
        aa();

       printFile();
    }


}
