package string;

public class substringtest {

    public static void main(String args[]) {
        String Str = new String("2018-01");

        System.out.print("返回值 :" );
        System.out.println(Str.substring(0,4) );

        System.out.print("返回值 :" );
        System.out.println(Str.substring(5) );


        int i = Integer.parseInt("02");
        System.out.println(i);
    }
}
