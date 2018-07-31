package modelo;

public class Persona {
    private String[] nombres;
    private String[] apellidos;
    private String rut;

    public Persona(String[] nombres, String[] apellidos, String rut) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rut = rut;
    }

    public Persona(){

    }

    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public String[] getApellidos() {
        return apellidos;
    }

    public void setApellidos(String[] apellidos) {
        this.apellidos = apellidos;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
}
