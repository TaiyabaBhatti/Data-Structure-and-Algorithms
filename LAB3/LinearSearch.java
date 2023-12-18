package com.LAB3;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size= input.nextInt();
        int[] array=new int[size];

        System.out.println("Enter elements to the array:");
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
        }
        System.out.println("Display Elements");
        System.out.println(Arrays.toString(array));

        System.out.println("Enter Element to find:");
        int element=input.nextInt();
        long before = System.nanoTime();
        int foundIndex=linearSearch(array,element);
        long after = System.nanoTime();
        System.out.println("Before: "+before);
        System.out.println("After: "+after);
        System.out.println("Element index: "+foundIndex);


    }

    public static int linearSearch(int[] array,int element){
        if (array.length==0){
            System.out.println("Array is empty");
            return -1;
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i]==element){
                return i;
            }
        }
        // element not found
        return -1;

    }

}
