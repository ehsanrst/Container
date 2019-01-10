package com.compare;

//made Student class Comparable on grade And this class by itself compare just by grades
public class Student implements Comparable<Student> {
    public int age;
    public double grade;

    public Student(int age, double grade) {
        this.age = age;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        return (this.grade < o.grade ? -1 : (this.grade == o.grade ? 0 : 1));
    }
}
