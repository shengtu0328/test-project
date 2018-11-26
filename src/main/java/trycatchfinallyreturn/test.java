package trycatchfinallyreturn;

public class test {

    public static   int aa (String s){


        try{
          int b=1/0;
        }
        catch (Exception e){

            return  1;

        }
        finally {
            System.out.println(2);

        }

        return  3;
    }


    public static void main(String[] args) {
        char  a= 'c';

        System.out.println(test.aa(String.valueOf(a)));
    }


}
