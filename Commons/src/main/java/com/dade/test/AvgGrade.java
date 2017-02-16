package com.dade.test;

import java.util.*;

/**
 * Created by Dade on 2017/2/16.
 */
public class  AvgGrade
{
    public static void main(String[] args)
    {

        int[] gra = new int[100];
        int index = 0;
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            gra[index++] = sc.nextInt();
//        }


        int sum = 0;
        if(index<4){
            sum = gra[0] + gra[1] + gra[2] + gra[3];
        }
        else{
            sum = gra[0] + gra[1] + gra[2] + gra[3] + gra[4];
        }

        double avg = (sum*1.0)/5;

        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);

    }
}


