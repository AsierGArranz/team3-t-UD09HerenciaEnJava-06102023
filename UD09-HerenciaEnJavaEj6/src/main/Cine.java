package main;

public class Cine {
	
	private Pelicula pelicula;
	private double precioEntrada;
	
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
	
}
