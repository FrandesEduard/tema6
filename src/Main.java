import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //ex1();
        //ex2();
        //ex3();
        //ex4();
        //ex5();
        ex6();
    }

    public static void ex1() {
        int suma = 0;
        int numere[] = new int[]{1, 2, 5, 7, 8, 9, 12, 14, 13, 35, 65};
        for (int i = 0; i < numere.length; i++) {
            suma = suma + numere[i];
        }
        System.out.println(suma);
    }

    public static void ex2() {
        int numere[] = new int[]{1, 2, 5, 7, 8, 9, 12, 14, 13, 35, 65};
        int numereImpare = 0;
        for (int i = 0; i < numere.length; i++) {
            if (numere[i] % 2 != 0) {
                numereImpare++;
            }
        }
        System.out.println(numereImpare);
    }

    public static void ex3() {
        int numere[] = new int[]{1, 2, 5, 7, 8, 9, 12, 14, 13, 35, 65};
        int nr = 10;
        for (int numarCurent : numere) {
            if (numarCurent > nr) {
                System.out.print(numarCurent + ",");
            }
        }
    }

    public static void ex4() {
        int target = 100;
        int curent = 0;
        Random random = new Random();
        while (curent < target) {
            int donatie = random.nextInt(100) + 1;
            curent += donatie;
            System.out.println("s-au donat " + donatie + " de lei");
        }
        if (curent >= target) {
            System.out.println("target atins");
        }

    }

    public static void ex5() {
        int target = 100;
        int curent = 0;
        Random random = new Random();
        int maxDon = 20;
        int countDon = 0;
        while (curent < target) {
            int donatie = random.nextInt(100) + 1;
            curent += donatie;
            countDon++;
            System.out.println("s-au donat " + donatie + " de lei");
        }
        if (curent >= target) {
            System.out.println("target atins");
        }
        if (countDon >= maxDon) {
            System.out.println("s-a atins numarul maxim de donatii");
            return;
        }
    }

    public static void ex6() {
        String fraza = "Ana are mere. Are pere. Are banane. Are pixuri.";
        String[] propozitii = fraza.split("\\.");
        for (String propozitie : propozitii) {
            String despartit = propozitie.trim();
            if (!despartit.isEmpty()) {
                System.out.println(despartit);
            }
        }

    }
}
