package leetcode;

public class 只出现一次的数字136 {

    public int singleNumber(int[] nums) {

        int result=0;


        for (int i = 0; i <nums.length ; i++) {


            result=result^nums[i];

        }

      return result;
    }


    public static void main(String[] args) {
        只出现一次的数字136 t=new 只出现一次的数字136();

      int[] arrray={2,2, 3,3, 5, 6, 6};
        System.out.println(t.singleNumber(arrray));
    }
}
