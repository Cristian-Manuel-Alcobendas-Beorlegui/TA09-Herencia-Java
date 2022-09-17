package Ejercicio1;

// La clase "Electrodomestico" será la superclase
public class Electrodomestico {
	// Atributos de la clase
	protected String color;
	protected double precio, peso;
	protected char consumoEnergetico;
	
	// Valores por defecto
	protected final String vpdColor = "Blanco";
	protected final double vpdPrecio = 100;
	protected final double vpdPeso = 5;
	protected final char vpdConsumoEnergetico = 'F';
	
	// Vector con todos los valores posibles para los atributos "consumoElectrico" y "color"
	protected String[] colores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
	protected char[] tipoConsumo = {'A', 'B', 'C', 'D', 'E', 'F'};
	
	// --------------------------------------------------------------------------------------------------- //
	
	// Constructores de la clase
	// Constructor por defecto
	public Electrodomestico() {
		// Inicializar los atributos
		this.color = vpdColor;
		this.precio = vpdPrecio;
		this.peso = vpdPeso;
		this.consumoEnergetico = vpdConsumoEnergetico;
	} 
	
	// Constructor con los parámetros "precio" y "peso"
	public Electrodomestico(double precio, double peso) {
		// Inicializar los atributos
		this.color = vpdColor;
		this.precio = precio;
		this.peso = peso;
		this.consumoEnergetico = vpdConsumoEnergetico;
	}
	
	// Contructor con todos los parámetros
	public Electrodomestico(String color, double precio, double peso, char consumoEnergetico) {
		// Inicializar los atributos
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
	// Atributo 1: Color
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
		comprobarColor();
	}
	
	// Atributo 2: Precio
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	// Atributo 3: Peso
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// Atributo 4: Consumo energético
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = Character.toUpperCase(consumoEnergetico);
		comprobarConsumo();
	}
	
	// --------------------------------------------------------------------------------------------------- //
	
	// Métodos y funciones
	// Método 1: Comprobar consumo
	public void comprobarConsumo() {
		// Variables
		int i;
		boolean disponible = false;
		
		// Bucle FOR para saber si el tipo de consumo está disponible.
		for(i = 0; i < tipoConsumo.length && !disponible; i++) {
			// Para cada posición del vector comprobar el tipo de consumo
			if(consumoEnergetico == tipoConsumo[i]) {
				disponible = true;
			} // Fin IF
		} // Fin FOR
		
		// Si el tipo de consumo no está disponible se cambiará al valor por defecto
		if(!disponible) {
			this.consumoEnergetico = vpdConsumoEnergetico;
			System.out.println("ERROR: El tipo de consumo especificado no es correcto.");
			System.out.println("ACTUALIZACIÓN: El tipo de consumo se ha cambiado a " + consumoEnergetico + ".");
		}
	}
	
	// Método 2: Comprobar el color
	public void comprobarColor() {
		// Variables
		int i;
		boolean disponible = false;
		
		// Bucle FOR para saber si el color está disponible
		for(i = 0; i < colores.length && !disponible; i++) {
			// Para cada posición del vector, comprobar el color
			if(color.equalsIgnoreCase(colores[i])) {
				disponible = true;
			} // Fin IF
		} // Fin FOR
		
		// Si el color NO estaba disponible, se cambiará al valor por defecto
		if(!disponible) {
			this.color = vpdColor;
			System.out.println("ERROR: El color especificado no existe.");
			System.out.println("ACTUALIZACIÓN: El color ha sido cambiado a " + color + ".");
		}
	}
	
	// Método 3: Precio final
	public void precioFinal() {
		// Sentencia SWITCH que tendrá en cuenta el tipo de consumo energético
		// En función del tipo de consumo, el precio aumentará una determinada cantidad.
		switch(this.consumoEnergetico) {
			case 'A': // A --> +100€
				precio = precio + 100;
				break;
		
			case 'B': // B --> +80€
				precio = precio + 80;
				break;
				
			case 'C': // C --> +60€
				precio = precio + 60;
				break;
				
			case 'D': // D --> +50€
				precio = precio + 50;
				break;
				
			case 'E': // E --> +30€
				precio = precio + 30;
				break;
				
			case 'F': // F --> +10€
				precio = precio + 10;
				break;
		
		} // Fin sentencia SWITCH
	
		// Senténcia IF-ELSE IF que tendrá en cuenta el tamaño del electrodoméstico
		if(peso >= 0 && peso <= 19) { // 0 - 19 --> +10€
			precio = precio + 10;
		} else if(peso >= 20 && peso <= 49) { // 20 - 49 --> +50€
			precio = precio + 50;
		} else if(peso >= 50 && peso <= 79) { // 50 - 79 --> +80€
			precio = precio + 80;
		} else if (peso >= 80) { // 80 - +80 --> 100€
			precio = precio + 100;
		} // Fin ELSE IF
	}
	
	// --------------------------------------------------------------------------------------------------- //
	
	// Fin de la clase
	
}
