package test;

import ejercicios.Division;
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
public class DivisionTest {
    @Test
    public void testDivisionNoExacta() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 2\n"
                + "Residuo: 4";
        String valorActual = Division.evaluar(14, 5);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testDivisionExacta() {
        String valorEsperado = "La división es exacta. \n"
                + "Cociente: 10\n"
                + "Residuo: 0";
        String valorActual = Division.evaluar(100, 10);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testPruebaBordeMax() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 0\n"
                + "Residuo: 1000000";
        String valorActual = Division.evaluar(1000000, 5000000);
        assertEquals(valorEsperado, valorActual);
    }
    
    @Test
    public void testPruebaBordeMin() {
        String valorEsperado = "La división no es exacta. \n"
                + "Cociente: 0\n"
                + "Residuo: 1";
        String valorActual = Division.evaluar(1, 2);
        assertEquals(valorEsperado, valorActual);
    }
    // TODO: Agrega tus otros casos de prueba aquí
}
