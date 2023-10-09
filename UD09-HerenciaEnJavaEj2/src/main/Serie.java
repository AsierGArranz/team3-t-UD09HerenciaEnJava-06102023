package main;

public class Serie implements Entregable{
	
	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	final int NUM_TEMPORADAS_BASE = 3;
	final boolean ENTREGADO_BASE = false;
	
	public Serie() {
		this.titulo = "";
		this.numTemporadas = NUM_TEMPORADAS_BASE;
		this.entregado = ENTREGADO_BASE;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = NUM_TEMPORADAS_BASE;
		this.entregado = ENTREGADO_BASE;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

	@Override
	public void entregar() {

		entregado = true;
	}

	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		entregado = false;

	}

	@Override
	public int compareTo(Object a) {
		// TODO Auto-generated method stub
		if(a.getClass() == Serie.class) {
			Serie b = (Serie)a;
			if(b.getNumTemporadas() > this.getNumTemporadas()) {
				return 1;
			}else if(b.getNumTemporadas() < this.getNumTemporadas()) {
				return -1;
			}else {
				return 0;
			}
		}
		return 0;
	}
	
	
	
	

	
}
