package com.containers;

import java.util.*;

public class Container {
    //Containers can't accept primitive types (All Generics)
    //exp: ArrayList can't accept int, just Contain Objects, Like Integer
    ArrayList<Integer> array = new ArrayList<Integer>();

    public static void main(String[] args) {
        //ArrayList or LinkedList (just different in performance)
        ArrayList<String> list = new ArrayList<>();
        list.add("ABC");
        list.add("EMC");
        list.add("RPG");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(new Integer(200));
        numbers.add(35);
        numbers.add(47);
        System.out.println(numbers.get(0));
        System.out.println(numbers.size());
        System.out.println(numbers.contains(new Integer(35)));
        System.out.println(numbers.contains(35));

        //Set and HashSet======================
        Set<String> set = new HashSet<>();
        set.add("Ali");
        set.add("Ehsan");
        set.add("Mohammad");
        set.add("Ebrahim");
        set.add("Ali");
        System.out.println(set.size());

        //**toArray() Method------------------
        Object[] array = list.toArray();
        for (Object obj : array) {
            String str = (String) obj;
            System.out.println(str);
        }

        //**toArray(T[] arr) Method
        Integer[] array2 = numbers.toArray(new Integer[numbers.size()]);
        for (Integer i : array2) {
            System.out.println(i);
        }
        //***parameter size is not matter it will be resize
        Integer[] array3 = numbers.toArray(new Integer[0]);
        for (Integer i : array3) {
            System.out.println(i);
        }

        //*equals() method========================
        //when we don't define proper equals method in class
        List<People> peopleList = new ArrayList<People>();
        peopleList.add(new People("Ali"));
        System.out.println(peopleList.contains(new People("Ali"))); //False (contains() use equals() inside)
        System.out.println(peopleList.equals(new People("Ali"))); //False

        //but when defined
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Ali"));
        System.out.println(studentList.contains(new Student("Ali"))); //True

        //*hashCode() method======================
        //when we don't define proper hashCode & equals methods in class
        Set<People> peopleSet = new HashSet<>();
        peopleSet.add(new People("Ehsan"));
        System.out.println(peopleSet.contains(new People("Ehsan"))); //False

        //but when defined both
        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Ehsan"));
        System.out.println(studentSet.contains(new Student("Ehsan"))); //True

        //Map & HashMap===========================
        Map<Integer, String> map = new HashMap<>();
        //use put Instead of add
        map.put(8795515, "Ehsan Rst"); //<key,value>
        map.put(8786311, "Hosein Molai");
        map.put(8785162, "Ali Alavi");
        String name = map.get(8795515);
        System.out.println(name);

        //Iterator   (.iterator())================
        List<String> strList = new ArrayList<>();
        strList.add("ERRT");
        strList.add("POLS");
        strList.add("XXXX");
        //*iterator()
        Iterator<String> iterate = strList.iterator();
        while (iterate.hasNext()) {
            String temp = iterate.next();
            if (temp.equals("XXXX")) {
                iterate.remove(); //this invalid all iterators except himself (using iterate.remove)
            }
            System.out.println(temp);
        }
        //or
        //*foreach
        for (String st : strList) {
            System.out.println(st);
        }

        //Concurrent Modification Exception
        for (String st : strList) {
            System.out.println(st);
            if (st.equals("POLS")) {
                strList.remove(st); //this invalid all iterators (using strList.remove)
            }
        }
        /*this will throw an exception cause iterator
        becomes invalid by change the container*/

    }
}
