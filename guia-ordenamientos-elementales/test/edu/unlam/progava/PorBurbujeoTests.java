package edu.unlam.progava;

import static org.junit.Assert.*;

import org.junit.Test;

public class PorBurbujeoTests {

	@Test
	public void ordenarAleatorioTest() {
		int[] datos = { 31, 14, 37, 12, 19, 31 };
		int[] esperado = { 12, 14, 19, 31, 31, 37 };
		PorBurbujeo burbujeo = new PorBurbujeo();

		burbujeo.ordenar(datos);

		assertArrayEquals(esperado, datos);
	}

}
