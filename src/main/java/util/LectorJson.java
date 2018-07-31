package util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import modelo.Especialidades;

import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class LectorJson {

    private final static String RUTA = "data/";
    private final static String NOMBRE = "especialidades.json";

    /**
     * Permite el almacenamiento de un conjunto de clientes
     * @param especialidades
     */
    public static void almacenarEspecialidades(ArrayList<String> especialidades) {


        Type listType = new TypeToken<List<String>>() {}.getType();

        Gson gson = new Gson();
        String json = gson.toJson(especialidades, listType);
        //System.out.println(json);

        try (FileWriter file = new FileWriter(RUTA+NOMBRE)) {
            file.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * Obtiene las personas almacenadas en el archivo de texto json
     * @return
     */
    public static ArrayList<String> recuperarEspecialidades() {

        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTA+NOMBRE));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> especialidades = gson.fromJson(br, new TypeToken<List<String>>(){}.getType());

        return especialidades;
    }

    public static boolean agregar(String cl){
        boolean agregado = false;
        ArrayList<String> especialidades = recuperarEspecialidades(), nuevaLista = new ArrayList<>();
        for (String especialidad : especialidades) {
            nuevaLista.add(especialidad);
        }
        if (cl != null) {
            nuevaLista.add(cl);
            almacenarEspecialidades(nuevaLista);
            agregado = true;
        }
        return agregado;
    }

}
