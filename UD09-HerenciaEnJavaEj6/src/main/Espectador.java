package main;

public class Espectador {
	private String nombre;
	private int edad;
	private double dinero;
	public Espectador(String nombre, int edad, double dinero) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dinero = dinero;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public double getDinero() {
		return dinero;
	}
	@Override
	public String toString() {
		return "Espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";
	}
	
	
}
