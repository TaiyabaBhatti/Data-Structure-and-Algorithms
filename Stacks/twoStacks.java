package com.Stacks;

interface Stack1 {
    public Object peek();
    public Object pop();
    public void push(Object obj);
    public int size();
}
public class twoStacks implements Stack1 {

    private Object[] a;
    private int size;

    public twoStacks(int capacity) {
        a = new Object[capacity];
    }
    @Override
    public Object peek() {
        if(size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return a[size-1];
    }

    @Override
    public Object pop() {
        if(size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        Object temp = a[--size];
        a[size] = null;
        return temp;
    }

    @Override
    public void push(Object obj) {
        if(size == a.length) resize();
        a[++size] = obj;
    }

    public void resize() {
        Object aa[] = a;
        aa = new Object[a.length*2];
        System.arraycopy(aa,0,a,0,size);
    }


    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        twoStacks fruits = new twoStacks(3);
        fruits.push("Orange");
        fruits.push("Strawberry");

        fruits.push("banana");
        twoStacks coldrink = new twoStacks(3);
        coldrink.push("Pepsi");
        coldrink.push("7up");
        coldrink.push("fanta");

        int sizeOfColdrink = coldrink.size();

        for(int i=0; i<sizeOfColdrink; i++){

        }
    }

}
