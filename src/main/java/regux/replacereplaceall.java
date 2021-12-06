package regux;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class replacereplaceall {
    public static void main(String[] args) throws ParseException {
        String code = "" +
                "double uv=doc['uniqueVisitor'].value;" +
                "double pv=doc['pageView'].value;" +
                "double downloadTimes=doc['downloadTimes'].value;" +
                "double downloadRate=0;" +
                "if(uv != 0){" +
                "downloadRate=downloadTimes/uv;" +
                " }" +
                "return downloadTimes*15+pv*25+downloadRate*2.5;" +
                "";
        System.out.println(code);
//        Date parse1 = new SimpleDateFormat("yyyy-MM-dd").parse("2019-01-06");

//        LocalDateTime parse = LocalDateTime.parse("2019-01-06 23:59:59", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
////        System.out.println(src.replace("3", "f"));
////        System.out.println(src.replace('3', 'f'));
////        System.out.println(src.replaceAll("\\d", "f"));
////        System.out.println(src.replaceAll("a", "f"));
////        System.out.println(src.replaceFirst("4", "h"));
//
//
//
//
//        String str = "Hello Java. Java is a language.";
//        System.out.println(str.replace("Java.", "c++"));//打印 Hello c++ Java is a language.
//        System.out.println(str.replaceAll("Java.", "c++"));//打印 Hello c++ c++is a language.

    }
}
