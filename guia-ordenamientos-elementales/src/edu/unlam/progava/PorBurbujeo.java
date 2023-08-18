package edu.unlam.progava;

import java.util.Arrays;

public class PorBurbujeo extends Ordenadora {

	@Override
	public void ordenar(int[] array) {

		int aux;
		boolean intercambio = true;
		for (int i = 0; i < array.length && intercambio == true; i++) {

			intercambio = false;
			for (int j = array.length - 1; j > i; j--) {
				if (array[j] < array[j - 1]) {
					aux = array[j];
					array[j] = array[j - 1];
					array[j - 1] = aux;
					intercambio = true;
				}
			}
			
		}

	}
	

}
