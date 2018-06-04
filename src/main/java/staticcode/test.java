package staticcode;

public class test {


    static
    {
        System.out.println("static");
    }


    {
        System.out.println("非static");
    }



    public test()
    {
        System.out.println("构造");
    }

    public static void main(String[] args) {
        test t1= new test();
        test t2= new test();


    }
}




