package Clases;
import java.util.ArrayList;

public class Estacion {    
    private String nombre;
    private String [] Vagones; 
    private ArrayList<Taquilla> taquilla;
    
    String Separador = "------------------------------------------------------------------------";//NO INCLUIR EN EL UML

    public Estacion ( String [] vagones, ArrayList taquillas){
         taquilla = new ArrayList<>();
         this.taquilla.addAll(taquillas);
         Vagones = new String [vagones.length];
         
         for(int i = 0; i < vagones.length; i++)
         {
             Vagones [i] = vagones[i];
         }
        
    }
    
    public void MostrarVagones(){
        System.out.println(Separador);
        System.out.println("Los vagones de la estacion " + nombre + "son:");
        for (String i : Vagones)
            System.out.println(i);    
        
        System.out.println(Separador);
    }
    
    
    
}
