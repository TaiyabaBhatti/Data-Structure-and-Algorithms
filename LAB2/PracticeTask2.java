package com.LAB2;

public class PracticeTask2 {
    public static void main(String[] args) {


//        Write a program to find the maximum and minimum value of elements of an integer array having 10 elements.

        int[] array={4,78,23,67,45,8,1,90,55,3};

        int maximumValue=Integer.MIN_VALUE;
        int minimumValue=Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {

           if (array[i]>maximumValue){
               maximumValue=array[i];
           }
           if (array[i]<minimumValue){
               minimumValue=array[i];
           }
        }

        System.out.println("Maximum: "+maximumValue);
        System.out.println("Minimum: "+minimumValue);

        }
    }
