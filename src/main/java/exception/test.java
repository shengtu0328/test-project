package exception;

public class test {

    public static void main(String[] args) {
        System.out.println("aaa");


        try
        {
            int i=1/0;

        }
        catch (Exception e)
        {
            System.out.println(e);
        }


        System.out.println("bbb");

    }
}
