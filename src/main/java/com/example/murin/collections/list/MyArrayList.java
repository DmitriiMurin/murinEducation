package com.example.murin.collections.list;

public class MyArrayList<E> {

    private int size;
    private E[] array;

    public MyArrayList() {
        this.size = 10;
        this.array = (E[]) new Object[size];
    }

    public boolean add(E e) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = e;
                return true;
            }
        }
        return false;
    }
        public void size () {

        }

        public E get (int index) {
        return array[index];
        }

        public void remove () {

        }
    }
