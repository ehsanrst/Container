package com.compare;

import java.util.Date;

public class Compare {
    public static void main(String[] args) {
        //Comparable  (.compareTo())====================
        Date d1 = new Date(2018, 10, 21);
        Date d2 = new Date(2017, 7, 26);
        Date d3 = new Date(2017, 7, 26);
        System.out.println(d1.compareTo(d2));
        System.out.println(d2.compareTo(d1));
        System.out.println(d2.compareTo(d3));

        //Comparator ===================================
        StudentComparator comparator = new StudentComparator();
        Student s1 = new Student(21, 18.5);
        Student s2 = new Student(22, 14.5);
        System.out.println(s1.compareTo(s2)); //higher grade
        System.out.println(comparator.compare(s1, s2)); //lower age

    }

}
