package com.compare;

import java.util.Comparator;

//this class try Compare Students by ages (Student is grade Comparable)
//then make it Comparator base to reach a different behavior of compare in Student class (age base compare)
public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.age < o2.age ? -1 : (o1.age == o2.age ? 0 : 1));
    }
}
