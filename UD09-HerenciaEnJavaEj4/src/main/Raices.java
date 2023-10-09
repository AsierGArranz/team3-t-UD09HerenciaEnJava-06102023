package main;

public class Raices {
	
	private double a = 0;
	private double b = 0;
	private double c = 0;
	
	public Raices(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getDiscriminante() {
		return (Math.pow(b,2))-4*a*c;
	}
	
	public boolean tieneRaices() {
		return getDiscriminante()>=0;
	}
	
	public boolean tieneRaiz() {
		return getDiscriminante()==0;
	}
	
}
