package Conductores;

public class ConductorDeMotos extends Conductor {
    boolean tienelicenciamoto;

    public ConductorDeMotos(String nombre, String licencia, boolean tienelicenciamoto) {
    super(nombre, licencia);
    this.tienelicenciamoto = tienelicenciamoto;
    }
    public boolean tienelicenciamoto() {
        return tienelicenciamoto;
    }
    @Override
    public String obtenerinfo(){
        return ("Nombre Conductor "+nombre+" Licencia: "+licencia+" Tiene licencia de moto: "+tienelicenciamoto);
    }
    public void mostrarinformacion(){
        System.out.println(obtenerinfo());
    }
}
