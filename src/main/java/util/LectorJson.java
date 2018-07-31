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
     * @param clientes
     */
    public static void almacenarClientes(ArrayList<String> clientes) {


        Type listType = new TypeToken<List<String>>() {}.getType();

        Gson gson = new Gson();
        String json = gson.toJson(clientes, listType);
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
    public static ArrayList<String> recuperarClientes() {

        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTA+NOMBRE));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> clientes = gson.fromJson(br, new TypeToken<List<String>>(){}.getType());

        return clientes;
    }

    public static boolean agregar(String cl){
        boolean agregado = false;
        ArrayList<String> especialidades = recuperarClientes(), nuevaLista = new ArrayList<>();
        for (int i = 0; i < especialidades.size(); i++) {
            nuevaLista.add(especialidades.get(i));
        }
        if (cl != null) {
            nuevaLista.add(cl);
            almacenarClientes(nuevaLista);
            agregado = true;
        }
        return agregado;
    }

    /*
    public static String buscar(ArrayList<Especialidades> especialidades){
        ArrayList<> clientes = recuperarClientes();
        Cliente retornoCliente = null;

        for (int i=0; i<clientes.size(); i++){
            if (clientes.get(i).getRut().equals(rut)) {
                retornoCliente = clientes.get(i);
            }
        }

        return retornoCliente;
    }

    public static boolean eliminar (String rut){
        ArrayList<Cliente> clientes = recuperarClientes(),
                nuevaLista = new ArrayList<>();
        boolean eliminado = false;

        for (int i=0; i<clientes.size(); i++){
            if (clientes.get(i).getRut().equals(rut)) {
                for(int j=0; j<clientes.size(); j++){
                    if (j!=i) {
                        nuevaLista.add(clientes.get(j));
                    }
                }
                almacenarClientes(nuevaLista);
                eliminado = true;
            }
        }
        return eliminado;
    }
    */
}
