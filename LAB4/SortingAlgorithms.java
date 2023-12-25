package com.LAB4;

import java.util.Arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {

        // sort in ascending order


        int[] arrayOriginal={180,165,150,170,145};
        int[] arrayBubble = Arrays.copyOf(arrayOriginal, arrayOriginal.length);
        int[] arraySelection = Arrays.copyOf(arrayOriginal, arrayOriginal.length);
        int[] arrayInsertion = Arrays.copyOf(arrayOriginal,arrayOriginal.length);
          int[] arrayQuick={8,13,7,2,4,17,12,6};

        //bubble sort
        long timebeforeA=System.nanoTime();
        bubbleSort(arrayBubble);
        long timeafterA= System.nanoTime();
        System.out.println("Execution time difference for bubble sort: "+(timeafterA-timebeforeA));

        //selection sort
        long timebeforeB=System.nanoTime();
        selectionSort(arraySelection);
        long timeafterB= System.nanoTime();
        System.out.println("Execution time difference for selection sort: "+(timeafterB-timebeforeB));

        //insertion sort
        long timebeforeC=System.nanoTime();
        insertionSort(arrayInsertion);
        long timeafterC= System.nanoTime();
        System.out.println("Execution time difference for insertion sort: "+(timeafterC-timebeforeC));

        //quick sort
        long timebeforeD=System.nanoTime();
        quicksort(arrayQuick,0,arrayQuick.length-1);
        long timeafterD= System.nanoTime();
        System.out.println("Execution time difference for quick sort: "+(timeafterD-timebeforeD));

    }
public static int partition(int[] array,int low, int high){
        int i=low-1;     //to make places for smallest elements
        int temp;
        int pivotEle=array[high];
    for (int j = low; j <high ; j++) {
        if (array[j]<pivotEle){
            i++;
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
    }
        i++;
    temp=array[i];
    array[i]=pivotEle;
    array[high]=temp;
    return i;
}
    private static void quicksort(int[] arrayQuick,int low,int high) {
        if(low<high) {
            int pivIndex = partition(arrayQuick, low, high);
            quicksort(arrayQuick,low,pivIndex-1);
            quicksort(arrayQuick,pivIndex+1,high);
        }
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