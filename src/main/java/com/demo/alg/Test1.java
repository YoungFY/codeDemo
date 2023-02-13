package com.demo.alg;

import java.util.Arrays;

/***
 * @Author wenLong
 * @Description 冒泡排序
 * @Date 2022-11-08 23:05
 **/
public class Test1 {
    public static void main(String[] args) {
        int[] arr={1,3,2,5,6,4,3,7};
        // 3 2
        bubbleSort(arr);
    }


    /**
     * 冒泡排序
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null) {return;}
        int temp = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i; j <= arr.length-1; j++) {
                    if(arr[i]<arr[j]){
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }

            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }


}
