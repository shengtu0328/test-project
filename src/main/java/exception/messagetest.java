package exception;

/**
 * @Description: TODO
 * @Author rqxiao
 * @date 2020/12/28 14:26
 */
public class messagetest {


    public static void main(String[] args) {


        Integer i=null;

        try {
            System.out.println(i.shortValue());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        try {
                  int k=1/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
