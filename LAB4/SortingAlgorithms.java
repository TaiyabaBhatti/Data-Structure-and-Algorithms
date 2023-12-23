package com.LAB4;

import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {

        // sort in ascending order

        //bubble sort
        int[] arrayOriginal={180,165,150,170,145};
        int[] arrayBubble = Arrays.copyOf(arrayOriginal, arrayOriginal.length);
        int[] arraySelection = Arrays.copyOf(arrayOriginal, arrayOriginal.length);
        int[] arrayInsertion = Arrays.copyOf(arrayOriginal,arrayOriginal.length);
        int[] arrayQuick=Arrays.copyOf(arrayOriginal,arrayOriginal.length);

        long timebeforeA=System.nanoTime();
        bubbleSort(arrayBubble);
        long timeafterA= System.nanoTime();
        System.out.println("Execution time difference for bubble sort: "+(timeafterA-timebeforeA));


        long timebeforeB=System.nanoTime();
        selectionSort(arraySelection);
        long timeafterB= System.nanoTime();
        System.out.println("Execution time difference for selection sort: "+(timeafterB-timebeforeB));

        long timebeforeC=System.nanoTime();
        insertionSort(arrayInsertion);
        long timeafterC= System.nanoTime();
        System.out.println("Execution time difference for insertion sort: "+(timeafterC-timebeforeC));

        long timebeforeD=System.nanoTime();
        quicksort(arrayQuick);
        long timeafterD= System.nanoTime();
        System.out.println("Execution time difference for insertion sort: "+(timeafterD-timebeforeD));

    }

    private static void quicksort(int[] arrayQuick) {


    }
    public static void bubbleSort(int[] array){
       int temp;
        for (int i = 1; i < array.length ; i++) {
            for (int j = 0; j < array.length-i; j++) {
                if (array[j]>array[j+1]){
                temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int[] array){
        int temp;
        int smallestElementIndex;
        for (int i = 0; i < array.length-1; i++) {
            smallestElementIndex=i;
            for (int j = i+1; j < array.length; j++) {
                if (array[smallestElementIndex] > array[j]){
                    smallestElementIndex=j;
                }
            }
            temp=array[i];
            array[i]=array[smallestElementIndex];
            array[smallestElementIndex]=temp;
        }
    }
    public static void insertionSort(int[] array){
int j,current;
        for (int i = 1; i < array.length ; i++) {
            j=i-1;
            current=array[i];
            while (j>=0 && array[j]>current){

                array[j+1]=array[j];
                j--;
            }
            array[j+1]=current;
        }
    }
}