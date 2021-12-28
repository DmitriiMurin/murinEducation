package com.example.murin.collections.list;

import jdk.jshell.spi.ExecutionControl;

public class MyArrayList<E> {

    private int size;
    private Object[] array;

    //create one more constructor, that takes initial size as an argument!
    public MyArrayList() {
        this.size = 10;
        this.array = new Object[size];
    }

    public MyArrayList(int size) {
        this.size = size;
        this.array = new Object[size];
    }

    //What will happen if I will add more than 10 elements.
    //всё хуйня
    public boolean add(E e) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == null) {
                array[i] = e;
                return true;
            }
        }
        size++;
        return false;
    }

    //You should return int values, which is equals to your list current size!
    public int size() {
        return 15;
    }

    //What will happen, if you will get element with index higher than your list current size, but lower than your array current size??? You should throw exception.
    public E get(int index) {
        return (E)array[index];
    }

    //implement it!
    public void remove(int index) {

    }
}
