package inner;

public class MainExample {

    private class test1 extends Example1
    {

    }
    private class test2 extends Example2
    {

    }
    public String name()
    {
        return new test1().name();
    }
    public int age()
    {
        return new test2().age();
    }
    public static void main(String args[])
    {
        MainExample mi=new MainExample();
        System.out.println("姓名:"+mi.name());
        System.out.println("年龄:"+mi.age());
    }
}
