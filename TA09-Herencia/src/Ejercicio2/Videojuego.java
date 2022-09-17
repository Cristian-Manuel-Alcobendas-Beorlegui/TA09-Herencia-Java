package Ejercicio2;

public class Videojuego implements Entregable {
	// Atributos de la clase
	private String titulo, genero, compania;
	private int horasEstimadas;
	private boolean entregado;
	
	// Valores por defecto
	private final String vpdTitulo = "Sin especificar";
	private final String vpdGenero = "Sin especificar";
	private final String vpdCompania = "Sin especificar";
	private final int vpdHorasEstimadas = 10;
	private final boolean vpdEntregado = false;
	
	// -------------------------------------------------------------- //
	
	// Constructores de la clase
	// Constructor por defecto
	public Videojuego() {
		// Inicializar los atributos
		this.titulo = vpdTitulo;
		this.genero = vpdGenero;
		this.compania = vpdCompania;
		this.horasEstimadas = vpdHorasEstimadas;
		this.entregado = vpdEntregado;
	} // Fin del constructor
	
	// Constructor con lo parámetros "titulo" y "horasEstimadas"
	public Videojuego(String titulo, int horasEstimadas) {
		// Inicializar los atributos
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = vpdGenero;
		this.compania = vpdCompania;
		this.entregado = vpdEntregado;
	} // Fin del constructor
	
	// Constructor con todos los parámetros a excecpción de "Entregado"
	public Videojuego(String titulo, String genero, String compania, int horasEstimadas) {
		// Inicializar los atributos
		this.titulo = titulo;
		this.genero = genero;
		this.compania = compania;
		this.horasEstimadas = horasEstimadas;
	} // Fin del constructor
	
	// -------------------------------------------------------------- //
	
	// Getters y setters
	// Atributo 1: Titulo
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
	
	// Atributo 3: Compañia
	public String getCompania() {
		return compania;
	}
	
	public void setCompania(String compania) {
		this.compania = compania;
	}
	
	// Atributo 4: Horas estimadas
	public int getHorasEstimadas() {
		return horasEstimadas;
	}
	
	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
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
	
	// Método 4: compareTo, compara las horas estimadas de dos videojuegos
	@Override
	public String compareTo(Object a) {
		// Variables y objetos
		String estado = "";
		Videojuego vj = (Videojuego)a;
		
		// Comprar el número de horas entre los videojuegos
		if(horasEstimadas > vj.getHorasEstimadas()) {
			estado = "Videojuego 1 tiene más horas que Videojuego 2.";
		} else if(horasEstimadas == vj.getHorasEstimadas()) {
			estado = "Ambos videojuegos tienen el mismo número de horas estimadas.";
		} else {
			estado = "Videojuego 2 tiene más horas que Videojuego 1.";
		} // Fin ELSE
		
		// Devolver el valor de la variable "estado"
		return estado;
	}
	
	// -------------------------------------------------------------- //
	// Fin de la clase.
}
