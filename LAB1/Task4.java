package com.LAB1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        //Calculate Employees salary

        Scanner input=new Scanner(System.in);

          //Employee work 7days a week
         //Number of hours employee works per weeks
        // 1 day employee work for -> 8hours
        // 1 hour salary of Employee -> 100rs
       // 1day salary -> 800rs

        int perDayWorkHour;
        int perWeekWorkHour;
        float moneyPerHour;
        float weeklyMoneyStatus;
        float yearlyMoneyStatusPlusBonus;
        float monthlyMoneyStatus;
        float bonus;
        float YMSPBWithVacationDays;
        int numberOfVacation;


        System.out.println("Enter number of hours employee work in one day..");
        perDayWorkHour= input.nextInt();

        System.out.println("Enter number of hours employee work in one week..");
        perWeekWorkHour= input.nextInt();

        System.out.println("Enter amount of Money employee make in one hour.");
        moneyPerHour= input.nextFloat();

        System.out.println("Enter number of Vacations.");
        numberOfVacation=input.nextInt();


        System.out.println("Enter amount of bonus yearly.");
        bonus= input.nextFloat();

        weeklyMoneyStatus=perWeekWorkHour*moneyPerHour;
        System.out.println("Employee earn amount of money in one week: "+weeklyMoneyStatus);

        monthlyMoneyStatus=4*perWeekWorkHour*moneyPerHour;
        System.out.println("Employee earn amount of money in one month: "+monthlyMoneyStatus);


        yearlyMoneyStatusPlusBonus=52*perWeekWorkHour*moneyPerHour+bonus;
        System.out.println("Employee earn amount of money in one year: "+yearlyMoneyStatusPlusBonus);

        YMSPBWithVacationDays=yearlyMoneyStatusPlusBonus-(numberOfVacation*8*moneyPerHour);
        System.out.println("Employee earn amount of money in one year: "+YMSPBWithVacationDays);





    }
}
