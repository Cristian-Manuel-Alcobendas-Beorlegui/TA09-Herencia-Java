package Ejercicio1;

// La clase "Television" heredará los atributos, funciones y métodos de la superclase "Electrodomestico"
public class Television extends Electrodomestico {
	// Atributos de la clase
	private double pulgadas;
	private boolean tdt;
	
	// Valores por defecto
	private final double vpdPulgadas = 20;
	private final boolean vpdTdt = false;
	
	// --------------------------------------------------------------------------------------------------- //
	
	// Constructores de la clase
	// Constructor por defecto
	public Television() {
		// Inicializar los atributos
		this.color = vpdColor;
		this.precio = vpdPrecio;
		this.peso = vpdPeso;
		this.consumoEnergetico = vpdConsumoEnergetico;
		this.pulgadas = vpdPulgadas;
		this.tdt = vpdTdt;
	}
	
	// Constructor con los parámetros "precio" y "peso"
	public Television(double precio, double peso) {
		// Inicializar los atributos
		this.color = vpdColor;
		this.precio = vpdPrecio;
		this.peso = vpdPeso;
		this.consumoEnergetico = vpdConsumoEnergetico;
		this.pulgadas = vpdPulgadas;
		this.tdt = vpdTdt;
	}
	
	// Constructor con todos los parámetros
	public Television(double pulgadas, boolean tdt, String color, double precio, double peso, char consumoEnergetico) {
		// Inicializar los atributos
		this.pulgadas = pulgadas;
		this.tdt = tdt;
		this.color = color;
		this.precio = precio;
		this.peso = peso;
		this.consumoEnergetico = Character.toUpperCase(consumoEnergetico);
		
		// Llamar a los métodos "comprobarColor" y "comprobarConsumo"
		comprobarColor();
		comprobarConsumo();
	}
	
	// --------------------------------------------------------------------------------------------------- //
	
	// Getters y setters
	// Atributo 1: Pulgadas
	public double getPulgadas() {
		return pulgadas;
	}
	
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	// Atributo 2: tdt
	public boolean getTdt() {
		return tdt;
	}
	
	public void setTdt(boolean tdt) {
		this.tdt = tdt;
	}
	
	// --------------------------------------------------------------------------------------------------- //
	
	// Métodos y funciones
	// Método 1: Precio final
	public void precioFinal() {
		// Conseguir el precio con los datos existentes
		super.precioFinal();
				
		// Comprobar si la resolución es mayor que 40
		if(pulgadas > 40) { // Si es así, el precio aumenta un 30%
			precio = precio + (precio*(30/100));
		} // Fin IF
		
		// Comprobar si la TV tiene TDT
		if(tdt) { // Si es así, el precio aumentará en +50€
			precio = precio + 50;
		} // Fin IF
	}
	
	// --------------------------------------------------------------------------------------------------- //
	
	// Fin de la clase
}
