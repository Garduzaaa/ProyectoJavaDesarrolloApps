import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;

/**
 *
 * @author jonce
 */
public class AppTest {
    
    public AppTest() {
    }

    @Test
    public void testRangoNumeros() {
        App app = new App();

        // Caso de prueba 1: numUno menor que numDos
        ArrayList<Integer> resultado1 = app.rangoNumeros(2, 10);
        ArrayList<Integer> esperado1 = new ArrayList<>(Arrays.asList(3, 5, 7, 9));
        assertEquals(esperado1, resultado1);

        // Caso de prueba 2: numDos menor que numUno
        ArrayList<Integer> resultado2 = app.rangoNumeros(10, 2);
        ArrayList<Integer> esperado2 = new ArrayList<>(Arrays.asList(9, 7, 5, 3));
        assertEquals(esperado2, resultado2);

        // Caso de prueba 3: numeros de entrada iguales
        assertThrows(ArithmeticException.class, () -> {
            app.rangoNumeros(5, 5);
        });
    }
    
}
