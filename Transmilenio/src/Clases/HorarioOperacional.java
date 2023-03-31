package Clases;

import java.util.ArrayList;
import java.time.LocalTime;

public class HorarioOperacional {
    
//ATRIBUTOS
    private boolean estado;  //false = Fuera de línea;  true = En operacion;
    private String HoraInicio;
    private String HoraFinalizacion;
    private String HoraInicioFines;
    private String HoraFinalizacionFines;
    private ArrayList<String> DiasOperativos;  //Lunes - Domingo    
    
    //CONSTRUCTOR
    public HorarioOperacional(String HoraInicio, String HoraFinalizacion, String HoraInicioFines, String HoraFinalizacionFines) {
        this.DiasOperativos = new ArrayList<>();
        DiasOperativos.add("Lunes: ");
        DiasOperativos.add("Martes: ");
        DiasOperativos.add("Miercoles: ");
        DiasOperativos.add("Jueves: ");
        DiasOperativos.add("Viernes: ");
        DiasOperativos.add("Sabado: ");
        DiasOperativos.add("Domingo: ");
        
        this.HoraInicio = HoraInicio; //ENTRE SEMANA
        this.HoraFinalizacion = HoraFinalizacion; //ENTRE SEMANA
        this.HoraInicioFines = HoraInicioFines; //FINES DE SEMANA
        this.HoraFinalizacionFines = HoraFinalizacionFines; //FINES DE SEMANA
    }
    
    
    //MÉTODOS    
public void MostrarEstado(){
    if(!estado)
        System.out.println("El sistema se encuentra fuera de línea");
    else
        System.out.println("El sistema se encuenta en servicio");
}

public void MostrarHorarios(){
    System.out.println("El Horario Operacional es el siguiente: ");
    for (String i : DiasOperativos){ //RECORRER LISTA
        if(i == "Sabado: " || i == "Domingo: ")
             System.out.println(i + HoraInicioFines + " - " + HoraFinalizacionFines);
        else
            System.out.println(i + HoraInicio+ " - " + HoraFinalizacion);
    }
}

    

    
    //SETTER - GETTER;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getHoraInicio() {
        return HoraInicio;
    }

    public void setHoraInicio(String HoraInicio) {
        this.HoraInicio = HoraInicio;
    }

    public String getHoraFinalizacion() {
        return HoraFinalizacion;
    }

    public void setHoraFinalizacion(String HoraFinalizacion) {
        this.HoraFinalizacion = HoraFinalizacion;
    }

    public String getHoraInicioFines() {
        return HoraInicioFines;
    }

    public void setHoraInicioFines(String HoraInicioFines) {
        this.HoraInicioFines = HoraInicioFines;
    }

    public String getHoraFinalizacionFines() {
        return HoraFinalizacionFines;
    }

    public void setHoraFinalizacionFines(String HoraFinalizacionFines) {
        this.HoraFinalizacionFines = HoraFinalizacionFines;
    }

    public ArrayList<String> getDiasOperativos() {
        return DiasOperativos;
    }

    public void setDiasOperativos(ArrayList<String> DiasOperativos) {
        this.DiasOperativos = DiasOperativos;
    }
    
}
