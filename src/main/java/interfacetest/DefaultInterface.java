package interfacetest;

public interface DefaultInterface extends inteface1,interface2{
    public   int k=10 ;
    void commonMethod();
    default void defaultMethod(){
        System.out.println("接口的默认方法");
    }
    static void staticMethod(){
        System.out.println("接口的静态方法");
    }


    public static void main(String[] args) {     //匿名实现类
        DefaultInterface defaultInterface = new DefaultInterface() {

            @Override
            public void a() {

            }

            @Override
            public void bb() {
                DefaultInterface.super.bb();
            }

            @Override
            public void c() {
                DefaultInterface.super.c();
            }

            @Override
            public void commonMethod() {

            }
        };

        defaultInterface.commonMethod();
        defaultInterface.defaultMethod();
        DefaultInterface.staticMethod();
        System.out.println(DefaultInterface.k);
    }
}