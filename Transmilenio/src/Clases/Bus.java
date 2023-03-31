package Clases;
import java.util.ArrayList;


public class Bus {
    private int NoParadas;
    private ArrayList<String> Rutas = new ArrayList<>();
    private String Identificador;
    private ArrayList <String> EstacionesPasantes;
    
    String Separador = "------------------------------------------------------------------------";
    
    //CONSTRUCTOR
    public Bus ( String Identificador, ArrayList Rutas){
    EstacionesPasantes = new ArrayList<>();
    this.Rutas.addAll(Rutas);
    this.Identificador = Identificador;
    NoParadas = EstacionesPasantes.size();
    }
    
    //MÉTODOS
    public void MostrarEstaciones(){  //SE UTILIZA PARA OBSERVAR EL TRAYECTO COMPLETO DEL BUS
        System.out.println(Separador + "\nLas estaciones pasantes del bus " + Identificador + " son:");
        for(String i : EstacionesPasantes)
            System.out.println(i);
        System.out.println(Separador);
    }
    
    public void ComprobarEstacion(String Estacion){ //SE UTILIZA PARA BUSCAR SI EL BUS PASA POR UNA ESTACION EN ESPECÍFICO
        if(EstacionesPasantes.contains(Estacion))
            System.out.println(Separador + "\nEste bus sí pasa por la estación " + Estacion + "\n" + Separador);
        else
            System.out.println(Separador + "\nEste bus no pasa por la estación " + Estacion + "\n" + Separador);
    }
    
    public void MostrarNoParadas(){
        System.out.println("El numero de paradas del bus " + Identificador + " es de: " + NoParadas);
    }
    
    
    
    //GETTER - SETTER  NO INCLUIR EN UML

    public int getNoParadas() {
        return NoParadas;
    }

    public void setNoParadas(int NoParadas) {
        this.NoParadas = NoParadas;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }

    public ArrayList<String> getEstacionesPasantes() {
        return EstacionesPasantes;
    }

    public void setEstacionesPasantes(ArrayList<String> EstacionesPasantes) {
        this.EstacionesPasantes = EstacionesPasantes;
    }

    public String getSeparador() {
        return Separador;
    }

    public void setSeparador(String Separador) {
        this.Separador = Separador;
    }

      
    
    
}
