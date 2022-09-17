package Ejercicio2;

public class Serie implements Entregable {
	// Atributos de la clase
	private String titulo, genero, creador;
	private int numTemporadas;
	private boolean entregado;
	
	// Valores por defecto (vpd)
	private final String vpdTitulo = "Sin especificar";
	private final String vpdGenero = "Sin especificar";
	private final String vpdCreador = "Sin especificar";
	private final int vpdNumTemporadas = 3;
	private final boolean vpdEntregado = false;
	
	// -------------------------------------------------------------- //
	
	// Constructores de la clase
	// Constructor por defecto
	public Serie() {
		// Inicializar los atributos
		titulo = vpdTitulo;
		genero = vpdGenero;
		creador = vpdCreador;
		numTemporadas = vpdNumTemporadas;
		entregado = vpdEntregado;
	} // Fin del constructor
	
	// Constructor con los parámetros "titulo" y "creador"
	public Serie(String titulo, String creador) {
		// Inicializar los atributos
		this.titulo = titulo;
		this.creador = creador;
		genero = vpdGenero;
		numTemporadas = vpdNumTemporadas;
		entregado = vpdEntregado;
	} // Fin del constructor
	
	// Constructor con todos los parámetros excepto "entregado"
	public Serie(String titulo, String genero, String creador, int numTemporadas) {
		// Inicializar los atributos
		this.titulo = titulo;
		this.genero = genero;
		this.creador = creador;
		this.numTemporadas = numTemporadas;
		this.entregado = vpdEntregado;
	} // Fin del constructor
	
	// -------------------------------------------------------------- //
	
	// Getters y setters
	// Atributo 1. Titulo
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	// Atributo 2: Género
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	// Atributo 3: Creador
	public String getCreador() {
		return creador;
	}
	
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	// Atributo 4: Número de temporadas
	public int getNumTemporadas() {
		return numTemporadas;
	}
	
	public void etNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}
	
	// -------------------------------------------------------------- //
	
	// Métodos de la interfaz

	// Método 1: Entregar, cambia el valor del atributo "entregado" a TRUE
	@Override
	public void entregar() {
		entregado = true;
	}
	
	// Método 2: Devolver, cambia el valor del atributo "entregado" a FALSE
	@Override
	public void devolver() {
		entregado = false;
	}
	
	// Método 3: isEntregado, devuelve el valor del atributo "entregado"
	@Override
	public boolean isEntregado() {
		return entregado;
	}
	
	// Método 4: compareTo, compara el número de temporadas de dos series
	@Override 
	public String compareTo(Object a) {
		// Variables y objetos
		String estado = "";
		Serie serie = (Serie)a;
		
		// Comparar el número de temporadas
		if(numTemporadas > serie.getNumTemporadas()) {
			estado = "Serie 1 tiene más temporadas que la Serie 2";
		} else if(numTemporadas == serie.getNumTemporadas()) {
			estado = "Ambas series tienen el mismo número de temporadas";
		} else {
			estado = "La Serie 2 tiene más temporadas que la Serie 1.";
		} // Fin ELSE
		
		// Devolver el valor de la variable "estado"
		return estado;
	}
	
	// -------------------------------------------------------------- //
	
	// Fin de la clase
	
}
