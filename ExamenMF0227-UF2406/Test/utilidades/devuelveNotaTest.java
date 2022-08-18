package utilidades;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class devuelveNotaTest {

	static devuelveNota f;
	
	@BeforAll
	static void inicializar() {
		f= new devuelveNota();
	}
	
	@Test
	void devuelveNotaTest() {	
		
		assertEquals(5,f.devuelveNotal(4), "Debe devolver Suspenso");
		assertEquals(5,f.devuelveNotal(7), "Debe devolver Bien");
		
		assertEquals(5,f.devuelveCentral(8), "Debe devolver Notable");
		assertEquals(5,f.devuelveCentral(9), "Debe devolver Sobresaliente");
		
		
		
	}

}
