package interfacetest;

public class classss implements inteface1,interface2{
    @Override
    public void a() {
        System.out.println("aaa");
    }


    public void bb() {
        System.out.println("dsadsada");
    }

    @Override
    public void c() {
        System.out.println("c子");
    }


    public static void main(String[] args) {
        classss c=new classss();
        c.a();
        c.bb();

        c.c();
    }
}
