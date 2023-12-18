package com.LinkedList;

import java.util.Scanner;

public class ReplaceNode {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        NodeClass n1 = new NodeClass(5);
        NodeClass n2 = new NodeClass(4);
        NodeClass n3 = new NodeClass(17);
        NodeClass n4 = new NodeClass(8);
        NodeClass n5 = new NodeClass(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        display(n1);


        // Replace node by index number
//        int indexNo;
//        int data;
//        System.out.println("Enter no index no to replace node data: ");
//        indexNo=input.nextInt();
//        System.out.println("Enter data to write in replace: ");
//        data=input.nextInt();
//        replaceNodeDataByIndex(n1,indexNo,data);
//        display(n1);
//
//        //Replace node by comparing data
        int newData,oldData;
//        System.out.println("Enter new data: ");
//        newData=input.nextInt();
//         System.out.println("Enter existing data: ");
//        oldData=input.nextInt();
//        replaceNodeDataByData(n1,newData,oldData);
//        display(n1);

        //Replace Node By node
        System.out.println("Enter new data: ");
        newData=input.nextInt();
        System.out.println("Enter old data: ");
        oldData=input.nextInt();
        replaceNode(n1,newData,oldData);
display(n1);





    }
    public static void display(NodeClass head) {
        for (NodeClass start = head; start != null; start = start.next) {
            System.out.print(start.data + " -> ");
        }
        System.out.println();
    }
    public static void replaceNodeDataByIndex(NodeClass head, int indexNo, int data) {
        int i=0;
        NodeClass current=head;
        while (current!=null){
            if (i==indexNo){
                current.data=data;
                break;
            }
            current=current.next;
            i++;
        }
    }

//    Replace node by comparing data data
    public static void replaceNodeDataByData(NodeClass head, int newData, int olddata){
        NodeClass current=head;
        while (current!=null){
            if (current.data==olddata){
                current.data=newData;
                break;
            }
            current=current.next;
        }
    }

// Replace Node by new node by checking data
public static void replaceNode(NodeClass head,int newData,int oldData) {
    int i = 0;
    NodeClass current = head;
    while (current.next != null) {
        if (current.next.data == oldData) {
            current.next = new NodeClass(newData, current.next.next);
            break;
        }
        current = current.next;
    }
}
}
