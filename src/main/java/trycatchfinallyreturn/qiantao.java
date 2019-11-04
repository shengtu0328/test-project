package trycatchfinallyreturn;

/**
 * @Author: rqxiao
 * @Date: 2019-10-22 10:42
 * @Description:
 */
public class qiantao {



    public void a(){

    int i=1/0;

    }
    public void b(){
        System.out.println("进入了b");
        a();

    }

    public static void main(String[] args) {
        qiantao qiantao=new qiantao();

        try {
            qiantao.b();

        }catch (Exception e){
            System.out.println(e.getMessage()+"11111");
        }



    }
}
