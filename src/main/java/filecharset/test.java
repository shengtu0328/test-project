package filecharset;

import info.monitorenter.cpdetector.io.*;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class test {

    public static String getFileEncode(String filePath) {
        String charsetName = null;
        try {
            File file = new File(filePath);
            CodepageDetectorProxy detector = CodepageDetectorProxy.getInstance();
            detector.add(new ParsingDetector(false));
            detector.add(JChardetFacade.getInstance());
            detector.add(ASCIIDetector.getInstance());
            detector.add(UnicodeDetector.getInstance());
            java.nio.charset.Charset charset = null;
            charset = detector.detectCodepage(file.toURI().toURL());
            if (charset != null) {
                charsetName = charset.name();
            } else {
                charsetName = "UTF-8";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
        return charsetName;
    }

    public static String codeString(String fileName) throws Exception {
        BufferedInputStream bin = new BufferedInputStream(new FileInputStream(fileName));
        int p = (bin.read() << 8) + bin.read();
        bin.close();
        String code = null;

        switch (p) {
            case 0xefbb:
                code = "UTF-8";
                break;
            case 0xfffe:
                code = "Unicode";
                break;
            case 0xfeff:
                code = "UTF-16BE";
                break;
            default:
                code = "GBK";
        }

        return code;
    }


    public static void main(String[] args) throws Exception {

        String fromPath = "G:\\compressTest\\1.zip";
        String fromPath2 = "G:\\compressTest\\11.txt";


//        System.out.println(codeString(fromPath));
        System.out.println(getFileEncode(fromPath));
        System.out.println(getFileEncode(fromPath2));

    }


}