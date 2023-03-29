package IntroAPro.SegundaParte;

import IntroAPro.SegundaParte.Coche;

public class Main {
    public static void main(String[] args) {

        Coche miCoche = new Coche();
        miCoche.incrPuertas(1);

        System.out.println(miCoche.puertas);

    }
}
