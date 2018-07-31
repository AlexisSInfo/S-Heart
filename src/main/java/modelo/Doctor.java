package modelo;

public class Doctor extends Persona{
    private Especialidades especialidad;

    public Doctor(String[] nombres, String[] apellidos, String rut, Especialidades especialidad) {
        super(nombres, apellidos, rut);
        this.especialidad = especialidad;
    }
}
