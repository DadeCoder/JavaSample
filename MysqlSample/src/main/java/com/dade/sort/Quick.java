package com.dade.sort;

import java.util.Arrays;

/**
 * Created by Dade on 2016/12/12.
 */
public class Quick {

    void getIndex(int h,int t,int[] arr){

        if (h<t){

            int i=h,j=t,x = arr[h];

            while(i<j){

                while(i<j && arr[j]>=x)
                    j--;
                if (i<j)
                    arr[i++] = arr[j];


                while (i<j && arr[i]< x)
                    i++;
                if (i<j)
                    arr[j--] = arr[i];

            }

            arr[i] = x;

            getIndex(h,i-1,arr);
            getIndex(i+1,t,arr);


        }


    }

    public static void main(String[] args) {

        int arr[] = {2,4,6,1,3};
        new Quick().getIndex(0,arr.length-1,arr);
        Arrays.stream(arr).forEach(v -> System.out.println(v));

    }

}
