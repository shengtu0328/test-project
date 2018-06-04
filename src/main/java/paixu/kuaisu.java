package paixu;

public class kuaisu {


    public int getMiddle(Integer[] list, int low, int high) {
        int tmp = list[low];    //数组的第一个作为中轴
        while (low < high) {
            while (list[high] > tmp && low < high  ) {
                high--;
            }
            list[low] = list[high];   //比中轴小的记录移到低端

            list[high]=tmp;
            while (list[low] < tmp && low < high) {
                low++;
            }
            list[high] = list[low];

            list[low]=tmp;
            //比中轴大的记录移到高端
        }
                   //中轴记录到尾
        return low;                   //返回中轴的位置
    }


    public  void sort(Integer[] list, int low, int high)
    {

        if (low < high) {
            int middle = getMiddle(list, low, high );  //将list数组进行一分为二
            sort(list, low, middle - 1);        //对低字表进行递归排序
            sort(list, middle + 1, high);
        }

    }


    public static void main(String[] args) {


        Integer[] list={34,3,53,2,23,7,14,10};
        kuaisu kuaisu=new kuaisu();
        kuaisu.sort(list,0, list.length - 1);

        for (int i = 0; i <list.length ; i++) {
            System.out.println(list[i]);
        }

    }
}
