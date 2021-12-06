package regux;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-01-08 14:49
 **/
public class appendReplacement {

    private static final String TITLE_REGEX = "[\n`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥……&*（）——+|{}【】‘；：\"”“’。， 、？]";

    public static void main(String[] args) {

        String title = "关于转发《卫生部关于印发<处方常用药品通用名目录>的通知》的通知";
        String titleReplace = title.replace(TITLE_REGEX, title);


        System.out.println(titleReplace);

    }
}
