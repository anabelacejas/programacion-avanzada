package edu.unlam.progava;

public class PorOddEven extends Ordenadora {

	@Override
	public void ordenar(int[] array) {

		boolean intercambio = true;
		int aux;

		while (intercambio == true) {

			intercambio = false;
			
			// burbujeo impar
			for (int i = 1; i < array.length - 1; i += 2) {
				if(array[i] > array[i+1]) {
					aux = array[i];
					array[i] = array[i+1];
					array[i+1] = aux;
					intercambio = true;
				}
			}

			// burbujeo par
			
			for (int j = 0; j < array.length - 1; j += 2) {
				if(array[j] > array[j+1]) {
					aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
					intercambio = true;
				}
			}
		}

	}

}
