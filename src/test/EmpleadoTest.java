package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Empleado;

class EmpleadoTest {

	Empleado empleado;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		empleado = new Empleado();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testNominaBruta0VentasVendedor() {
		assertEquals(2000, empleado.calculoNominaBruta(empleado.tipo.VENDEDOR, 0, 0));
	}
	
	@Test
	void testNominaBruta1NegativoVentasVendedor() {
		assertEquals(2000, empleado.calculoNominaBruta(empleado.tipo.VENDEDOR, -1, 0));
	}
	
	@Test
	void testNominaBruta1000VentasVendedor() {
		assertEquals(2100, empleado.calculoNominaBruta(empleado.tipo.VENDEDOR, 1000, 0));
	}

	@Test
	void testNominaBruta1500VentasVendedor() {
		assertEquals(2200, empleado.calculoNominaBruta(empleado.tipo.VENDEDOR, 1500, 0));
	}

	@Test
	void testNominaBrutaHorasExtrasNegativasVendedor() {
		assertEquals(2000, empleado.calculoNominaBruta(empleado.tipo.VENDEDOR, 0, -1));
	}

	@Test
	void testNominaBrutaHorasExtrasVendedor() {
		assertEquals(2300, empleado.calculoNominaBruta(empleado.tipo.VENDEDOR, 0, 10));
	}
	
	//Ahora los test del encargado
	@Test
	void testNominaBruta0VentasEncargado() {
		assertEquals(2500, empleado.calculoNominaBruta(empleado.tipo.ENCARGADO, 0, 0));
	}
	
	@Test
	void testNominaBruta1NegativoVentasEncargado() {
		assertEquals(2500, empleado.calculoNominaBruta(empleado.tipo.ENCARGADO, -1, 0));
	}
	
	@Test
	void testNominaBruta1000VentasEncargado() {
		assertEquals(2600, empleado.calculoNominaBruta(empleado.tipo.ENCARGADO, 1000, 0));
	}

	@Test
	void testNominaBruta1500VentasEncargado() {
		assertEquals(2700, empleado.calculoNominaBruta(empleado.tipo.ENCARGADO, 1500, 0));
	}

	@Test
	void testNominaBrutaHorasExtrasNegativasEncargado() {
		assertEquals(2500, empleado.calculoNominaBruta(empleado.tipo.ENCARGADO, 0, -1));
	}

	@Test
	void testNominaBrutaHorasExtrasEncargado() {
		assertEquals(2800, empleado.calculoNominaBruta(empleado.tipo.ENCARGADO, 0, 10));
	}
	
	
	@Test
	void testNominaNetaMenor2100() {
		float nominaBruta = empleado.calculoNominaBruta(empleado.tipo.VENDEDOR, 0, 0);
		assertEquals(2000,empleado.calculoNominaNeta(nominaBruta));
	}
	
	@Test
	void testNominaNetaMayor2100Menor2500() {
		float nominaBruta =  empleado.calculoNominaBruta(empleado.tipo.VENDEDOR, 1000, 0);
		assertEquals(1785,empleado.calculoNominaNeta(nominaBruta));
	}
	
	@Test
	void testNominaNetaMayor2500() {
		float nominaBruta =  empleado.calculoNominaBruta(empleado.tipo.ENCARGADO, 1000, 0);
		assertEquals(2132,empleado.calculoNominaNeta(nominaBruta));
	}
	
	

}
