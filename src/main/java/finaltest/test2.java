package finaltest;/**  
    * @Description: TODO
    * @Author rqxiao
    * @date 2021/3/26 14:15
    */
public class test2 {





    public static void main(String[] args) {
        String a="abc";

        String b=a;
        System.out.println(a);
        System.out.println(b);
        a="def";
        System.out.println(a);
        System.out.println(b);










        String str="haha";
        new Thread() {
            @Override
            public void run() {
                System.out.println(str);
            }
        }.start();

    }
}
