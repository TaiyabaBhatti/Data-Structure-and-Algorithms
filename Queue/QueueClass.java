package com.Queue;

public class QueueClass implements QueueInterface {
    private Node head=new Node(null);  //dummy node
    private int size;

    @Override
    // we cants add nodes as head.next=new node
    // this will lead in every entry the first they will be the recent one
    // but in case it should be the last, so we move back then add.
    // we have to do this head.previous.next


    public void addObjects(Object ob) {
        head.previous.next=new Node(ob,head.previous,head);
        head.previous=head.previous.next;
        size++;
    }
    @Override
    public int size() {
        return size;
    }
    @Override
    public Object First() {
        isEmpty();
        return head.next.next.data;
    }
    @Override
    public Object last() {
        isEmpty();
        return head.previous.data;
    }

    @Override
    public Object removeFirst() {

        isEmpty();
        Node temp=head.next;
        head.next=temp.next;
        head.next.previous=head;
        size--;
        return temp.data;
    }
    @Override
    public Object removeLast(){
        isEmpty();
        Node temp=head.previous;  //last element
        head.previous=temp.previous;
        head.previous.next=head;
        return temp.data;
    }
    @Override
    public Object removeSecondNode() {
        isEmpty();

        Node temp=head.next.next;
        head.next.next=temp.next;
        temp.next.previous=head.next;
        return temp.data;








    }
    @Override
    public Object[] queueToArray() {
        isEmpty();
        Object[] array=new Object[size];
        Node temp=head.next;

        for (int i = 0; i < size; i++) {
         array[i]=temp.data;
            temp=temp.next;
        }

        return array;
    }
    @Override
    public void forwardTraversing() {
       isEmpty();

        Node temp=head.next;
        while (temp.data!=head.data){

            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    @Override
    public void backwardTraversing() {
        isEmpty();
        Node temp=head.previous;
        while (temp.data!=head.data){

            System.out.print(temp.data+" ");
            temp=temp.previous;
        }
    }
    @Override
    public Object searchNodeByPosition(int position) {
        isEmpty();
        Node temp=head.next;
        int counter=1;
        while(temp.data!=head.data){

            if (counter==position){
                return temp.data;
            }
            temp=temp.next;
            counter++;
        }
        return -1;
    }
    @Override
    public boolean serachNodeByData(Object data) {
        isEmpty();
        Node temp=head.next;
        while(temp.data!=head.data){

            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    @Override
    public void isEmpty(){
        if (size==0){
            throw new IllegalStateException("Queue is empty");
        }


    }






}
