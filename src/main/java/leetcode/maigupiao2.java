package leetcode;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-01-18 13:39
 **/
public class maigupiao2 {



    public static int mai(int[] a){
        int sum=0;

        int min=a[0];

        int max;

        for (int i =1; i < a.length; i++) {
            if(a[i]>=a[i-1]){
                sum=sum+(a[i]-a[i-1]);
            }

        }



        return sum;


    }

    public static void main(String[] args) {
        int[] a={7,1,5,3,6,4};


        System.out.println(mai(a));

    }
}
