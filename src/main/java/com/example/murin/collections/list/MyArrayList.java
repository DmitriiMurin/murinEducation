package com.example.murin.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    transient Object[] elementData;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
    private int size;
    private static final Object[] EMPTY_ELEMENTDATA = {};
    public MyArrayList (){
        this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }
    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    initialCapacity);
        }
    }
    public MyArrayList(Collection<? extends E> c) {
        Object[] a = c.toArray();
        if ((size = a.length) != 0) {
            if (c.getClass() == ArrayList.class) {
                elementData = a;
            } else {
                elementData = Arrays.copyOf(a, size, Object[].class);
            }
        } else {
            // replace with empty array.
            elementData = EMPTY_ELEMENTDATA;
        }
    }
    private Object[] grow(int i) {
        return grow(size + 1);
    }

    private void add(E e, Object[] elementData, int s) {
        if (s == elementData.length)
            elementData = grow(size + 1);
        elementData[s] = e;
        size = s + 1;
    }

    public void size(){

    }

    public void get(){

    }

    public void remove(){

    }

}
