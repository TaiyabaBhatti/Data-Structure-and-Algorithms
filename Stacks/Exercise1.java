package com.Stacks;

public class Exercise1 {
    public static void main(String[] args) {


        ArrayStack fruitCaret=new ArrayStack(3);

        fruitCaret.push(12);
        fruitCaret.push(77);
        fruitCaret.push(90);
        System.out.println(fruitCaret.peek());
        System.out.println("Size: "+fruitCaret.size());
        System.out.println("pop: "+fruitCaret.pop());
        System.out.println(fruitCaret.peek());

        fruitCaret.push(113);
        fruitCaret.push(567);
        fruitCaret.push(900);
        System.out.println(fruitCaret.peek());




    }
}
interface Stack{
    public int peek();
    public int pop();
    public void push(int element);
    public int size();

}

class ArrayStack implements Stack{

private int[] array;
    private int size;

    ArrayStack(int capacity){
        array=new int[capacity];         //initialize the size for carate
    }

    public boolean isEmpty(){
        return (size==0);                 //Check that the fruit Carate is empty or not (fruits or not)
    }

    @Override
    public int peek() {
        if (size==0){
            throw new IllegalStateException("Stack is empty");
        }
        return array[size-1];             //peek element returns means one which has put at last
    }

    @Override
    public int pop() {
        int secLast = array[--size];
        array[size]=0;
        return secLast;
    }

    @Override
    public void push(int element) {

        if (size==array.length){
resize();
        }
        array[size++]=element;
    }

    @Override
    public int size() {
        return size;
    }

    public void resize(){

        int[] newArray=array;       //save reference to the old one
        array=new int[2*array.length];
        System.arraycopy(newArray,0,array,0,size);
    }

}