package EjercicioTema8;

public class Main {
    public static void main(String[] args) {

            Persona yo = new Persona();
            yo.setEdad(209);
            yo.setNombre("Ivan");
            yo.setTelefono(21348888);
            System.out.println(yo.getEdad());
        System.out.println(yo.getTelefono());
        System.out.println(yo.getNombre());
    }
}
