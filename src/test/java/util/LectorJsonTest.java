package util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LectorJsonTest {
    private LectorJson lector;

    @Before
    public void setUp() throws Exception {
        lector = new LectorJson();
    }

    @After
    public void tearDown(){
        ArrayList<String> vacio = new ArrayList<>();
        lector.almacenarEspecialidades(vacio);
    }

    @Test
    public void agregarTest(){
        String[] esperado = {"a","b","c"};
        String a = "a", b="b", c="c";
        lector.agregar(a);
        lector.agregar(b);
        lector.agregar(c);
        assertEquals(esperado[0], a);
        assertEquals(esperado[1], b);
        assertEquals(esperado[2], c);
    }

}