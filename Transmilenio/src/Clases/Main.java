package Clases;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class Main {
     
      public static void main(String[] args) {
        LocalTime horaActual = LocalTime.now();   
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        String horaFormateada = horaActual.format(formato);  
        HorarioOperacional Horario = new HorarioOperacional ("7:00" , "21:00", "9:00", "18:00");
        
        
        //LLENADO DE ESTACIONES PARA CADA TRONCAL:
        //CARACAS
        String []caracas = {"Calle 76", "Calle 72", "Flores", "Calle 62", "Calle 57", "Marly" ,
        "Calle 45", "Av 39", "Calle 34", "Calle 26", "Calle 22", "Calle 19", "AV Jimenez", "Tercer Milenio"};
        Troncal Caracas = new Troncal ("CARACAS" , caracas);
        Caracas.MostrarEstaciones();
            
        //NORTE
        String []norte = {"Terminal", "Calle 187", "Porta Norte", "Toberin", "Calle 161", "Mazuren" , "Calle 146", "Calle 142",
        "Alcala", "Prado", "Calle 127" , "Virrey", "Calle 85" , "Heroes"};
        Troncal Norte = new Troncal ("NORTE" , norte);
        Norte.MostrarEstaciones();
        
         //SUBA
        String []suba = {"Porta Suba", "La campiña" , "Suba-TV91" , "21 Angeles" , "GrataMira", "Suba Av Boyaca", 
        "Niza - Calle 127", "Humedal Cordoba" , "Av Suba Calle 116", "Puentelargo" , "Suba Calle 100", "Suba Calle 95", "Rio Negro", "San Martin"};
        Troncal Suba = new Troncal ("SUBA" , suba);
        Suba.MostrarEstaciones();
          
        
        //Calle 80
        String []calle80 = {"Polo","Escuela Militar", "Carrera 47", "Carrera 53", "Av 68", "Ferias", 
        "Av Boyaca", "Minuto de Dios", "Granja KR77", "Av Cali", "Carrera 90", "Quirigua", "Portal 80"};
        Troncal Calle80 = new Troncal ("CALLE 80" , calle80);
        Calle80.MostrarEstaciones();
          
        
        //NQS CENTRAL
        String [] NQS= {"La Castellana", "NQS Calle 75", "Av Chile", "Simon Bolivar" , "Movistar Arena" , "Campin - Uan", 
        "U. Nacional", "Av ElDorado", "CAD" , "Paloquemao", "Ricaurte", "Guatoque" ,"Tygua - San Jose"};
        Troncal NQS_Central = new Troncal ("NQS Central" , NQS);
        NQS_Central.MostrarEstaciones();
        
         //AMERICAS
        String [] americas= {"De la sabana", "San Fagcon - KR 22", "Ricaurte", "CSD - Carrera 32", "Zona Industrial", "Carrera 43", "Puente Aranda", "Distrito Grafiti", "Pradera", 
            "Marsella", "Av Americas", "Av Boyaca", "Mandalay", "Banderas", "TV 86", "Biblioteca Tintal", "Patio Bonito", "Portal Americas"};
        Troncal Americas = new Troncal ("AMERICAS" , americas);
        Americas.MostrarEstaciones();
        
        //NQS Sur
        String [] NQS_sur= {"Comuneros", "Santa Isabel", "SENA", "NQS - Calle 30 Sur", 
            "NQS - Calle 38A Sur", "Gral Santander", "Alquieria", "Venecia", "Sevillana", 
            "C.C. Paseo Villa del Rio Madelena", "Perdomo", "Portal Sur", "Bosa", "La Despensa", 
            "Leon XIII", "Terreros - Hospital C.V","San Mateo"} ;
        Troncal NQS_Sur = new Troncal ("NQS_Sur" , NQS_sur);
        NQS_Sur.MostrarEstaciones();
        
        
        //CARACAS Sur
        String [] caracass= {"Hospital", "Hortua", "Nariño", "Fucha", "Restrepo", "Olaya", 
            "Quiroga", "Calle 40 S.", "Santa Lucia", "Socorro","Consuelo", "Molinos", "Portal Usme",
            "Biblioteca", "Parque", "Portal Tunal", "Juan Pablo II", "Manitas", "Mirador del Paraiso"} ;
        Troncal CaracasS = new Troncal ("CARACAS SUR" , caracass);
        CaracasS.MostrarEstaciones();
        
        //EJE AMBIENTAL
        String [] ejeambiental= {"Universidades", "Las Aguas", "Museo del Oro", "Av Jimenez"} ;
        Troncal EjeAmbiental = new Troncal ("EJE AMBIENTAL" , ejeambiental);
        EjeAmbiental.MostrarEstaciones();
        
        
        //CALLE 26
        String [] calle26= {"Universidades", "Centro Memoria", "Concejo de Bogota", 
            "Ciudad Universitaria", "Recinto Ferial", "Quinta Paredes", "Gobernacion", 
            "CAN", "Salitre - El Greco", "El Tiempo - Maloka", "Av Rojas", "Normandia", 
            "Modella", "Portal Eldorado"} ;
        Troncal Calle_26 = new Troncal ("CALLE 26" , calle26);
        Calle_26.MostrarEstaciones();
        
        
        //KR 10
        String [] kr10 = {"San Diego", "Las Nieves", "San Victorino - Neos Centro", 
            "Bicentenario", "San Bernardo", "Policarpa", "Ciudad Jardin - UAN", "Av 1 de Mayo", 
            "Country Sur", "Portal 20 de Julio"} ;
        Troncal Kr_10 = new Troncal ("KR 10" , kr10);
        Kr_10.MostrarEstaciones();
        
        //KR 7
        String [] kr7 = {"Museo Nacional"};
        Troncal Kr_7 = new Troncal ("KR 7" , kr7);
        Kr_7.MostrarEstaciones();
        
      
          
    }
    
}
