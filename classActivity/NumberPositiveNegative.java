package com.classActivity;

import java.util.Scanner;

public class NumberPositiveNegative {
    public static void main(String[] args) {

        //       Write a program which take input from the user a number
//       and tell the user that the entered number is either positive, negative or zero..

        Scanner input=new Scanner(System.in);
        int number;
        System.out.println("Enter number");
        number=input.nextInt();
        if (number>0){
            System.out.println("Number is positive..");
        }
        else if (number<0) {
            System.out.println("Number is Negative..");

        }
        else {
            System.out.println("Number is zero");
        }



    }
}
