package com.LinkedList;
import java.util.LinkedList;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
//        Take elements(numbers in the range of 1-50) of a Linked List as input from the user
//        . Delete all nodes which have values greater than 25.
        int size=50;
        LinkedList<Integer> list=addElements(size);

        displayList(list);
        list = deleteNodes(list);
        displayList(list);
    }

    public static LinkedList<Integer> addElements(int size){
        LinkedList<Integer> list=new LinkedList<>();
        Scanner input=new Scanner(System.in);
        for (int i = 1; i <= size; i++) {
            list.add(i);
        }
        return list;
    }

    public static void displayList(LinkedList<Integer> list){

        System.out.println(list);
    }

public static LinkedList<Integer> deleteNodes(LinkedList<Integer> list){
    for (int i =list.size()-1; i>0; i--) {
        if (list.get(i) > 25) {
            list.remove(i);
        }
    }
    return list;
}





}
