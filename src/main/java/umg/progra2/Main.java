package umg.progra2;
import Conductores.ConductorDeMotos;
import Conductores.Conductor;
import Conductores.ConductorDeCoches;
import umg.programacion2.Autos.Coche;
import umg.programacion2.Autos.Moto;
import umg.programacion2.Autos.Vehiculo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Vehiculo carro = new Coche("Toyota","Rav4",2015);
        Vehiculo moto = new Moto("Honda","Navi",2020);
        carro.mostrarDetalles();
        moto.mostrarDetalles();
    }
}