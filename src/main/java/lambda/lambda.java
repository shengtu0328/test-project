package lambda;

public class lambda {

    public static void main(String[] args) {
        new

                Thread
                (() ->
                        System
                                .out.print(
                                "hello world"
                        )).start();
    }
}
