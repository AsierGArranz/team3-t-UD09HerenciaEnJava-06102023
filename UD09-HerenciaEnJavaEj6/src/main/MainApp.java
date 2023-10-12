package main;

public class MainApp {

	public static void main(String[] args) {
		Espectador[] espectadores = new Espectador[65];
		Pelicula p = new Pelicula("Manolito Gafotas", 69, 18, "Avril Lavgene");
		Cine cine = new Cine(p,6.9);

		for(int i = 0; i < 65; i++) {
			int edad = (int)(Math.random()*50)+1;
			int dinero = (int)(Math.random()*20)+2;
			espectadores[i]=new Espectador(GenerarNombre(),edad,dinero);
			System.out.println(espectadores[i]);
			if(cine.sentarEspectador(espectadores[i])) {
				System.out.println("El Espectador se ha sentado: " + espectadores[i].getNombre());
			}else {
				System.out.println("El Espectador NO se ha sentado: " + espectadores[i].getNombre());
			}


		}

	}

	public static String GenerarNombre() {
		String caracteres = "abcdefghijklmnopqrstuvwyxzABCDEFGHIJKLMNOPQRSTUVWYXZ";
		String nombre = "";
		for(int i = 0; i<8; i++) {
			int aleatorio = (int)(Math.random()*caracteres.length()-1);
			char caracterAleatorio = caracteres.charAt(aleatorio);
			nombre += caracterAleatorio;
		}
		return nombre;
	}

}
