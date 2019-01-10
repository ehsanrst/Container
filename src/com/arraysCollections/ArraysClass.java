package com.arraysCollections;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArraysClass {
    public static void main(String[] args) {
        Random random = new Random();
        Long[] array = new Long[100];

        //*Arrays======================
        //fill & copy
        Arrays.fill(array, 5L);
        Long[] copy = Arrays.copyOf(array, 150);

        //make array to unModifiable List
        List<Integer> unModifiableList = Arrays.asList(1, 2, 3, 4, 5);
        List<Long> asList = Arrays.asList(array);

        //sort & search
        Arrays.sort(array); //sort with algorithms
        int index = Arrays.binarySearch(array, 7L); //can use after sort

        //compare
        int[] a1 = {1, 2, 3, 4};
        int[] a2 = {1, 2, 3, 4};
        System.out.println(a1 == a2); //False ( just compare Reference not elements)
        System.out.println(a1.equals(a2)); //False as above
        //but
        System.out.println(Arrays.equals(a1, a2)); //True

        //print
        System.out.println(a1); //print unclear value
        System.out.println(a1.toString()); //as above (cause toString has not good Implementation for arrays)
        //but
        System.out.println(Arrays.toString(a1)); //nice and clear


    }
}
