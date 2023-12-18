package com.LAB1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        String userInput;

   String question="DSA is stands for??";
   String option1="Data Systems and Algorithms ";
   String option2="Data Structure and Algorithms";
   String option3="Data Sciences and Analysis";

   String correctAnswer=option2;

        System.out.println(question);
        System.out.println(" -> "+option1);
        System.out.println(" -> "+option2);
        System.out.println(" -> "+option3);
        System.out.println("Write your answer...");
            userInput=input.nextLine();
       if (userInput.equals(correctAnswer)){
           System.out.println("Congratulations Answer is correct. ");
       }
       else {
           System.out.println("Sorry Answer is wrong.");
       }

    }
}
