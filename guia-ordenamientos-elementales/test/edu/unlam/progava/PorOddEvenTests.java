package edu.unlam.progava;

import static org.junit.Assert.*;

import org.junit.Test;

public class PorOddEvenTests {

	@Test
	public void ordenarAleteatorioTest() {
		int []datos = {31,14,37,12,19,31};
		int []esperado = {12,14,19,31,31,37};
		PorOddEven oddeven = new PorOddEven();
		
		oddeven.ordenar(datos);
		
		assertArrayEquals(esperado, datos);
	}

}
