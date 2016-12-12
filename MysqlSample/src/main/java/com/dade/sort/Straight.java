package com.dade.sort;

import java.util.Arrays;

/**
 * Created by Dade on 2016/12/12.
 */
public class Straight {

    /**
     * 基本思想:

     将一个记录插入到已排序好的有序表中，从而得到一个新，记录数增1的有序表。即：
     先将序列的第1个记录看成是一个有序的子序列，
     然后从第2个记录逐个进行插入，
     直至整个序列有序为止。
     * @param arr
     */
    void getIndex(int[] arr){

        for(int i= 1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){               //若第i个元素大于i-1元素，直接插入。小于的话，移动有序表后插入
                int j= i-1;
                int x = arr[i];        //复制为哨兵，即存储待排序元素
                arr[i] = arr[i-1];           //先后移一个元素
                while( j>=0 && x < arr[j]){  //查找在有序表的插入位置
                    arr[j+1] = arr[j];
                    j--;         //元素后移
                }
                arr[j+1] = x;      //插入到正确位置
            }// else do nothing equals straight insert
        }

        }


    public static void main(String[] args) {
        int arr[] = {2,6,1,5};
        new Straight().getIndex(arr);
        Arrays.stream(arr).forEach(value -> System.out.println(value));
    }

}
