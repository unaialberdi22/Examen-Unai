package Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import Core.*;

public class CalculadoraTest {
    @Test
    @DisplayName("comprobar Metodo 1")
    void Multiplo3() {
        Calculadora test = new Calculadora();
        String Multiplo3 = test metodo1(3);
        assertEquals("Face", Multiplo3);


    }
}
