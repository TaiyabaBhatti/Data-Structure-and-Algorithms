package com.LinkedList;

import java.util.Scanner;

public class SubListFromLinkedList {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

//Input data by user and insert at the last in ascending
        System.out.println("Enter first node data:");
        NodeClass node1=new NodeClass(input.nextInt());
        System.out.println("Enter size: ");
        int noOfNodes=input.nextInt();
        System.out.println("Starting node is: "+node1.data);
        for (int i = 1; i <noOfNodes ; i++) {
            insertAtLast(node1,new NodeClass(input.nextInt()));
        }
        display(node1);

        //  ### sublist where to start
        int startingIndex,lastIndex;
        System.out.println("Enter the starting index of list:");
        startingIndex=input.nextInt();
        System.out.println("Enter the last index of list:");
        lastIndex=input.nextInt();
        NodeClass start=sublistStart(node1,startingIndex,noOfNodes);
        display(start);








        //  ### Extract sublist from starting index to ending index
    }




    public static void display(NodeClass head) {
        for (NodeClass start = head; start != null; start = start.next) {
            System.out.print(start.data + " -> ");
        }
        System.out.println();
    }
    public static void insertAtLast(NodeClass head, NodeClass newNode) {
        NodeClass current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // sublist where to start
    public static NodeClass sublistStart(NodeClass head,int index,int size) {

        NodeClass current = head;
        for (int i = 0; i < size; i++) {
            if (i == index) {
                break;
            }
            current = current.next;
        }

        if (current == null) {
            System.out.println("Index not found:");
            return null;
        } else {
            return current;
        }
    }









}
