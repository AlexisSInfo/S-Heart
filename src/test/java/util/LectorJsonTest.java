package util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import modelo.Paciente;
import modelo.Visita;

import static org.junit.Assert.*;
import org.junit.Ignore;

public class LectorJsonTest {
    private LectorJson lector;
    private ArrayList<String> listaEsp;
    private ArrayList<Paciente> listaPac;

    @Before
    public void setUp() throws Exception {
        lector = new LectorJson();
        listaEsp = lector.recuperarEspecialidades();
        listaPac = lector.recuperarPacientes();
        ArrayList<String> vacio = new ArrayList<>();
        lector.almacenarEspecialidades(vacio);
        ArrayList<Paciente> vacio1 = new ArrayList<>();
        lector.almacenarPacientes(vacio1);
    }

    @After
    public void tearDown(){
        lector.almacenarEspecialidades(listaEsp);
        lector.almacenarPacientes(listaPac);
    }

    @Test
    public void agregarEspecialidadTest(){
        String[] esperado = {"a","b","c"};
        String a = "a", b="b", c="c";
        lector.agregarEspecialidad(a);
        lector.agregarEspecialidad(b);
        lector.agregarEspecialidad(c);
        assertEquals(esperado[0], a);
        assertEquals(esperado[1], b);
        assertEquals(esperado[2], c);
    }
    
    @Test
    public void agregarPacienteTest(){
        Paciente nuevoPaciente = new Paciente("Juan","Perez" , "11111111-1", "");
        Visita nuevaVisita = new Visita("consulta de rutina", "saludable", "hoy");
        nuevoPaciente.anadirHistoria(nuevaVisita);
        boolean obtenido = lector.agregarPaciente(nuevoPaciente);
        assertEquals(true, obtenido);
        
    }
    
    @Test
    public void EliminiarPacienteTest(){
        Paciente nuevoPaciente = new Paciente("Juan","Perez" , "11111111-1", "");
        Visita nuevaVisita = new Visita("consulta de rutina", "saludable", "hoy");
        nuevoPaciente.anadirHistoria(nuevaVisita);
        lector.agregarPaciente(nuevoPaciente);
        boolean obtenido = lector.eliminarPaciente("11111111-1");
        assertEquals(true, obtenido);
    }

}