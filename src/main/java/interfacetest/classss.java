package interfacetest;

public class classss implements inteface1,interface2{
    @Override
    public void a() {
        System.out.println("aaa");
    }


    public void bb() {
        System.out.println("dsadsada");
    }

    public static void main(String[] args) {
        classss c=new classss();
        c.a();
        c.bb();


    }
}
