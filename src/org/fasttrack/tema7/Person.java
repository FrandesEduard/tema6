package org.fasttrack.tema7;

public class Person {
    public String name;
    public int age;
    public boolean married;

    public Person(String nume, int varsta, boolean casatorit) {
        name = nume;
        age = varsta;
        married = casatorit;
    }

    public String toString() {
        return "Numele meu este " + name + ", am " + age + " de ani.Este casatorit? " + married;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }
}
