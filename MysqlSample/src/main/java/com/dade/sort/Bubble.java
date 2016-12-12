package com.dade.sort;

import java.util.Arrays;

/**
 * Created by Dade on 2016/12/8.
 */
public class Bubble {

    public int[] getIndex(int[] array){
        for (int i=0;i<array.length-1;i++){
           for (int j=0;j<array.length-i-1;j++){
               if (array[j]>array[j+1]){
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
               }
           }
        }
        return array;
    }

    public static void main(String[] args) {

        int unIndex[] = {5,2,4,3,55};
        int[] res = new Bubble().getIndex(unIndex);
        Arrays.stream(res).forEach(r -> System.out.println(r));



    }

}
