package com.LinkedList;

import java.util.Scanner;

public class LinkedInnerNodeClass {
    public static void main(String[] args) {

LinkList list=new LinkList();
        LinkList.Node head;
    LinkList.Node n1=new LinkList.Node(5);
    LinkList.Node n2=new LinkList.Node(8);
    LinkList.Node n3=new LinkList.Node(2);
//    Connecting nodes
        n1.next=n2;
        n2.next=n3;
        list.displayList(n1);


//  insert at head
    LinkList.Node n4=new LinkList.Node(10);
    head=list.insertAtHead(n1,n4);
    list.displayList(head);

// insert at the last
        LinkList.Node n5=new LinkList.Node(70);
        list.insertAtLast(head,n5);
        list.displayList(head);

// insert at given index
        Scanner input=new Scanner(System.in);
        System.out.println("Enter index to which insert:");
        int index= input.nextInt();
        LinkList.Node n6=new LinkList.Node(56);
        list.insertAtGivenIndex(head,n6,index);
        list.displayList(head);

    }
}
class LinkList{
    static int size=0;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
           LinkList.size++;
        }
    }

public void displayList(Node head){
        Node current=head;
        if (current==null){
            System.out.println("List is empty:");
        }
        else {
            while (current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.println("null");
        }
}
public Node insertAtHead(Node oldHead, Node newHead){
        newHead.next=oldHead;
        oldHead=newHead;
        return oldHead;
}

    public void insertAtLast(Node head,Node newNode) {
        Node current=head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    public void insertAtGivenIndex(Node head,Node newNode, int index){

        if (index<0 || index>size){
            throw new IllegalStateException("Index out of bound");
        }
        Node current=head;
        int count=2;
        while (count!=index){
            current=current.next;
            count++;
        }
        newNode.next=current.next;
        current.next=newNode;
    }
}
