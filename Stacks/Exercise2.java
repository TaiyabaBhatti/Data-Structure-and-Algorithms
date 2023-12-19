package com.Stacks;

public class Exercise2 {
    public static void main(String[] args) {

        ArrayStacks fruitsCarte=new ArrayStacks(3);
        ArrayStacks coldDrinksCarte=new ArrayStacks(5);

        fruitsCarte.push("Apple");
        fruitsCarte.push("Banana");
        fruitsCarte.push("Orange");
        System.out.println(fruitsCarte.peek());

        coldDrinksCarte.push("coca-cola");
        coldDrinksCarte.push("Marinda");
        coldDrinksCarte.push("Sprite");
        System.out.println(coldDrinksCarte.peek());

        //pushing fruitCarte obj to coldDrinkscarte from top obj

//        coldDrinksCarte.push(fruitsCarte.pop());
//        coldDrinksCarte.push(fruitsCarte.pop());
//        coldDrinksCarte.push(fruitsCarte.pop());
//        System.out.println(coldDrinksCarte.peek());
        System.out.println(coldDrinksCarte.size());
        System.out.println(fruitsCarte.size());
         int length= fruitsCarte.size();

        for (int i = 0; i < length; i++) {
            coldDrinksCarte.push(fruitsCarte.popFromBase(i));
        }
        System.out.println(coldDrinksCarte.peek());

    }
}

interface Stacks{

    Object peek();
    Object pop();
    void push(Object obj);
    public void resize();
    public Object popFromBase(int index);
    int size();
}
class ArrayStacks implements Stacks{
    private Object[] array;
    private int size;
    ArrayStacks(int capacity){
        array=new Object[capacity];         //initialize the size for carte
    }
    public boolean isEmpty(){
        return (size==0);                 //Check that the fruit Carate is empty or not (fruits or not)
    }

    @Override
    public Object peek() {
        if (size==0){
            throw new IllegalStateException("Stack is empty");
        }
        return array[size-1];             //peek element returns means one which has put at last
    }

    @Override
    public Object pop() {
        Object Last = array[--size];
        array[size]=0;
        return Last;
    }

    @Override
    public void push(Object element) {
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
        Object[] newArray=array;       //save reference to the old one
        array=new Object[2*array.length];
        System.arraycopy(newArray,0,array,0,size);
    }
public Object popFromBase(int index){
        Object fromBase=array[index];
        array[index]=0;
        size--;
        return fromBase;
}
}
