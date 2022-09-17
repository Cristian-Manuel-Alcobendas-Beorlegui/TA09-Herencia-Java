package Ejercicio1;

// La clase "Lavadora" heredará los atributos, funciones y métodos de la superclase "Electrodomestico"
public class Lavadora extends Electrodomestico {
	// Atributos de la clase
	private double carga;
	
	// Valores por defecto
	private double vpdCarga = 5;

	// --------------------------------------------------------------------------------------------------- //
	
	// Constructores de la clase
	// Constructor por defecto
	public Lavadora() {
		// Inicializar los atributos
		this.color = vpdColor;
		this.precio = vpdPrecio;
		this.peso = vpdPeso;
		this.consumoEnergetico = vpdConsumoEnergetico;
		this.carga = vpdCarga;
	}
	
	// Constructor con los parámetros "precio" y "peso"
	public Lavadora(double precio, double peso) {
		// Inicializar los atributos
		this.color = vpdColor;
		this.precio = precio;
		this.peso = peso;
		this.consumoEnergetico = vpdConsumoEnergetico;
		this.carga = vpdCarga;
	}
	
	// Constructor con todos los parámetros
	public Lavadora(double carga, String color, double precio, double peso, char consumoEnergetico) {
		// Inicializar las variables
		this.color = color;
		this.precio = precio;
		this.peso = peso;
		this.consumoEnergetico = Character.toUpperCase(consumoEnergetico);
		this.carga = carga;
		
		// Llamar a los métodos "comprobarColor" y "comprobarConsumo"
		comprobarColor();
		comprobarConsumo();
	}
	
	// --------------------------------------------------------------------------------------------------- //
	
	// Getters y setters
	// Atributo 1
	public double getCarga() {
		return carga;
	}
	
	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	// --------------------------------------------------------------------------------------------------- //
	
	// Métodos y funciones
	// Método 1: Precio final
	public void precioFinal() {
		// Conseguir el precio con los datos existentes.
		super.precioFinal();
		
		// Si tiene una carga mayor a 30, el precio incrementará en +50.
		if(carga > 30) {
			precio = precio + 50;
		} // Fin IF
	}
	
	// --------------------------------------------------------------------------------------------------- //
	
	// Fin de la clase
}
