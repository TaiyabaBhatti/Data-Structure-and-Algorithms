package com.LAB4;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {

        int[][] arrayOriginal={{10,11,45,6},{34,5,1,3},{6,9,99,4}};
        int[][] arrayBubble = new int[arrayOriginal.length][];
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayBubble[i] = Arrays.copyOf(arrayOriginal[i], arrayOriginal[i].length);
        }
        int[][] arraySelection = new int[arrayOriginal.length][];
        for (int i = 0; i < arrayOriginal.length; i++) {
            arraySelection[i] = Arrays.copyOf(arrayOriginal[i], arrayOriginal[i].length);
        }
        int[][] arrayInsertion = new int[arrayOriginal.length][];
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInsertion[i] = Arrays.copyOf(arrayOriginal[i], arrayOriginal[i].length);
        }
        int[][] arrayquick = new int[arrayOriginal.length][];
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayquick[i] = Arrays.copyOf(arrayOriginal[i], arrayOriginal[i].length);
        }

        //bubble sort
        System.out.println("Before bubble sort...");
        for (int[] array:arrayBubble) {
            System.out.println(Arrays.toString(array));
        }
        bubbleSort(arrayBubble);
        System.out.println("After bubble sort...");
        for (int[] array:arrayBubble) {
            System.out.println(Arrays.toString(array));
        }


        //selection sort
        System.out.println("\n\nBefore selection sort...");
        for (int[] array:arraySelection) {
            System.out.println(Arrays.toString(array));
        }
        selectionSort(arraySelection);
        System.out.println("After selection sort...");
        for (int[] array:arraySelection) {
            System.out.println(Arrays.toString(array));
        }

       // insertion sort
        System.out.println("\n\nBefore insertion sort...");
        for (int[] array:arrayInsertion) {
            System.out.println(Arrays.toString(array));
        }
        insertionSort(arrayInsertion);
        System.out.println("\n\nafter insertion sort...");
        for (int[] array:arrayInsertion) {
            System.out.println(Arrays.toString(array));
        }

        //quickSort
        System.out.println("\n\nBefore quick sort...");
        for (int[] array:arrayquick) {
            System.out.println(Arrays.toString(array));
        }
        for (int[] array:arrayquick) {
            quickSort(array,0,array.length-1);
        }
        System.out.println("\n\nAfter quick sort...");
        for (int[] array:arrayquick) {
            System.out.println(Arrays.toString(array));
        }
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
    private static void quickSort(int[] array, int low, int high) {
        if(low<high) {
            int pivIndex = partition(array, low, high);
            quickSort(array,low,pivIndex-1);
            quickSort(array,pivIndex+1,high);
        }







    }
    public static void insertionSort(int[][] array){
int rows= array.length;
int column=array[0].length;
int k, current;
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < column; j++) {
              k=j-1;                        //back indices tracer
              current=array[i][j];              //compairer
              while (k>=0 && array[i][k]>current){
                  array[i][k+1]=array[i][k];
                  k--;
              }
                array[i][k+1]=current;

            }
        }
    }
    public static void bubbleSort(int[][] array){
        int temp;
        int rows= array.length;
        int columns= array[0].length;
        for (int i = 0; i < rows; i++) {          //go to the last row
            for (int j = 1; j < columns; j++) {
                for (int k = 0; k < columns-j; k++) {
                    if (array[i][k]>array[i][k+1]){
                        temp=array[i][k];
                        array[i][k]=array[i][k+1];
                        array[i][k+1]=temp;
                    }
                }
            }
        }
        }
    public static void selectionSort(int[][] array){
        int temp;
        int smallestElementIndex;
        int rows=array.length;
        int column=array[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column-1; j++) {
                smallestElementIndex = j;
                for (int k = j + 1; k < column; k++) {
                    if (array[i][smallestElementIndex] > array[i][k]) {
                        smallestElementIndex = k;
                    }
                }
                temp = array[i][j];
                array[i][j] = array[i][smallestElementIndex];
                array[i][smallestElementIndex] = temp;
            }
        }  //row loop
    }

    }


