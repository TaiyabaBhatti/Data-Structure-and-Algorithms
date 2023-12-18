package com.classActivity;
import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int[] array={3,5,7,8,11,90};
        System.out.println("Enter element to search.");
        int elementToSearch= input.nextInt();
        int indexFindLS=linearSearch(array,elementToSearch);
        System.out.println("Element found at: "+indexFindLS);

        int indexFindBS=binarySearch(array,elementToSearch);
        System.out.println("Element found at: "+indexFindBS);

    }
    static int linearSearch(int[] array,int element){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==element){
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] array,int element){
        int leftIndex=0;
        int rightIndex=array.length-1;
        int midIndex=(leftIndex+rightIndex)/2;
        while(leftIndex<=rightIndex){
           if (array[midIndex]==element){
               return midIndex;
           } else if (array[midIndex]<element) {
               leftIndex=midIndex+1;
              midIndex=(leftIndex+rightIndex)/2;
           } else if (array[midIndex]>element) {
               rightIndex=midIndex-1;
               midIndex=(leftIndex+rightIndex)/2;
           }
        }
        return -1;
    }
}
