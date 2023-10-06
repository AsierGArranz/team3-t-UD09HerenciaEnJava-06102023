package main;

public class Electrodomestico {
	

	final int PRECIO_BASE = 100;
	final String COLOR_BASE = "Blanco";
	final char CONSUMO_BASE = 'F';
	final double PESO_BASE = 5;
	
	protected double precioBase = PRECIO_BASE;
	protected String color = COLOR_BASE;
	protected char consumoEnergetico = CONSUMO_BASE;
	protected double peso = PESO_BASE;
	
	public Electrodomestico() {
	
	}

	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);
		this.precioBase = precioBase;
		this.peso = peso;
		
	}
	
	public void comprobarConsumoEnergetico(char letra) {
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			this.consumoEnergetico = letra;
		} else {
			letra = CONSUMO_BASE;
		}
	}
	
	public void comprobarColor(String color) {
		color=color.toLowerCase();
		if (color == "blanco" || color == "negro"  || color == "rojo"  || color == "azul"  || color == "gris") {
			this.color = color;
		} else {
			color = COLOR_BASE;
		}
	}
	
	public void precioFinal() {
		switch (consumoEnergetico) {
		case 'A':
			precioBase+=100;
			
			break;
		case 'B':
			precioBase+=80;

			break;
		case 'C':
			precioBase+=60;

			break;
		case 'D':
			precioBase+=50;

			break;
		case 'E':
			precioBase+=30;

			break;
		case 'F':
			precioBase+=10;

			break;

		default:
			break;
		}
		
		if (0<=peso&&peso<=19) {
			precioBase+=10;

		} else if (20<=peso&&peso<=49) {
			precioBase+=50;

		} else if (50<=peso&&peso<=79) {
			precioBase+=80;

		} else if (peso>=80) {
			precioBase+=100;
		}	
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}	
	

}
