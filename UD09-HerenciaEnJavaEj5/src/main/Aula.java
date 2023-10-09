package main;

import java.util.Iterator;

public class Aula {
	private int id;
	private int maxAlumnos;
	private String materia;
	private Alumno[] alumnos;
	private Profesor profe;
	
	
	
	public Aula(int id, int maxAlumnos, String materia, Alumno[] alumnos, Profesor profe) {
		super();
		this.id = id;
		this.maxAlumnos = maxAlumnos;
		this.materia = materia;
		this.alumnos = alumnos;
		this.profe = profe;
	}

	public void mostrarAlumnosAprobados() {
		int contadorFamales = 0;
		int contadorMales = 0;

		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i].sexo == 'F' && alumnos[i].getNota() >= 5) {
				contadorFamales++;
			}else if(alumnos[i].sexo == 'M' && alumnos[i].getNota() >= 5) {
				contadorMales++;
			}
		}
		
		System.out.println("Alumnos aprobados: " + contadorMales);
		System.out.println("Alumnas aprobadas: " + contadorFamales);
	}
	
	public boolean sePuedeDarClasse() {
		return profe.asistencia() && profe.getMateria() == this.materia && isMitadAlumnosAsistidos();
	}
	
	public boolean isMitadAlumnosAsistidos() {
		int contador = 0;
		for (int i = 0; i < alumnos.length; i++) {
			if(alumnos[i].asistencia()) {
				contador++;
			}
		}
		return contador > (alumnos.length / 2);
	}
	
	public int getMaxAlumnos() {
		return maxAlumnos;
	}

	public void setMaxAlumnos(int maxAlumnos) {
		this.maxAlumnos = maxAlumnos;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public Profesor getProfe() {
		return profe;
	}

	public void setProfe(Profesor profe) {
		this.profe = profe;
	}
}
