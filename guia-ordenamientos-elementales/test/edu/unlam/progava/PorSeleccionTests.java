package edu.unlam.progava;

import static org.junit.Assert.*;

import org.junit.Test;

public class PorSeleccionTests {

	@Test
	public void ordenarAleatorioTest() {
		int []datos = {31,14,37,12,19,31};
		int []esperado = {12,14,19,31,31,37};
		PorSeleccion seleccion = new PorSeleccion();
		
		seleccion.ordenar(datos);
		
		assertArrayEquals(esperado, datos);
	}

}
