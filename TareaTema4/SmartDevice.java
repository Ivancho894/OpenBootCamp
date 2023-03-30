package TareaTema4;

public class SmartDevice {

    int tamBateria;
    int tamPantalla;
    String sistemaOperativo;

    public SmartDevice(int tamBateria, int tamPantalla, String sistemaOperativo) {
        this.tamBateria = tamBateria;
        this.tamPantalla = tamPantalla;
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getTamBateria() {
        return tamBateria;
    }

    public void setTamBateria(int tamBateria) {
        this.tamBateria = tamBateria;
    }

    public int getTamPantalla() {
        return tamPantalla;
    }

    public void setTamPantalla(int tamPantalla) {
        this.tamPantalla = tamPantalla;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String aString (){
        return "El tamano de la bateira es: "+ this.tamBateria+" el tamano de pantalla es de: "+ this.tamPantalla+ " El sistema operativo es: "+ this.sistemaOperativo;
    }

}
