package edu.unlam.progava;

import java.util.Arrays;

public class PorInsercion extends Ordenadora {

	@Override
	public void ordenar(int[] array) {

		int aux, j;
		for (int i = 1; i < array.length; i++) {
			aux = array[i];
			j = i;
			while (j > 0 && array[j - 1] > aux) {
				array[j] = array[j - 1];
				j--;
			}

			array[j] = aux;
		}

	}

}
