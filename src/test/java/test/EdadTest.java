package test;

import ejercicios.Edad;
import ejercicios.SetDeTenis;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author danielsanchez
 */
public class EdadTest {
    @Test
    public void test2000Enero1() {
        String valorEsperado = "Usted tiene 24 años";
        String valorActual = Edad.evaluar(1, 1, 2000);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test1950Noviembre29() {
        String valorEsperado = "Usted tiene 73 años";
        String valorActual = Edad.evaluar(29, 11, 1950);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void test2019Junio20() {
        String valorEsperado = "Usted tiene 4 años";
        String valorActual = Edad.evaluar(20, 6, 2019);
        assertEquals(valorEsperado, valorActual);
    }
    
    // TODO: Agrega tus otros casos de prueba aquí
}
