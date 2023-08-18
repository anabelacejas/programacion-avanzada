package edu.unlam.progava;

public class PorSeleccion extends Ordenadora {

	@Override
	public void ordenar(int[] array) {
		// implementar y probar con JUnit cada uno
		int menor, aux;
		
		for(int i= 0; i < array.length - 1; i++){
			menor = i;
			
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] < array[menor]) {
					menor = j;
				}
			}
			
			aux = array[i];
			array[i] = array[menor];
			array[menor] = aux;
		}	
		
	}
}
