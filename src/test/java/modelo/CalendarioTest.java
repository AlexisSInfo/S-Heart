package modelo;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class CalendarioTest {
    private Calendario cal;
    @Test
    public void fecha(){//prueba realizada el 01/08/2018
        String fecha01082018 = "01/08/2018";
        String fechaobtenida = cal.obtenerFecha();
        assertEquals(fecha01082018, fechaobtenida);
    }
}