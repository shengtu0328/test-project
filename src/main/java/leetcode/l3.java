package leetcode;

import java.util.HashMap;

public class l3 {


    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int n = 0;
        int start = 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {

                int index=map.get(s.charAt(i));

                for (int j = start; j <= index; j++){
                    map.remove(s.charAt(j));
                }
                map.put(s.charAt(i), i);
                start=index+1;
                n = i-index;


            }
            else {
                    map.put(s.charAt(i), i);
                    n++;
                    if(n>max)
                        max=n;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        l3 l3=new l3();
        System.out.println(l3.lengthOfLongestSubstring("abcdefghijkcxlopl"));
    }
}