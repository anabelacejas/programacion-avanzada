package edu.unlam.progava;

public class App {

	public static void main(String[] args) {
		Ordenadora[] algoritmos = {
				new PorSeleccion(),
				 new PorBurbujeo(),
				new PorSeleccion(),
				new PorOddEven()
		};
		long inicio, tiempo;
		
		
		// repetir todas las veces necesarias:
		// crear conjunto de datos
		inicio = System.nanoTime();
		// ordenar
		// algoritmos[i].ordenar(array);
		tiempo = System.nanoTime() - inicio;
		// registrar tiempo
	}
}
