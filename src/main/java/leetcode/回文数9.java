package leetcode;

public class 回文数9 {


    public boolean isPalindrome(int x) {

        int y=x;

        int sum=0;

        while(y>0){
            sum=sum*10 + y % 10;
            y=y /10;
        }

        if(x==sum)
            return true;
        else
            return false;

    }


    public static void main(String[] args) {
        回文数9 t= new 回文数9();
        System.out.println(t.isPalindrome(356653));
        System.out.println(3/10);


    }
}
