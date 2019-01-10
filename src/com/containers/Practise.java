package com.containers; /**
 * write a method to remove names start with Ali in a List
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practise {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Ehsan");
        names.add("Ali");
        names.add("Hassan");
        names.add("Reza");
        names.add("Ali");
        names.add("Mehdi");
        print(names);

        removeAlisWithIterator(names);
        print(names);
    }

    //Correct Way with iterator
    public static void removeAlisWithIterator(List<String> name) {
        Iterator<String> iterator = name.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.startsWith("Ali")) {
                iterator.remove(); //this invalid other iterators not itself
            }
        }
    }

    //Correct Way without iterator
    public static void removeAlisWithFor(List<String> name) {
        for (int i = name.size() - 1; i >= 0; i--) {
            if (name.get(i).startsWith("Ali")) {
                name.remove(i);
            }
        }
    }

    //Wrong Way with foreach iterator (Concurrent Modification Exception)
    public static void removeAlis(List<String> name) {
        for (String st : name) {
            if (st.startsWith("Ali")) {
                name.remove(st); //this invalid iterators
            }
        }
    }


    public static void print(List<String> list) {
        for (String st : list) {
            System.out.print(st + "\t");
        }
        System.out.println();
    }
}
