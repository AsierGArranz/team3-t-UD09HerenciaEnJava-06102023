package main;

public class Television extends Electrodomestico {
	
	final int RESOLUCION_BASE = 20;
	final boolean SINTONIZADOR_BASE = false;
	
	protected int resolucion = RESOLUCION_BASE;
	protected boolean sintonizador = SINTONIZADOR_BASE;


	public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizador) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
		
	}


	public int getResolucion() {
		return resolucion;
	}


	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}


	public boolean isSintonizador() {
		return sintonizador;
	}


	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}

	@Override
	public void precioFinal() {
		super.precioFinal();
		if(resolucion >40) {precioBase*=0.3;}
		if(sintonizador==true) {precioBase+=50;}
	}

	
	
	
}
