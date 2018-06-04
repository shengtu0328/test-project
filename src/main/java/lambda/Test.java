package lambda;

interface Message{

    public void print();




}


public class Test {

    public static void main(String[] args) {

        Message msg=new Message() {
            public void print() {
                System.out.println("SSS");
            }

           /* public void print2() {

            }*/
        };

      msg.print();

        Message msg323=new Message() {
            @Override
            public void print() {

            }
        };




        Message msg2= () -> System.out.println("31231");
        msg2.print();
    }
}


