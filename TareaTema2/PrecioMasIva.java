package TareaTema2;
import java.util.Scanner;
public class PrecioMasIva {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Introduce el numero para calcular iva: ");
        int preci = scanner.nextInt();
        System.out.println("Cual es el IVA actual en tu pais: ");
        int iva = scanner.nextInt();

        System.out.println(ivi(preci,iva));

    }
    public static int ivi(int prec,int iva) {
        return prec+(iva*prec/100);
    }
}
