package main;

public class Alumno extends Persona{

	private int nota = 0;
	
	
	public int getNota() {
		return nota;
	}


	public void setNota(int nota) {
		this.nota = nota;
	}


	@Override
	public boolean asistencia() {
		// 50%
		int random = (int)(Math.random()*2+1);
		if(random ==1) {
			return true;
		}else{
			return false;
		}
	}
	//comentario

}
