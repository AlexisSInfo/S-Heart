package util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import modelo.Especialidades;
import modelo.Paciente;

import java.io.*;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import modelo.Doctor;

public class LectorJson {

    private final static String RUTA = "data/";
    private final static String NOMBREESP = "especialidades.json";
    private final static String NOMBREPACIENTES = "pacientes.json";
    private final static String NOMBREDOCTORES = "doctores.json";

    /**
     * Permite el almacenamiento de un conjunto de clientes
     * @param especialidades
     */
    public static void almacenarEspecialidades(ArrayList<String> especialidades) {


        Type listType = new TypeToken<List<String>>() {}.getType();

        Gson gson = new Gson();
        String json = gson.toJson(especialidades, listType);
        //System.out.println(json);

        try (FileWriter file = new FileWriter(RUTA+NOMBREESP)) {
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
            br = new BufferedReader(new FileReader(RUTA+NOMBREESP));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> especialidades = gson.fromJson(br, new TypeToken<List<String>>(){}.getType());

        return especialidades;
    }

    public static boolean agregarEspecialidad(String cl){
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
    
    public static void almacenarPacientes(ArrayList<Paciente> pacientes) {


        Type listType = new TypeToken<List<Paciente>>() {}.getType();

        Gson gson = new Gson();
        String json = gson.toJson(pacientes, listType);
        //System.out.println(json);

        try (FileWriter file = new FileWriter(RUTA+NOMBREPACIENTES)) {
            file.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    
    public static ArrayList<Paciente> recuperarPacientes() {

        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTA+NOMBREPACIENTES));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<Paciente> pacientes = gson.fromJson(br, new TypeToken<List<Paciente>>(){}.getType());

        return pacientes;
    }
    
    public static boolean agregarPaciente(Paciente nuevoPaciente){
        boolean agregado = false;
        ArrayList<Paciente> pacientes = recuperarPacientes(), nuevaLista = new ArrayList<>();
        for (Paciente paciente : pacientes) {
            nuevaLista.add(paciente);
        }
        if (pacientes != null) {
            nuevaLista.add(nuevoPaciente);
            almacenarPacientes(nuevaLista);
            agregado = true;
        }
        nuevaLista.forEach(System.out::println);
        return agregado;
    }
    
    public static boolean eliminarPaciente(String rut){
        boolean eliminado = false;
        ArrayList<Paciente> pacientes = recuperarPacientes();
        for (int i = 0; i < pacientes.size(); i++) {
            if (pacientes.get(i).getRut().equals(rut)) {
                pacientes.remove(i);
                almacenarPacientes(pacientes);
                eliminado = true;
            }
        }
        return eliminado;
    }
    
    public static void almacenarDoctores(ArrayList<Doctor> Doctor) {


        Type listType = new TypeToken<List<Doctor>>() {}.getType();

        Gson gson = new Gson();
        String json = gson.toJson(Doctor, listType);
        //System.out.println(json);

        try (FileWriter file = new FileWriter(RUTA+NOMBREDOCTORES)) {
            file.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    
    public static ArrayList<Doctor> recuperarDoctores() {

        Gson gson = new Gson();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(RUTA+NOMBREDOCTORES));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<Doctor> doctores = gson.fromJson(br, new TypeToken<List<Doctor>>(){}.getType());

        return doctores;
    }
    
    public static boolean agregarDoctor(Doctor nuevoDoctor){
        boolean agregado = false;
        ArrayList<Doctor> doctores = recuperarDoctores(), nuevaLista = new ArrayList<>();
        for (Doctor doctor : doctores) {
            nuevaLista.add(doctor);
        }
        if (doctores != null) {
            nuevaLista.add(nuevoDoctor);
            almacenarDoctores(nuevaLista);
            agregado = true;
        }
        nuevaLista.forEach(System.out::println);
        return agregado;
    }
    
    public static boolean eliminarDoctor(String rut){
        boolean eliminado = false;
        ArrayList<Doctor> doctores = recuperarDoctores();
        for (int i = 0; i < doctores.size(); i++) {
            if (doctores.get(i).getRut().equals(rut)) {
                doctores.remove(i);
                almacenarDoctores(doctores);
                eliminado = true;
            }
        }
        return eliminado;
    }
}
