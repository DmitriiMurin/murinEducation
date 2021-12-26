package com.example.murin;

import com.example.murin.collections.list.MyArrayList;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();

        myArrayList.add(1);
        myArrayList.add(3);
        myArrayList.add(5);
        myArrayList.add(10);
        System.out.println(myArrayList.get(3));
    }
}
