package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Operaciones;

class OperacionesTest {

	@Test
	void testSumar() {
//		fail("Not yet implemented");
		Operaciones operaciones=new Operaciones();
		int numero=3,numero2=5;
		int resultado = operaciones.sumar(numero, numero2);
		assertEquals(resultado,8);
	}

	@Test
	void testRestar() {
//		fail("Not yet implemented");
		Operaciones operaciones=new Operaciones();
		int numero=13,numero2=3;
		int resultado = operaciones.restar(numero, numero2);
		assertEquals(resultado, 10);
	}

	@Test
	void testMultiplicar() {
//		fail("Not yet implemented");
		Operaciones operaciones=new Operaciones();
		int numero=24,numero2=5;
		int resultado = operaciones.multiplicar(numero, numero2);
		assertEquals(resultado, 120);
	}

	@Test
	void testDividir() {
//		fail("Not yet implemented");
		Operaciones operaciones=new Operaciones();
		int numero=40,numero2=2;
		int resultado = operaciones.dividir(numero, numero2);
		assertEquals(resultado, 20);
	}

	@Test
	void testResto() {
//		fail("Not yet implemented");
		Operaciones operaciones=new Operaciones();
		int numero=4,numero2=8;
		int resultado = operaciones.resto(numero, numero2);
		assertEquals(resultado, 0.32);
	}

}
