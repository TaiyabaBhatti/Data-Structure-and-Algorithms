package com.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class SumOfAllNodes {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Llist linkedList=new Llist();
        int data;
        int index;

      Nodes node1=new Nodes(5);
      Nodes node2=new Nodes(3);
      Nodes node3=new Nodes(10);
      linkedList.populateLinkedList(node1,node2,node3);
      linkedList.display();

        for (int i = 1; i <= 1; i++) {
            System.out.println("Enter new node data.");
            data = input.nextInt();
            System.out.println("Enter to which index.");
            index = input.nextInt();
            linkedList.insertAtHead(data, index);
            linkedList.display();
        }

        System.out.println("Sum Of all nodes: "+linkedList.sumOfAllNodes());


    }
}
class Nodes{
    int data;
    Nodes next;
    Nodes(int data){
        this.data=data;
        this.next=null;
    }
}
class Llist{

    Nodes head;
    Llist(){
        this.head=null;
    }

    public void populateLinkedList(Nodes node1,Nodes node2,Nodes node3){
        head=node1;
        node1.next=node2;
        node2.next=node3;
    }


    public void display(){
        Nodes current=head;
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
        Nodes newNode=new Nodes(data);
        newNode.next=head;
        head=newNode;
        }
}

public  int sumOfAllNodes() {

    int sum = 0;
    for (Nodes current = head; current != null; current = current.next) {
        sum += current.data;
    }
          return sum;
}


}

