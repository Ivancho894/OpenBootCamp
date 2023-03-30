package TareaTema2;

public class PrecioMasIva {

    public static void main(String[] args) {


        int preci = 300;

        System.out.println(ivi(preci));

    }
    public static int ivi(int prec) {
        return prec+(21*prec/100);
    }

}
