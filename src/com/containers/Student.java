package com.containers;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    //we must define a proper "equals() method" to use class as type in 'containers'
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Student) {
            Student student = (Student) obj;
            if (!this.name.equals(student.name))
                return false;
            return true;
        }
        return false;
    }

    //we mst define a proper "hashCode() method" to use class as type in 'hash base containers'
    //CAUTION: here we need "equals() method" too
    @Override
    public int hashCode() {
        return 31 + ((name == null) ? 0 : name.hashCode());
        // return Objects.hash(name);
    }

}
