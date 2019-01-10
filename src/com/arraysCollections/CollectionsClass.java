package com.arraysCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //Collections==========================
        Collections.addAll(list, "A", "Book", "Car", "A");

        int freq = Collections.frequency(list, "A"); //2 times

        //*sort
        Collections.sort(list); //sort with compareTo method
        print(list);
        //we can change sort with Comparator (exp: with length)
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.length() < o2.length() ? -1 :
                        (o1.length() == o2.length() ? 0 : 1));
            }
        };
        Collections.sort(list, comparator);
        print(list);

        Collections.reverse(list);
        print(list);

        //min & max (with compare types)
        String min = Collections.min(list); //work with compareTo (Comparable)
        String max = Collections.max(list);
        System.out.println(min + " " + max); //A & Car
        //but
        String min2 = Collections.min(list, comparator); //work with compare (Comparator)
        String max2 = Collections.max(list, comparator);
        System.out.println(min2 + " " + max2); //A & Book

        Collections.shuffle(list);
        print(list);
        Collections.shuffle(list);
        print(list);

        Collections.fill(list, "XXX");
        print(list);

    }

    public static void print(List<String> list) {
        for (String st : list) {
            System.out.print(st + "\t");
        }
        System.out.println();
    }
}
