package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		// 1. Declarar variables
		int i, totalSeriesEntregadas, totalJuegosEntregados, pos, maxHoras;
		Serie[] series = new Serie[5];
		Videojuego[] juegos = new Videojuego[5];
		
		// 2. Crear en cada posición del vector un objeto de la clase
		// Series
		series[0] = new Serie("Detective Conan", "Misterio", "Gōshō Aoyama", 22);
		series[1] = new Serie("The Mandalorian", "Acción", "Jon Favreau", 3);
		series[2] = new Serie("Obi-Wan Kenobi", "Acción", "George Lucas", 1);
		series[3] = new Serie("Avengers Assemble", "Aventura", "Marvel Animation", 4);
		series[4] = new Serie("Transformers Prime", "Acción", "Alex Kurtzman, Roberto Orci, Duane Capizzi, Jeff Kline", 3);
		
		// Videojuegos
		juegos[0] = new Videojuego("Super Mario Bros 3D World + Bowser's Fury", "Aventura", "Nintendo", 11);
		juegos[1] = new Videojuego("Kirby and The Forgotten Land", "Aventura, Mundo Libre", "Hal Laboratory INC.", 15);
		juegos[2] = new Videojuego("Dragon Ball Fighters Z", "Lucha", "Bandai Namco", 12);
		juegos[3] = new Videojuego("Super Smash Bros Ultimate", "Lucha", "Sora LTD.", 44);
		juegos[4] = new Videojuego("Splatoon", "Juego de disparos en tercera persona", "Nintendo", 4);
		
		// 3. Entregar algunas series y videojuegos
		series[1].entregar();
		series[2].entregar();
		series[4].entregar();
		juegos[0].entregar();
		juegos[3].entregar();
		
		// 4. Contar y mostrar el total de Series y Videojuegos entregados.
		for(i = 0, totalSeriesEntregadas = 0, totalJuegosEntregados = 0; i < series.length; i++) {
			// Comprobar si la "Serie" se ha entregado
			if(series[i].isEntregado()) { // Si la serie está entregada, el contador aumentará en +1.
				totalSeriesEntregadas++;
			} // Fin IF
			
			// Comprobar si el "Videojuego" se ha entregado
			if(juegos[i].isEntregado()) {
				totalJuegosEntregados++;
			} // Fin IF
		} // Fin FOR
		
		// 5. Mostrar por pantalla el total de Series y juegos entregados.
		System.out.println("RESUMEN DE ENTREGADOS");
		System.out.println("--------------------------------------------------");
		System.out.println("Total de series entregadas: " + totalSeriesEntregadas);
		System.out.println("Total de videojuegos entregados: " + totalJuegosEntregados);
		System.out.println("Total: " + (totalSeriesEntregadas + totalJuegosEntregados));
	
		// 6. Averiguar cual es el juego con mas horas
		for(i = 0, pos = i, maxHoras = juegos[0].getHorasEstimadas(); i < juegos.length; i++) {
			if(juegos[i].getHorasEstimadas() > maxHoras) {
				pos = i; 
				maxHoras = juegos[i].getHorasEstimadas();
			} // Fin IF
		} // Fin FOR
		
		// 7. Mostrar por pantalla los datos del videojuego
		System.out.println("\n\nJUEGO CON MÁS HORAS");
		System.out.println("--------------------------------------------------");
		System.out.println("   - Título: " + juegos[pos].getTitulo());
		System.out.println("   - Género: " + juegos[pos].getGenero());
		System.out.println("   - Compañia: " + juegos[pos].getCompania());
		System.out.println("   - Horas estimadas: " + juegos[pos].getHorasEstimadas() + "h");
	}

}
