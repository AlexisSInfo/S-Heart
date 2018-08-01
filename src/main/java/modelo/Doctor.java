package modelo;

public class Doctor extends Persona{
    private Especialidades especialidad;
    private Horario horario;

    public Doctor(String[] nombres, String[] apellidos, String rut, Especialidades especialidad, Horario horario) {
        super(nombres, apellidos, rut);
        this.especialidad = especialidad;
        this.horario = horario;
    }
}
