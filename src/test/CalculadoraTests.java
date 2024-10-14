package test;
import main.Calculadora;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTests {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		assertEquals(6, Calculadora.suma(4, 2));
	}
	
	@Test
	void testResta() {
		assertEquals(2, Calculadora.resta(4, 2));
	}
	@Test
	void testMultiplica() {
		assertEquals(8, Calculadora.multiplicacion(4, 2));
	}
	
	@Test
	void testDivide() {
		assertEquals(2, Calculadora.division(4, 2));
	}
	

}
