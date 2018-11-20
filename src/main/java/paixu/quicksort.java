package paixu;

import java.util.Arrays;
import java.util.List;

public class quicksort {


    public  static void sort(int a[], int low, int high) {
        int l = low;
        int h = high;
        int pivot = a[l];


        while (l < h) {
            while (l < h && a[h] >= pivot) {
                h--;
            }
            if (l < h) {
                int tmp = a[l];
                a[l] = a[h];
                a[h] = tmp;
                l++;
            }

            while (l < h && a[l] <= pivot) {
                l++;
            }
            if (l < h) {
                int tmp = a[l];
                a[l] = a[h];
                a[h] = tmp;
                h--;
            }


        }
    /*    System.out.println(l);
        System.out.println(h);*/
        if (l > low) sort(a, low, l - 1);
        if (h < high) sort(a, l + 1, high);
    }


    public static void main(String[] args) {
        int[] a = {70, 75, 69, 32, 88, 18, 16, 58};
        quicksort.sort(a,0,a.length-1);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
