package package1;

import package2.Broj3;

public class Broj2 {
    public int j = 5;
    public static void main (String[] args) {
        Broj2 t = new Broj2();
    }

    public Broj2() {
        super();
        Broj3 b = new Broj3();
    }

    public static int a = 0;

    public void getNumber() {
        System.out.println("BROJ");
    }

    static class BrojStatic {
        public static void staticMethod() {
            System.out.println("AAdsaAAAdsadaAAAA");
        }
    }

}