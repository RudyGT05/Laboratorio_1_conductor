package Conductores;

public class ConductorDeCoches extends Conductor {
    int experiencia;

    public ConductorDeCoches(String nombre, String licencia, int experiencia) {
        super(nombre, licencia);
        this.experiencia = experiencia;
    }
    public int obtenerexp(){
        return experiencia;
    }

    @Override
    public String obtenerinfo()
    {
        return ("Nombre Conductor "+nombre+" Licencia: "+licencia+" Experiencia: "+experiencia);
    }
    public void mostrarinformacion(){
        System.out.println(obtenerinfo());
    }
}
