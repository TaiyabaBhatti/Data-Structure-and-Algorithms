package com.Queue;

public class Node {

    Node next=this;        //next should be Node
    Node previous=this;      //previous should be node
    Object data;

    Node(Object data){
        this.data=data;
    }
    Node(Object data, Node previous, Node next){

        this.data=data;
        this.previous=previous;
        this.next=next;


    }











}
