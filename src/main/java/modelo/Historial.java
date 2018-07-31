package modelo;

public class Historial {
    private String motivoVisita;
    private String diagnostico;
    private String fecha;

    public Historial(String motivoVisita, String diagnostico, String fecha) {
        this.motivoVisita = motivoVisita;
        this.diagnostico = diagnostico;
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}
