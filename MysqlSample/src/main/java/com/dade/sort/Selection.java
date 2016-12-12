package com.dade.sort;

import java.util.Arrays;

/**
 * Created by Dade on 2016/12/12.
 */
public class Selection {

    /**
     * 在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；
     * 然后在剩下的数当中再找最小（或者最大）的与第2个位置的数交换，依次类推，
     * 直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
     * @param arr
     */
    void getIndex(int arr[]){

        for (int i=0;i<arr.length-1;i++){
            int min = arr[i+1];
            int rec  = i+1;
            for (int j = i+1;j<arr.length;j++){    // find out the min num
                if (min>arr[j]){
                    min = arr[j];
                    rec = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[rec];
            arr[rec] = temp;


        }


    }

    public static void main(String[] args) {
        int arr[] = {2,5,6,1};
        new Selection().getIndex(arr);
        Arrays.stream(arr).forEach(value -> System.out.println(value));
    }

}
