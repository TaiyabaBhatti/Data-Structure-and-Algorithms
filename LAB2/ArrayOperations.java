package com.LAB2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        array1 a1=new array1(3);

        a1.insert();
         a1.display();
      //  a1.delete(0);       //delete by index
        a1.deleteByValue(7);
        int maximumElement=a1.maxElement();
        System.out.println("Maximum element: "+maximumElement);

        int minimumElement=a1.minElement();
        System.out.println("Minimum element: "+minimumElement);

        int sum=a1.SumOfElements();
        System.out.println("Sum of All Elements : "+sum);
    }
}
class array1{
    //properties or variables
    int[] Arr;

    int size;
    //constructor
    array1(int n){
        this.size=n;
        Arr=new int[n];
    }
    Scanner in=new Scanner(System.in);
    //operations or methods
    //1- instert
    void insert(){
        System.out.println("Enter array elements: ");
        for(int i =0; i<size; i++){
            Arr[i]=in.nextInt();
        }
    }

    //2- display
    void display(){
        for(int i=0; i<size; i++){
            System.out.print(Arr[i]+", ");
        }
        System.out.println();
    }
    //3- delete
    //33
    void delete(int pos){
        System.out.println("\nBefore deletion");
        display();
        for(int i=0; i<size-1; i++){
            if(i+1>=pos && pos<size){
                Arr[i]=Arr[i+1];
            }
        }
        size--;
        System.out.println("\nAfter deletion");
        display();
    }
    //deleteByValue - search()

    void deleteByValue(int value){

        System.out.println("Deletion by value.");
        int indexFound =search(value);
        if (indexFound<0){
            System.out.println("Element not found..");
        } else {
            delete(indexFound);
        }
    }

    // update










    //4- find max

    int maxElement(){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < Arr.length; i++) {

            if (Arr[i]>max){
                max=Arr[i];
            }

        }
        return max;
    }








    //5- search(linear) //return index
    int search(int element){

        int foundIndex;
        for (int i = 0; i < Arr.length; i++) {

            if (Arr[i]==element){
                foundIndex=i;
                return i;
            }
        }
        return -1;
    }


    //6- sorting (lab)










    //5- find min

    int minElement(){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < Arr.length; i++) {

            if (Arr[i]<min){
                min=Arr[i];
            }

        }
        return min;
    }
    //7- sum of all elements in an array
     int SumOfElements() {
         int sumOfElements = 0;
         for (int element : Arr) {
             sumOfElements += element;
         }

return sumOfElements;
     }
}