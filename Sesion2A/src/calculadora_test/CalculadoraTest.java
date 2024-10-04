package calculadora_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import calculaora.Calculadora;

class CalculadoraTest {
	private int valor1, valor2;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	System.out.println("Before all");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before each");
		this.valor1 = 4;
		this.valor2 = 9;
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After each");
	}

	@Test
	void testSuma() {
		int expected = 13;
		int actual = Calculadora.suma(valor1, valor2);
		
		assertEquals(expected, actual);
	}

	@Test
	void testResta() {
		int expected = -5;
		int actual = Calculadora.resta(valor1, valor2);
		
		assertEquals(expected, actual);
	
	}

	@Test
	void testDivide() {
		int expected = 0;
		int actual = Calculadora.divide(valor1, valor2);
		
		assertEquals(expected, actual);
		}
	
	@Test
	void testDividePor0() {
		this.valor2=0;
		int expected = -1;
		int actual = Calculadora.divide(valor1, valor2);
		
		assertEquals(expected, actual);
		}


	@Test
	void testMultiplica() {
		int expected = 36;
		int actual = Calculadora.multiplica(valor1, valor2);
		
		assertEquals(expected, actual);
		}

}
