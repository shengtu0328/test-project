package lambda;

interface Message2{

    default int print(int x,int y){
        System.out.println("--------------");
        return x + y;
    }

    int print(int x);


}


public class Test2 {

    public static void main(String[] args) {

        Message2 mmmmm=(x) -> x;
        System.out.println(mmmmm.print(9));

    }
}


