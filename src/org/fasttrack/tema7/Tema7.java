package org.fasttrack.tema7;

public class Tema7 {
    public static void main(String[] args) {
        ex2();
        ex4();
    }

    public static void ex2() {
        Person alex = new Person("Alex", 34, true);
        Person laur = new Person("Laur", 23, false);
        Person marian = new Person("Marian", 60, true);
        System.out.println(alex.toString());
        System.out.println(laur.toString());
        System.out.println(marian.toString());

    }
    public static void ex4() {
        Product orez = new Product("Orez",34, 20, "aliment");
        Product paine = new Product("Paine", 5, 34,"aliment");
        Product mirinda = new Product("Mirinda", 7, 0,"suc");
        System.out.println(orez.hasStock());
        System.out.println(paine.isCategory());
        System.out.println(mirinda.hasStock());
    }
}
