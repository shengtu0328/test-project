package continuetest;

public class test {


    public void aa()
    {
        for (int i = 0; i <10 ; i++) {
            if(i==2)
            {
                System.out.println(5315153);
                continue;
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        test t=new test();
        t.aa();
    }
}
