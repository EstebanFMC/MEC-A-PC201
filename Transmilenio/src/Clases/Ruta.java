package Clases;
import java.util.ArrayList;


public class Ruta {
 private String Codigo;
 private ArrayList<Estacion> CantEstaciones; 
 private ArrayList<Bus> BusesPasantes; 
 private HorarioOperacional Horario; 

    public Ruta(String Codigo, ArrayList<Estacion> CantEstaciones, ArrayList<Bus> BusesPasantes, HorarioOperacional Horario) {
        this.Codigo = Codigo;
        this.CantEstaciones = CantEstaciones;
        this.BusesPasantes = BusesPasantes;
        this.Horario = Horario;
    }
 
 public void MostrarBuses(){
     System.out.println("Los buses que pasan por la ruta " + Codigo + " son: ");
     for (Bus i : BusesPasantes)
       System.out.println(i);  
 }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public ArrayList<Estacion> getCantEstaciones() {
        return CantEstaciones;
    }

    public void setCantEstaciones(ArrayList<Estacion> CantEstaciones) {
        this.CantEstaciones = CantEstaciones;
    }

    public ArrayList<Bus> getBusesPasantes() {
        return BusesPasantes;
    }

    public void setBusesPasantes(ArrayList<Bus> BusesPasantes) {
        this.BusesPasantes = BusesPasantes;
    }

    public HorarioOperacional getHorario() {
        return Horario;
    }

    public void setHorario(HorarioOperacional Horario) {
        this.Horario = Horario;
    }
 
 
 
 
 
 
 
    
}
