package Clases;
import java.util.ArrayList;
import java.util.Arrays;

public class Troncal {
   String nombre;
   ArrayList<String> Estaciones;
   
   
   
    public Troncal(String nombre, String [] estaciones) {
        Estaciones = new ArrayList();
        this.nombre = nombre;
        this.Estaciones.addAll(Arrays.asList(estaciones));
    }  
    public void MostrarEstaciones(){
        System.out.println("\nLas rutas de la troncal " + nombre + " son: ");
        for(String i : Estaciones){
            System.out.println(i);    
        }
    }
    
    
    //SETTER GETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getEstaciones() {
        return Estaciones;
    }

    public void setEstaciones(ArrayList<String> Estaciones) {
       
       
    }
    
   
   
   
   
   
}


