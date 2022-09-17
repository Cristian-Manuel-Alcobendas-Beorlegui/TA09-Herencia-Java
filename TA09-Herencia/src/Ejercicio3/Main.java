package Ejercicio3;

public class Main {

	public static void main(String[] args) {
		// 1. Crear dos objetos de la clase "Libro"
		Libro libro1 = new Libro();
		Libro libro2 = new Libro();
		
		// 2. Definir datos en los objetos
		// Datos para el objeto "libro1"
		libro1.setTitulo("Gerónimo Stilton en el Reino de la Fantasía");
		libro1.setAutor("Elisabetta Dami");
		libro1.setISBN("9788408060994");
		libro1.setNumPaginas(348);
		
		// Datos para el objeto "libro2"
		libro2.setTitulo("La Tuneladora");
		libro2.setAutor("Fernando Lalana");
		libro2.setISBN("9788483430064");
		libro2.setNumPaginas(200);
	
		// 3. Mostrar los datos de los objetos
		libro1.infoLibro();
		libro2.infoLibro();
		
		// 4. Mostrar el libro que tenga mas páginas
		System.out.print("Libro que tiene más páginas: ");
		if(libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println(libro1.getTitulo());
		} else if(libro1.getNumPaginas() == libro2.getNumPaginas()) {
			System.out.println("Ambos");
		} else {
			System.out.println(libro2.getTitulo());
		} // Fin ELSE
		
		// Fin de la clase
	}
}

