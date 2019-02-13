package leetcode;

/**
 * @program: test-project
 * @author: rqxiao
 * @create: 2019-02-12 13:54
 **/
public class zhongshu {

    public static int majorityElement(int[] nums) {
        int count = 1;
        int maj = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (maj == nums[i])
                count++;
            else {
                count--;
                if (count == 0) {
                    maj = nums[i + 1];
                }
            }
        }
        return maj;
    }

    public static void main(String[] args) {
        System.out.println(zhongshu.majorityElement(new int[]{5, 2,5, 2, 5, 3}));
    }
}
