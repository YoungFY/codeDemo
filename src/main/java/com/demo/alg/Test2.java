package com.demo.alg;

/***
 * @Author wenLong
 * @Description 快速排序
 * @Date 2022-11-09 23:21
 **/
public class Test2 {
    public static void main(String[] args) {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (arr == null) {
            return;
        }
        int first = arr[0];
        while (left < right) {

            while (left < right && arr[right] >= first) {
                right--;
            }
            while (left < right && arr[left] <= first) {
                left++;
            }
            arr[right]=arr[left];
        }
    }
}
