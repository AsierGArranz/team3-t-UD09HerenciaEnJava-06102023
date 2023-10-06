package main;

public class Electrodomestico {
	
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	final int PRECIO_BASE = 100;
	final String COLOR_BASE = "Blanco";
	final char CONSUMO_BASE = 'F';
	final double PESO_BASE = 5;
	
	
	public Electrodomestico() {
		this.precioBase = PRECIO_BASE;
		this.color = COLOR_BASE;
		this.consumoEnergetico = CONSUMO_BASE;
		this.peso = PESO_BASE;
	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR_BASE;
		this.consumoEnergetico = CONSUMO_BASE;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	
	
	

}
