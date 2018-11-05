package leetcode;

public class 反转字符串344 {

    public String reverseString(String s) {

        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {


            sb = sb.append(s.charAt(i));

        }

        return sb.toString();

    }

}
