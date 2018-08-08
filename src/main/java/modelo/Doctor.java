package modelo;

public class Doctor extends Persona{
    private Especialidades especialidad;
    private Horario horario;

    public Doctor(String nombres, String apellidos, String rut, Especialidades especialidad, Horario horario) {
        super(nombres, apellidos, rut);
        this.especialidad = especialidad;
        this.horario = horario;
    }

    public Especialidades getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidades especialidad) {
        this.especialidad = especialidad;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
