package Ejercicio3;

public class Libro {
	// Atributos de la clase
	private String titulo, autor, isbn;
	private int numPaginas;
	
	// -------------------------------------------------- //
	
	// Métodos y funciones
	// Método 1: toString, mostrar la información por pantalla.
	public void infoLibro() {
		System.out.println("DATOS DE \"" + getTitulo().toUpperCase() + "\"");
		System.out.println("------------------------------");
		System.out.println("   - Título: " + getTitulo());
		System.out.println("   - Autor: " + getAutor());
		System.out.println("   - ISBN: " + getISBN());
		System.out.println("   - Número de pàginas: " + getNumPaginas());
		System.out.println("\n###########################################\n");
	}
	
	// -------------------------------------------------- //
	
	// Getters y setters
	// Atributo 1: Título
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	// Atributo 2: Autor
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	// Atributo 3: ISBN
	public String getISBN() {
		return isbn;
	}
	
	public void setISBN(String isbn) {
		this.isbn = isbn;
	} 
	
	// Atributo 4: Número de páginas
	public int getNumPaginas() {
		return numPaginas;
	}
	
	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	// -------------------------------------------------- //
}
