package com.dade;

import java.util.Arrays;

/**
 * Created by Dade on 2016/12/27.
 */
public class TestArrays {

    public static void main(String[] args) {
        int[] arr = new int[5];

        Arrays.fill(arr, 5);
        Arrays.stream(arr).forEach(v-> System.out.println(v));


    }

}
