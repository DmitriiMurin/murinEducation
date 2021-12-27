package com.example.murin.collections.list;

public class MyArrayList<E> {

    private int size;
    //Use Object!
    private E[] array;

    //create one more constructor, that takes initial size as an argument!
    public MyArrayList() {
        this.size = 10;
        //Don't cast it here, use Object. Cast before get or other methods, which returns values!
        this.array = (E[]) new Object[size];
    }

    //What will happen if I will add more than 10 elements.
    public boolean add(E e) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = e;
                return true;
            }
        }
        return false;
    }

    //You should return int values, which is equals to your list current size!
    public void size() {

    }
    //What will happen, if you will get element with index higher than your list current size, but lower than your array current size??? You should throw exception.
    public E get(int index) {
        return array[index];
    }

    //implement it!
    public void remove() {

    }
}
