package modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Calendario {

    public Calendario(){

    }

    public static String obtenerFecha(){
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Fecha: "+dateFormat.format(date));
        return ""+dateFormat.format(date);
    }
}
