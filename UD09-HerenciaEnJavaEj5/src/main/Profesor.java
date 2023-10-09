package main;

public class Profesor extends Persona{
	
	private String materia = "";
	

	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	@Override
	public boolean asistencia() {
		// 20%
		int random = (int)(Math.random()*5+1);
		if(random ==1) {
			return false;
		}else{
			return true;
		}
	}
	//comentario

}
