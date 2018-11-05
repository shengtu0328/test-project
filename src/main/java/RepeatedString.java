import java.util.Random;

public class RepeatedString {

    public String getRepeatedString() {
    /*    String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";//英文字母有26个 大小写一共有52个
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 500; i++) {
            sb.append(str.charAt(random.nextInt(52)));         //用 Random生成随机字符串  random.nextInt获取的是【0，52）中间任意一个随机数  str.charAt正好从0到51这些下标中选取获得随机数
        }*/

        StringBuffer sb = new StringBuffer();
        sb.append("ardxxddxx");

        String string03 = sb.substring(0, 3);                 //从此字符串最左截取3位作为初始目标字符串
        for (int k = 3; k <=sb.length() - 3; k++) {
            for (int i = k; i <= sb.length() - 3; i++) {           // 每次从目标字符串结束的后面一位下标开始一直到整个的字符串结束比较指定的连续3位字符串与目标字符串是否相等
                if (string03.equals(sb.substring(i, i + 3)))
                    return sb + "=>" + sb.substring(i, i + 3);
            }
            string03 = sb.substring(k-3+1, k +1);//如果没有找到与目标字符串相同的字符串，目标字符串整体往后移一位作为新的目标字符串
        }
        return "无";

    }


    public static void main(String[] args) {
        RepeatedString repeatedString = new RepeatedString();
        System.out.println(repeatedString.getRepeatedString());
    }
}
