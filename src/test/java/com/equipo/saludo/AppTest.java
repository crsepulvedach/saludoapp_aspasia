package com.equipo.saludo;

import org.junit.jupiter.api.Test;
//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;


/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        //assertTrue(true);
        assertEquals("¡Hola, DevOps!", App.saludar("DevOps"));
    }
}
