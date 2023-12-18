package com.LinkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

//        Make a Linked List & add the following elements to it.
//        Search for the number 7 & display its index.

        LinkedList<Integer> list=new LinkedList<>();
        System.out.println("Enter size of the list.");
        int sizeOfList = input.nextInt();

        System.out.println("Add Elements to it.");
        for (int i=0;i<sizeOfList;i++){
            list.add(input.nextInt());
        }
        System.out.println(list);

        int index=searchElement(list);
        System.out.println("index value: "+index);
    }

    public static int searchElement(LinkedList<Integer> list){

        Scanner input=new Scanner(System.in);
        int search=input.nextInt();
        if (list.isEmpty()){
            System.out.println("List is empty.");
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i)==search){
               System.out.println("Found");
               return i;
           }
        }
        return -1;
    }

}
