package exception;

/**
 * @Author: rqxiao
 * @Date: 2019-12-24 15:37
 * @Description:
 */
public class trycatchcontinue {

    public static void main(String[] args) {


        for (int i = 0; i <5 ; i++) {


             try {
                 if(i==2){
                     int i1 = i / 0;

                 }

                 System.out.println("我是" + i);


             }catch (Exception e){

                continue;
             }




            System.out.println(i);
        }


    }

}
