package com.LAB1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

//        Write a java program which will take age and display
//the theatre ticket cost
//• For adult(age>13) ticket is $10
//• for the child(age<13) ticket cost is $5
//• there is a special discount for senior
//citizens(age>65) and ticket is $7 for them

        Scanner input=new Scanner(System.in);
        byte age;
        System.out.println("Enter your Age!!");
        age=input.nextByte();
        if (age>13 & age<=65){
            System.out.println("Your ticket cost is $10");
        }
        else if (age<13 & age>0){
            System.out.println("Your ticket cost is $5");
        }
        else if (age>65){
            System.out.println("Your ticket cost is $7");
        }
         else if (age<=0){
            System.out.println("Invalid age input.");
        }














    }
}
