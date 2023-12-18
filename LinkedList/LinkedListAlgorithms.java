package com.LinkedList;

import java.util.Arrays;
import java.util.Scanner;

class NodeClass{

    int data;
    NodeClass next;
    NodeClass(int data){
        this.data=data;
        this.next=null;
    }
    NodeClass(int data,NodeClass next){
        this.data=data;
        this.next=next;
    }

}

public class LinkedListAlgorithms {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

//        LinkedList populated by given assighining every node the reference to next node
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

//      insert node at last to the list
        insertAtLast(n1, new NodeClass(11));
        display(n1);

//      insert node at start to the list
        NodeClass currentNode = insertAtStart(n1, new NodeClass(51));
        display(currentNode);

        //      insert node at any index to the list
        insertAtGivenIndex(currentNode, new NodeClass(10), 3);
        display(currentNode);

//      LinkedList to Array
        int[] array = LinkedListToArray(currentNode);
        System.out.println("LinkedList to Array: " + "\n" + Arrays.toString(array));

//      Array To linkedList
        NodeClass firstNode=new NodeClass(array[0]);
        NodeClass p=firstNode;
        for (int i = 1; i < array.length-1 ; i++) {
         insertAtLast(firstNode,new NodeClass(array[i]));
        }
        display(p);




//      Sort Array in ascending order
        int[] sortedArray = bubbleSort(array);
        System.out.println("Array to LinkedList: " + "\n" + Arrays.toString(sortedArray));

//        ######## INSERTION IN ASCENDING ORDER NODES

        //Input data by user and insert at the last in ascending
        NodeClass node1=new NodeClass(2);
        System.out.println("Enter size: ");
        int noOfNodes=input.nextInt();
        System.out.println("Starting index is: "+node1.data);
        for (int i = 0; i <noOfNodes-1 ; i++) {
            insertAtLast(node1,new NodeClass(input.nextInt()));
        }
        display(node1);

//        insert in order by looking at data
        System.out.println("Enter element to insert:");
        int element= input.nextInt();
        NodeClass start = insert(node1,element);
        display(start);

// delete node in ascending order
        System.out.println("Enter element to delete:");
        element=input.nextInt();
        NodeClass deletedNodes=deleteNode(start,element);
        display(deletedNodes);
    }


    public static void display(NodeClass head) {
        for (NodeClass start = head; start != null; start = start.next) {
            System.out.print(start.data + " -> ");
        }
        System.out.println();
    }
    //    Insert node at last
    public static void insertAtLast(NodeClass head, NodeClass newNode) {
        NodeClass current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    //Insert node at start
    public static NodeClass insertAtStart(NodeClass head, NodeClass newNode) {
        newNode.next = head;
        head = newNode;
        return head;
    }
    //Insert node at given index
    public static void insertAtGivenIndex(NodeClass head, NodeClass newNode, int index) {
        NodeClass current = head;
        int i = 1;
        while (i != index) {
            current = current.next;
            i++;
        }
        newNode.next = current.next; //8->null      4->17
        current.next = newNode;       //4->17=newnode
    }
    // LinkedList to array
    public static int[] LinkedListToArray(NodeClass head) {
        NodeClass current = head;
        int size = 0;
        for (NodeClass start = head; start != null; start = start.next) {
            size++;
        }
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = current.data;
            current = current.next;
        }
        return array;
    }
    // Sort array in ascending order
    public static int[] bubbleSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < (array.length - 1) - i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
    //insert nodes in ascending order
    public static NodeClass insert(NodeClass head,int element){

        NodeClass current=head;

        if (head==null){
            head=new NodeClass(element,head);
            return head;
        }

        if (head.next==null && head.data>element){
            head=new NodeClass(element,head);
            return head;
        }
        while(head.next!=null)           //end of the list
        {
            if (current.next.data>element){
                break;
            }
            current=current.next;
        }
        current.next=new NodeClass(element,current.next);
        return head;
    }

    //delete node by looking ascending order
    public static NodeClass deleteNode(NodeClass head,int element){

        if (head==null || head.data>element )
        {
            return head;
        }
        if (head.data==element){
            return head.next;
        }
        for (NodeClass start=head; start!=null ; start=start.next) {
            if (start.next.data==element){
                start.next=start.next.next;
            }
            if (start.next.data>element){
                break;
            }
        }
        return head;
    }

    //replace node by index number;












}