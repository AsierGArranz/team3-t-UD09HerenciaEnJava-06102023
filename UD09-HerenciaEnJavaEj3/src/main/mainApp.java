package main;

public class mainApp {

	public static void main(String[] args) {
		Libro libro1 = new Libro("12345","Libro programacion","Stephen Hawkings",150);
		System.out.println(libro1);

		Libro libro2 = new Libro("54321","Manolito Gafotas","Elvira Lindo",192);
		System.out.println(libro2);

		comporbarPaginas(libro1, libro2);

	}

	public static void comporbarPaginas(Libro libro1, Libro libro2) {
		if(libro1.getNumeroPaginas()>libro2.getNumeroPaginas()) {
			System.out.println("El "+libro1.getTitulo()+" tiene mas paginas que "+libro2.getTitulo());
		}else if(libro2.getNumeroPaginas()>libro1.getNumeroPaginas()){
			System.out.println("El "+libro2.getTitulo()+" tiene mas paginas que "+libro1.getTitulo());
		}else {
			System.out.println("El "+libro2.getTitulo()+" tiene las mismas paginas que "+libro1.getTitulo());
		}

	}
}
