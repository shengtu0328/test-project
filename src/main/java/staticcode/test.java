package staticcode;

public class test extends test1{


    static
    {
        System.out.println("子-static");
    }


    {
        System.out.println("子-非static");
    }



    public test()
    {
        System.out.println("子-构造");
    }

    public static void main(String[] args) {
        test t1= new test();

        System.out.println(t1.hashCode());
        System.out.println(t1.hashCode());
        System.out.println(t1.hashCode());
        System.out.println(t1.hashCode());
        System.out.println(t1.hashCode());




    }
}




