package regux;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-01-08 14:49
 **/
public class appendReplacement {


    public static void main(String[] args) {
        String hql="aORderborderc";
        Pattern p = Pattern.compile("order", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(hql);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, "");
        }
        m.appendTail(sb);
    }
}
