package Ejercicio1;
import java.text.DecimalFormat; // Paquete para dar formato a los valores decimales

public class Main {

	public static void main(String[] args) {
		// 1. Declarar los objetos
		int i;
		double total;
		Electrodomestico[] elect = new Electrodomestico[10];
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		// 2. Para cada posición del vector crear un objeto de la clase "Electrodomestico", "Lavadora" o "Nevera"
		elect[0] = new Electrodomestico();
		elect[1] = new Television();
		elect[2] = new Lavadora();
		elect[3] = new Electrodomestico(150, 50);
		elect[4] = new Television(120, 20);
		elect[5] = new Lavadora(300, 70);
		elect[6] = new Electrodomestico("Azul", 299.99, 80, 'B');
		elect[7] = new Television(41, false, "Negro", 249.99, 20, 'A');
		elect[8] = new Lavadora(20, "Gris", 200, 78, 'A');
		elect[9] = new Electrodomestico();
		
		// 3. Recorrer cada posición del vector y utilizar el método "precioFinal".
		for(i = 0, total = 0; i < elect.length; i++) {
			elect[i].precioFinal();
			total = total + elect[i].getPrecio();
		} // Fin FOR
		
		// 4. Mostrar por pantalla el total
		System.out.println("Precio total: " + decimal.format(total) + "€");
	}

}
