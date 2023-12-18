package com.LAB3;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {
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

//        linear search

        System.out.println("Enter Element to find (Linear serach):");
        int element1=input.nextInt();
        long lbefore = System.nanoTime();
        int foundIndex_a=linearSearch(array,element1);
        long lafter = System.nanoTime();
        long ldifference=lafter-lbefore;
        System.out.println("before calling linear method: "+lbefore+"\t After calling linear method: "+lafter);
        System.out.println(" Time Difference: "+ldifference);
        System.out.println("Element index: "+foundIndex_a);

        //binary search

        System.out.println("Display Elements before sorting:");
        System.out.println(Arrays.toString(array));
        array=bubbleSort(array);
        System.out.println("Display Elements After Sorting:");
        System.out.println(Arrays.toString(array));

        System.out.println("Enter Element to find (Binary serach):");
        int element2=input.nextInt();

       long bbefore = System.nanoTime();
        int foundIndex_b=binarySearch(array,element2);
       long bafter = System.nanoTime();
       long bdifference=bafter-bbefore;

        System.out.println("before calling binary method: "+bbefore+"\t After calling binary method: "+bafter);
        System.out.println("Time difference: "+bdifference);
        System.out.println("Element index: "+foundIndex_b);
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

}
