package com.LAB2;

public class LeetCodeProblem {
    public static void main(String[] args) {


    //Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to
    // target.
    //You may assume that each input would have exactly one solution, and you may not use the same element twice.
    //You can return the answer in any order.add up to target.

    int[] array={4,8,2,6,15};
    int targetSum=14;
    int firstIndex=-1,secondIndex=-1;
    int navigateSum;
    boolean found=false;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 1+i; j < array.length; j++) {
                navigateSum = array[i] + array[j];
                if (navigateSum == targetSum) {
                    firstIndex = i;
                    secondIndex = j;
                    found=true;
                    break;
                }

            }
            if (found){
                break;
            }
        }
            System.out.println("Indices: "+firstIndex+" "+secondIndex);
}
}