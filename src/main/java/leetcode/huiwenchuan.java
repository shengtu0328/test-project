package leetcode;

public class huiwenchuan {

    public static boolean check(String str){
        if(null == str || "".equals(str)){
            return false;
        }
        int i = 0;
        int j = str.length() - 1;
        String[] strings = str.split("");
        boolean flag = false;
        for (; i <= j; i++,j--) {
            if(!strings[i].equals(strings[j])){
                return false;
            }
        }
        return true;
    }

}
