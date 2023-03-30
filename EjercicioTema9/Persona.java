package EjercicioTema9;


class main{
    public static void main(String[] args) {
        Cliente miCliente = new Cliente();
        miCliente.setCredito(3500);
        miCliente.setEdad(45);
        miCliente.setNombre("Juan");
        miCliente.setTelefono(23423);
        System.out.println("El cliente: "+ miCliente.getNombre()+" de anos: "+miCliente.getEdad()+ ", telefono: "+miCliente.getTelefono()+" posee credito de $"+miCliente.getCredito());
        Trabajador miCliente2 = new Trabajador(4500);
        miCliente2.setEdad(45);
        miCliente2.setNombre("Pirulo");
        miCliente2.setTelefono(23423);
        System.out.println("El cliente: "+ miCliente.getNombre()+" de anos: "+miCliente.getEdad()+ ", telefono: "+miCliente.getTelefono()+" posee credito de $"+miCliente.getCredito()+" Y gana: $"+miCliente2.getSalario());

    }
}


class Persona {
    int edad;
    String nombre;
    int telefono;

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(){

    }

    public static void main(String[] args) {

    }
}
class Cliente extends Persona {
    int credito;

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public Cliente(){}
}
class Trabajador extends Persona {
    int salario;

    public Trabajador(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}