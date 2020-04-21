package exception;

public class test {

    public static void main(String[] args) throws Exception {
        System.out.println("a");


        try
        {
            int i=1/0;
            System.out.println("b");


        }
        catch (Exception e)
        {

            System.out.println("bbbbbb");

            System.out.println(e);


            throw new Exception();

        }
        finally {
            System.out.println("finallyfinallyfinallyfinally");

        }


        System.out.println("c");

    }
}
