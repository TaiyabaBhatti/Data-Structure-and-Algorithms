package com.LinkedList;

import java.util.Scanner;

public class ConcatenateLinkedList {
    public static void main(String[] args) {
        int data;
        int index;
        NodesA head1;
        NodesA head2;

        Scanner input=new Scanner(System.in);
        ListA linkedList1=new ListA();


        NodesA node1=new NodesA(5);
        NodesA node2=new NodesA(3);
        NodesA node3=new NodesA(10);
        linkedList1.populateLinkedList(node1,node2,node3);
        linkedList1.display();

        for (int i = 1; i <= 1; i++) {
            System.out.println("Enter new node data.");
            data = input.nextInt();
            System.out.println("Enter to which index.");
            index = input.nextInt();
            linkedList1.insertAtHead(data, index);
            linkedList1.display();
        }

        System.out.println();
        ListA linkedList2=new ListA();
        NodesA a=new NodesA(1);
        NodesA b=new NodesA(6);
        NodesA c=new NodesA(18);
        linkedList2.populateLinkedList(a,b,c);
        linkedList2.display();

        for (int i = 1; i <= 1; i++) {
            System.out.println("Enter new node data.");
            data = input.nextInt();
            System.out.println("Enter to which index.");
            index = input.nextInt();
            linkedList2.insertAtHead(data, index);
            linkedList2.display();
        }

        //Concatenate

        head1=linkedList1.head();
        head2=linkedList2.head();
        System.out.println();
        System.out.println(head1.data);
        System.out.println(head2.data);


        while(head1.next!=null){
            head1=head1.next;
        }

            head1.next=head2;
            head2=head2.next;

        System.out.println();
        linkedList1.display();








    }
}
class NodesA{
    int data;
    NodesA next;
    NodesA(int data){
        this.data=data;
        this.next=null;
    }
}
class ListA{
    NodesA head;
    ListA(){
        this.head=null;
    }

    public void populateLinkedList(NodesA node1,NodesA node2,NodesA node3){
        head=node1;
        node1.next=node2;
        node2.next=node3;
    }


    public void display(){
        NodesA current=head;
        if (current==null){
            System.out.println("List is empty");
            return;
        }
        while (current!=null){
            System.out.print(current.data+" -> ");
            current=current.next;
        }
    }

    public void insertAtHead(int data,int index){
        if (head==null){
            System.out.println("List is empty");
        }
        else if (index==0) {
            NodesA newNode=new NodesA(data);
            newNode.next=head;
            head=newNode;
        }
    }

    public NodesA head(){
        return this.head;

    }








}
