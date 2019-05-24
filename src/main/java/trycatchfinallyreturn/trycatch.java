package trycatchfinallyreturn;

public class trycatch {


    public static void a() {


        try {
            System.out.println("11");
            int i2 = 3 / 0;
            System.out.println("22");

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("33");


    }


    public static void main(String[] args) {
        a();
    }
}
