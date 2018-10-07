/**
*Clase principañ juego
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/
public class Juego{
	/**
	*Método principal
	*@param args Paso de parametros desde linea de comandos 
	*/
	public static void main(String[] args){

			System.out.println("\t***Inicia la batalla pokemon***");
			Batalla batalla1 = new Batalla();
			System.out.println("Se ha creado el primer jugador...");
			Jugador jugador1 = new Jugador();
			System.out.println("Se ha creado el segundo jugador...");
			Jugador jugador2 = new Jugador();
			batalla1.mostrarIniciales();
			batalla1.mostrarElegir();
			batalla1.setJugador(jugador1);
			batalla1.setJugador(jugador2);



	}
}