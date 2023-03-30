package TareaTema4;

public class SmartWatch extends SmartDevice {

    String modelo;
    int hora;

    public void SmartWatch() {
    }

    ;

    public SmartWatch(int tamBateria, int tamPantalla, String sistemaOperativo, int hora, String modelo) {
        super(tamBateria, tamPantalla, sistemaOperativo);
        this.hora = hora;
        this.modelo = modelo;
    }

    public String aString() {

        return "El modelo de este smatr watch es: " + this.modelo + " La hora es: " + this.hora + super.aString();

    }
}