package exception;

public class test {

    public static void main(String[] args) {
        System.out.println("a");


        try
        {
            int i=1/0;
            System.out.println("b");


        }
        catch (Exception e)
        {
            System.out.println(e);
        }


        System.out.println("c");

    }
}
