package package2;

public class Broj3 {
    protected static  int j = 5;
    public static void main (String[] args) {
        Broj3 t = new Broj3();
    }

    public Broj3() {
        super();
    }

    public static int a = 0;

    public void getNumber() {
        System.out.println("BROJ");
    }

    static class BrojStatic {
        public static void staticMethod() {
            System.out.println("AAAAAAAAA");
        }
    }

}