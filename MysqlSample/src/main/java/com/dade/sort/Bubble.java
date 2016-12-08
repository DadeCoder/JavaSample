package com.dade.sort;

import java.util.Arrays;

/**
 * Created by Dade on 2016/12/8.
 */
public class Bubble {

    public int[] getIndex(int[] array){

        for (int i=0;i<array.length-1;i++){
            for (int j = i;j<array.length;j++){

                if (array[i]>array[j]){

                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;

                }

            }

        }

        return array;

    }

    public static void main(String[] args) {

        int unIndex[] = {5,2,4,3,55};
        int[] res = new Bubble().getIndex(unIndex);

        for (int i=0;i<res.length;i++){
            //System.out.println(res[i]);
        }

        //Arrays.stream(res).forEach( v -> System.out.println(v));

        int[] arr = {2,1,5,4,3};
        //Arrays.sort(arr,0,5);
        Arrays.parallelSort(arr);
        Arrays.stream(arr).forEach(v-> System.out.println(v));


    }

}
