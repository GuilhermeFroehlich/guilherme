
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcularTest {

	@Test
	void test() {
		Calcular soma = new Calcular();
		int ResultadoEsperado = 10;
		
		int resultado = Calcular.Somar (4, 6);
		assertTrue(ResultadoEsperado == ResultadoEsperado);
		
	}
    void TesteSomarSemAnnotation () {
    	Calcular soma = new Calcular();
		int ResultadoEsperado = 10;
		
		int resultado = Calcular.Somar (4, 6);
		assertTrue(ResultadoEsperado == ResultadoEsperado);        	
    }
    @Test
    void TesteNumerosNegativos() {
    	Calcular soma = new Calcular();
		int ResultadoEsperado = -10;
		
		int resultado = Calcular.Somar (-4, -6);
		assertTrue(ResultadoEsperado == ResultadoEsperado);
		
    }
    
}
