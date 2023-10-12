package main;

import java.util.ArrayList;

public class Cine {
	
	private Pelicula pelicula;
	private double precioEntrada;
	private Espectador asientos[][] = new Espectador[8][8];
	
	public Cine(Pelicula pelicula, double precioEntrada) {
		this.pelicula = pelicula;
		this.precioEntrada = precioEntrada;
	}
	
	public Pelicula getPelicula() {
		return pelicula;
	}
	
	public double getPrecioEntrada() {
		return precioEntrada;
	}
	
	public boolean sentarEspectador (Espectador e) {
		int fila = (int) (Math.random()*8);
		int columna = (int) (Math.random()*8);
		ArrayList<String> posicionesLibres = new ArrayList<String>();
		
		if (puedeSentarse(e)) {
			for (int i = 0; i < asientos.length; i++) {
				for (int j = 0; j < asientos[i].length; j++) {
					if (asientos[i][j]==null) {
						posicionesLibres.add(i+" "+j);
					}
					
				}
			}
			
			if (posicionesLibres.size() == 0) {
				return false;
			} else {
				int posicion = (int) (Math.random()*posicionesLibres.size());
				String posicionMatriz1 = posicionesLibres.get(posicion).split(" ")[0] ;
				int matriz1 = Integer.parseInt(posicionMatriz1);
				String posicionMatriz2 = posicionesLibres.get(posicion).split(" ")[1] ;
				int matriz2 = Integer.parseInt(posicionMatriz2);

				
				asientos[matriz1][matriz2] = e;

				return true;
			}
		} else {
			return false;
		}
		
	}
	
	public boolean puedeSentarse(Espectador e) {
		
		return e.getDinero()>=precioEntrada && e.getEdad()>= pelicula.getEdadMinima();
		
	}
	
}
