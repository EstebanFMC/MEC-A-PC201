package Clases;

public class Taquilla {
private double Precio;
private int NoTaquilla;
static int numeroTaquillas = 0;

public Taquilla (double Precio){
    this.Precio = Precio;
    numeroTaquillas++;
    NoTaquilla = numeroTaquillas;
}

public void MostrarPrecio(){
    System.out.println("El precio a pagar el día de hoy es de: " + Precio);
    
}
}
