package TareaTema4;

public class SmartPhone extends SmartDevice {

    String modelo;
    int telefono;

    public void SmartPhone(){
    };

    public SmartPhone(int tamBateria, int tamPantalla, String sistemaOperativo, int telefono,String modelo) {
        super(tamBateria, tamPantalla, sistemaOperativo);
        this.telefono = telefono;
        this.modelo = modelo;
    }
    public String aString(){
        return "El modelo de este smatr phone es: "+this.modelo+" El telefono es: "+this.telefono+super.aString();

    }
}

