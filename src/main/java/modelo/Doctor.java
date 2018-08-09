package modelo;

public class Doctor extends Persona{
    private String especialidad;
    private Horario horario;

    public Doctor(String nombres, String apellidos, String rut, String especialidad, Horario horario) {
        super(nombres, apellidos, rut);
        this.especialidad = especialidad;
        this.horario = horario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
