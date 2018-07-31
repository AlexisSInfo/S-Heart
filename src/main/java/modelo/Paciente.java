package modelo;

public class Paciente extends Persona{
    private String contacto;
    private Historial[] historial;

    public Paciente(String[] nombres, String[] apellidos, String rut, String contacto) {
        super(nombres, apellidos, rut);
        this.contacto = contacto;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}
