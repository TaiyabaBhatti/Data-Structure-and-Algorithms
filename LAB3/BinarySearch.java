package com.LAB3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

//        *** for binary search element should be sorted


        Scanner input =new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size= input.nextInt();
        int[] array=new int[size];

        System.out.println("Enter elements to the array:");
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
        }

        System.out.println("Display Elements before sorting:");
        System.out.println(Arrays.toString(array));

        array=bubbleSort(array);
        System.out.println("Display Elements After Sorting:");
        System.out.println(Arrays.toString(array));

        System.out.println("Enter Element to find:");
        int element=input.nextInt();

        long before = System.nanoTime();
        int foundIndex=binarySearch(array,element);
        long after = System.nanoTime();
        System.out.println("Element index: "+foundIndex);
        System.out.println("Before: "+before);
        System.out.println("After: "+after);

    }
    public static int[] bubbleSort(int[] array){

       int temp;
        for (int i = 0; i < array.length-1 ; i++) {      //check till second last
            for (int j = 0; j <(array.length-1)-i ; j++) {

                //condition because at each interation right to left element will be arranged

                if (array[j]>array[j+1]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }


    public static int binarySearch(int[] array,int element){

        int leftIndex=0;
        int rightIndex=array.length-1;
        int mid=(leftIndex+rightIndex)/2;
        int index=0;

       while(!(leftIndex>rightIndex)){

          if (array[mid]>element){
              rightIndex=mid-1;
              mid=(leftIndex+rightIndex)/2;
          }
           if (array[mid]<element){
               leftIndex=mid+1;
               mid=(leftIndex+rightIndex)/2;
           }

           if (array[mid]==element){
               return mid;
           }

       }
        System.out.println("index out of bound");
       return -1;
    }





}
