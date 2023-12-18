package com.classActivity;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.println("Enter Size of the array:");
        int size=input.nextInt();
        int[] array=new int[size];
        System.out.println("Enter Elements to the array:");
        for (int i = 0; i < size; i++) {
            array[i]=input.nextInt();
        }
        System.out.println("Before Selection Sort:");
        System.out.println(Arrays.toString(array));

        System.out.println("After Selection Sort:");

       int[] array2=selectionSort(array);
        System.out.println(Arrays.toString(array2));

    }


    public static int[] selectionSort(int[] array){

       int smallest;
        for (int i = 0; i < array.length-1; i++) {

            smallest=i;
            for (int j = i+1; j <array.length ; j++) {

                if (array[smallest] > array[j]){
                    smallest=j;
                }
            }
            int temp=array[i];
            array[i]=array[smallest];
            array[smallest]=temp;

        }
        return array;
    }
}
