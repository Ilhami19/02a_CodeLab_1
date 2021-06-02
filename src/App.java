public class App {
    public static void main(String[] args){
        
        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();

        ausgabe("Konto1: " + Integer.toString(konto1.kontostand));
        ausgabe("Konto2: " + Integer.toString(konto2.kontostand));
        ausgabe("Konto3: " + Integer.toString(konto3.kontostand));

        ausgabe("--------------------------");

        // Update ...
        konto1.kontostand *= 2;
        konto2.kontostand *= 3;
        konto3.kontostand *= 10;

        ausgabe("Konto1: " + Integer.toString(konto1.kontostand));
        ausgabe("Konto2: " + Integer.toString(konto2.kontostand));
        ausgabe("Konto3: " + Integer.toString(konto3.kontostand));

    }

    private static void ausgabe(String outStr) {
        System.out.println(outStr);
    }
}
