package abtrasctclass;

public  class SonOfEmployee extends Employee
{

    public SonOfEmployee() {
        System.out.println("子无参数");
    }

    @Override
    public void aaa() {
        System.out.println("aaa");
    }

    @Override
    public void BB() {
        System.out.println("bb");

    }


    public static void main(String[] args) {

        SonOfEmployee sonOfEmployee=new SonOfEmployee();
        sonOfEmployee.aaa();
    }
}