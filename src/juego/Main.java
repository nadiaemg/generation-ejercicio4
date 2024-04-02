package juego;

import java.util.Scanner;

/*Este código funciona para jugar piedra, papel o tijeras con dos jugadores.*/

//Se genera una clase Main con un método main ejecutable, dentro del proyecto PruebaTecnica.
public class Main {

	public static void main(String[] args) {
		// Se importa la clase Scanner y se cambia el nombre del objeto por "in".
		Scanner in = new Scanner(System.in);

		// En ambos casos se cambia el nombre de la variable para que fueran más descriptivas

		// Caso 1. Turno del primer jugador
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String jugador1 = in.nextLine().toLowerCase();

		// Caso 2. Turno del segundo jugador
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		// Se borra el segundo objeto de scanner
		String jugador2 = in.nextLine().toLowerCase();
		
		// Verificación
		System.out.println(jugador1 + " vs " + jugador2);

		// Se declaran contadores para ambos jugadores
		int contadorJugador1 = 0;
		int contadorJugador2 = 0;

		// En todo el bloque de código se cambia "==" por .equals() para comparar dos cadenas
		if (jugador1.equals(jugador2)) {
			System.out.println("¡Empate!");
		} else {
			// Se agregan condiciones del segundo jugador para validar los tres casos: piedra, papel y tijeras.
			switch (jugador1) {
			case "piedra":
				if (jugador2.equals("tijeras")) {
					contadorJugador1 += 1;
				} else if (jugador2.equals("papel")) {
					contadorJugador2 += 1;
				}
				break;

			case "papel":
				if (jugador2.equals("piedra")) {
					contadorJugador1 += 1;
				} else if (jugador2.equals("tijeras")) {
					contadorJugador2 += 1;
				}
				break;

			case "tijeras":
				if (jugador2.equals("papel")) {
					contadorJugador1 += 1;
				} else if (jugador2.equals("piedra")) {
					contadorJugador2 += 1;
				}
				break;
			}
			
			// Verificar contador y mostrar al ganador
			if (contadorJugador1 > contadorJugador2) {
				System.out.println("¡El jugador 1 gana con " + jugador1 + "!");
			} else if (contadorJugador1 < contadorJugador2) {
				System.out.println("¡El jugador 2 gana con " + jugador2  + "!");
			}
		}

		in.close();

	}

}
