package com.example.murin.collections.list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.IntStream;

public class MyArrayListTest {

    @Test
    public void shouldAddSameValues() {
        //create
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        ArrayList<Integer> correctArrayList = new ArrayList<>();
        //fill
        int limit = 100;
        Random random = new Random();
        IntStream.generate(random::nextInt).limit(limit).forEach(i -> {
            myArrayList.add(i);
            correctArrayList.add(i);
        });
        //check
        Assertions.assertEquals(correctArrayList.size(), myArrayList.size());
        Assertions.assertEquals(limit, myArrayList.size());
        for(int i = 0; i < limit; i++) {
            Assertions.assertEquals(correctArrayList.get(i), myArrayList.get(i));
        }
    }

    @Test
    public void shouldRemoveValueInTheMiddle() {
        //create
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        ArrayList<Integer> correctArrayList = new ArrayList<>();
        //fill
        int limit = 100;
        Random random = new Random();
        IntStream.generate(random::nextInt).limit(limit).forEach(i -> {
            myArrayList.add(i);
            correctArrayList.add(i);
        });
        //remove
        correctArrayList.remove(50);
        myArrayList.remove(50);
        //check
        Assertions.assertEquals(correctArrayList.size(), myArrayList.size());
        Assertions.assertEquals(limit -1, myArrayList.size());
        for(int i = 0; i < limit; i++) {
            Assertions.assertEquals(correctArrayList.get(i), myArrayList.get(i));
        }
    }
}
