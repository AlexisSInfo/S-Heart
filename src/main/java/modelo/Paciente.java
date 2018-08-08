package modelo;

import java.util.ArrayList;

public class Paciente extends Persona{
    private String contacto;
    private ArrayList<Visita> historial;

    public Paciente(String nombres, String apellidos, String rut, String contacto) {
        super(nombres, apellidos, rut);
        this.contacto = contacto;
        this.historial = new ArrayList<>();
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    public void anadirHistoria(Visita nuevaVisita){
        this.historial.add(nuevaVisita);
    }
    
    public ArrayList<Visita> getHistorial(){
        return this.historial;
    }

    @Override
    public String toString() {
        return super.toString() + "contacto=" + contacto + ", historial=" + historial;
    }
    
    
}
