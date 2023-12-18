package com.LinkedList;

public class Basic {

    public static void main(String[] args) {

    LL linkedList=new LL();
      Node node1=new Node(1);
      Node node2=new Node(2);
      Node node3=new Node(3);

      linkedList.populateLinkedList(node1,node2,node3);
      linkedList.displayLinkedList();

      Node node4=new Node(8);
      linkedList.insertNodeAtHead(node4);
      linkedList.displayLinkedList();

      Node node5=new Node(10);
linkedList.insertNodeAtGivenIndex(node5,2);
linkedList.displayLinkedList();

      Node node6=new Node(12);
      linkedList.insertNodeAtLast(node6);
       linkedList.displayLinkedList();

       Node node7=new Node(89);
       linkedList.insertNode(node7,4);
       linkedList.displayLinkedList();
        System.out.println(linkedList.getSize());

       linkedList.deleteFirstNode(0);
       linkedList.displayLinkedList();
        System.out.println(linkedList.getSize());


        linkedList.deleteLastNode();
        linkedList.displayLinkedList();
        System.out.println(linkedList.getSize());



    }
}
class Node{
    int data;
    static int size=0;
    Node next;    //next type is node it reffers to next node
Node(int data){
    this.data=data;
    this.next=null;
    size++;
}
}
class LL{

    Node head;

    LL(){
        this.head=null;
    }
               //1-Linked differnt nodes to form linkedList
     public void populateLinkedList(Node a,Node b, Node c){
        head=a;
        a.next=b;
        b.next=c;
 }
             //2-display LinkedList
     public  void displayLinkedList() {

         Node current = head;
         while (current != null) {
             System.out.print(current.data+" -> ");
             current = current.next;
         }
         System.out.println();
     }

        //3- Insert one node at head to the LinkedList
         void insertNodeAtHead(Node newNode){
               newNode.next=head;
               head=newNode;
         }

         //4- Insert node at given index to the linkedList
          void insertNodeAtGivenIndex(Node newNode,int index) {
              Node current = this.head;
              for (int i = 0; i < index - 1 && current != null; i++) {
                  current = current.next;
              }
              if (current != null) {
                  newNode.next = current.next;
                  current.next = newNode;
              }
          }

          //5- Insert node at last
          void insertNodeAtLast(Node newNode){
           Node current=head;
         while(current.next!=null){
             current=current.next;
         }
         current.next=newNode;
          }

          //6- combine 3 ways to insert node
          void insertNode(Node newNode, int index){
            Node current=head;
            if (index==0){
                newNode.next=head;
                head=newNode;
            }

            else if(index>0){
                for (int i = 0; i < index-1 && current!=null; i++) {
                    current=current.next;
                }
                newNode.next=current.next;
                current.next=newNode;

            }
        else if(index<0){
                System.out.println("Invalid input");
            }
    }

    //7- Delete firstNode

    void deleteFirstNode(int index){

        if (head==null){
            System.out.println("LinkedList is Empty");
        }
        else if (index==0){
            head=head.next;
            Node.size--;
        }

        }

    //8- delete last node

    void deleteLastNode(){

       Node secondLast=head;
       Node last=head.next;


        if (head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node.size--;
        while (last.next!=null) {
            last=last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
     int getSize(){

        return Node.size;
     }








  }

