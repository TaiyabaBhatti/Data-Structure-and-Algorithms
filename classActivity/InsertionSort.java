package com.classActivity;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {



        int[] array={6,3,8,5,1,9};
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length ; i++) {
            int current=array[i];
            int j=i-1;
            while(j>=0 && current <array[j]){
               array[j+1]=array[j];
               j--;
            }
            array[j+1]=current;
        }
        System.out.println(Arrays.toString(array));

    }
}
