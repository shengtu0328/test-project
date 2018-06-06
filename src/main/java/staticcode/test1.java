package staticcode;

public class test1 {

    static
    {
        System.out.println("父-static");
    }


    {
        System.out.println("父-非static");
    }

    public test1() {
        System.out.println("父-构造");
    }
}
