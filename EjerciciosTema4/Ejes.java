package EjerciciosTema4;

public class Ejes {
    public static void main(String[] args) {
        int variable = 45;
        int numeroWhile = 0;
        int numeroDoWhile = 0;
        var estacionActual = "VERANO";
        System.out.println("Ejercicio if:");
        if (variable >= 0){
            System.out.println(variable + " es positivo");
        }else {
            System.out.println("Es negativo");
        }
        System.out.println("Ejercicio while:");
        while(numeroWhile <= 3 ){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        System.out.println("Ejercicio do:");
        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }while (numeroDoWhile<1);
        System.out.println("Ejercicio for:");
        for (int numeroFor = 0; numeroFor <= 3;numeroFor++ ){
            System.out.println(numeroFor);
        }
        System.out.println("Ejercicio switch:");
        switch (estacionActual){
            case "VERANO":
                System.out.println("Estamos en verano");
                break;
            case "INVIERNO":
                System.out.println("Estamos en invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Estamos en primavera");
                break;
            case "OTONO":
                System.out.println("Estamos en otono");
            default:
                System.out.println("La variable no es una estacion");

        }
    }
}
