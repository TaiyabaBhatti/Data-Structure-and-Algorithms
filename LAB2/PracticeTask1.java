package com.LAB2;

import java.util.Arrays;

public class PracticeTask1{
    public static void main(String[] args) {
       // Write a program to find the sum of all elements of an integer array having 10 elements.


        int[] intArray={3,6,2,89,56,34,78,65,1,7};
        int sumOfElements=0;
        for (int element:intArray) {
            sumOfElements+=element;
        }
        System.out.println("Sum of the elements in an array:\n"+ Arrays.toString(intArray)+"\n Sum: "+sumOfElements);
    }
}
