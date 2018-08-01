package modelo;

import java.util.ArrayList;
import util.LectorJson;

public class Especialidades {
    private ArrayList<String> especialidades;

    public Especialidades(){
        this.especialidades =LectorJson.recuperarEspecialidades();
    }
}
