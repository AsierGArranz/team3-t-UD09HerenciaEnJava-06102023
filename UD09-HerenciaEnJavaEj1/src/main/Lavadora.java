package main;

public class Lavadora extends Electrodomestico{
	private final double CARGA_BASE = 5;
	private double carga = CARGA_BASE;

	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		if(this.carga > 30) {
			this.precioBase += 50;
		}
	}
	

	
}
