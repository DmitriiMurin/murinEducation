package com.example.murin;

import com.example.murin.collections.list.MyArrayList;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> myArrayList = (List<Integer>) new MyArrayList<Object>(10);
        for(int i = 0; i<10; i++){
            myArrayList.add(i);
            System.out.println(myArrayList);
        }
    }
}
