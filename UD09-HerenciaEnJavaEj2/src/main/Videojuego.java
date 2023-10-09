package main;

public class Videojuego {
	
	private String titulo = "";
	private int horas_estimadas = 10;
	private boolean entregado = false;
	private String genero = "";
	private String compañia = "";
	
	
	public Videojuego() {
		
	}
	
	public Videojuego(String titulo, int horas_estimadas, boolean entregado, String genero, String compañia) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.entregado = entregado;
		this.genero = genero;
		this.compañia = compañia;
		
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getHoras_estimadas() {
		return horas_estimadas;
	}
	public void setHoras_estimadas(int horas_estimadas) {
		this.horas_estimadas = horas_estimadas;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas_estimadas=" + horas_estimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compañia=" + compañia + "]";
	}
	
	

}
