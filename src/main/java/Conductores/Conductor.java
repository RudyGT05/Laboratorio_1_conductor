package Conductores;

public class Conductor {

    public String nombre;
    public String licencia;

    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    public String obtenernombre(){
        return nombre;

    }
    public String obtenerlicencia(){
        return licencia;
    }

    public String obtenerinfo() {
        return ("Nombre Conductor: " + nombre+ ", Licencia: " + licencia);
    }

    public void mostrarinformacion () {
        System.out.println(obtenerinfo());
    }


}
