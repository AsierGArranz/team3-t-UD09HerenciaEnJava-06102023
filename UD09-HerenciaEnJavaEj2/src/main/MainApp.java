package main;

public class MainApp {
	public static void main(String[] args) {
		Videojuego[] arrayJuegos = new Videojuego[5];
		Serie[] arraySeries = new Serie[5];
		int contadorJuegosEntregados = 0;
		int contadorSeriesEntregados = 0;

		for(int i = 0; i < arrayJuegos.length; i++) {
			arrayJuegos[i] = new Videojuego();
			arraySeries[i] = new Serie();
		}
		
		arrayJuegos[0].entregar();
		arrayJuegos[2].entregar();
		arraySeries[0].entregar();
		arraySeries[2].entregar();
		
		Serie mayorSerie = arraySeries[0];
		Videojuego mayorVideojuego = arrayJuegos[0];
		for (int i = 0; i < arraySeries.length; i++) {
			if(arrayJuegos[i].isEntregado()) {
				contadorJuegosEntregados++;
			}
			if(arraySeries[i].isEntregado()) {
				contadorSeriesEntregados++;
			}
			if(arraySeries[i].compareTo(mayorSerie) == 1) {
				mayorSerie = arraySeries[i];
			}
			if(arrayJuegos[i].compareTo(mayorVideojuego) == 1) {
				mayorVideojuego = arrayJuegos[i];
			}
		}


		System.out.println("Los juegos entregados són: " + contadorJuegosEntregados);
		System.out.println("Las series entregadas són: " + contadorSeriesEntregados);

		System.out.println();
		
		System.out.println("La serie mayor es: " + mayorSerie);
		System.out.println("El Videojuego con mas horas es: " + mayorVideojuego);
	}

}
