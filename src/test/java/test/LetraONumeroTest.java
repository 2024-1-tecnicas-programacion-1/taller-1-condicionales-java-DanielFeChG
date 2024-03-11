package test;

import ejercicios.LetraONumero;
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
public class LetraONumeroTest {
    @Test
    public void testEsNumero() {
        String valorEsperado = "Es número";
        String valorActual = LetraONumero.evaluar('2');
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testEsLetraMinuscula() {
        String valorEsperado = "Es letra minúscula";
        String valorActual = LetraONumero.evaluar('y');
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testEsLetraMayuscula() {
        String valorEsperado = "Es letra mayúscula";
        String valorActual = LetraONumero.evaluar('R');
        assertEquals(valorEsperado, valorActual);
    }
    @Test
    public void testEsNinguno() {
        String valorEsperado = "No es letra ni número";
        String valorActual = LetraONumero.evaluar('+');
        assertEquals(valorEsperado, valorActual);
    }
    // TODO: Agrega tus otros casos de prueba aquí
    
}
