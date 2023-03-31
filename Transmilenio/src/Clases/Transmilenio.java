
package Clases;
import java.util.ArrayList;

public class Transmilenio {
   private ArrayList <Ruta> Rutas = new ArrayList<>();
   private HorarioOperacional Horario;


public Transmilenio(ArrayList Rutas){
    Horario = new HorarioOperacional("00:00" , "00:00", "00:00", "00:00");
    this.Rutas.addAll(Rutas);
    }


    public void MostrarRutas(){
        System.out.println("Las rutas que contiene el servicio de transmilenio son: ");
        for(Ruta i : Rutas){
            //System.out.println(i..);
        }
    }
    



}
