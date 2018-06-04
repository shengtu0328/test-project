package interfacetest;

public interface inteface1 {
    void a();

    default void bb()
    {
        System.out.println("bbb");
    }
}
