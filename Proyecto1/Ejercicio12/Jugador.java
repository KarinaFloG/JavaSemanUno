import java.util.ArrayList;

/**
*Clase jugador 
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class Jugador{
	//Parametros de clase
	private String nombre;
	private ArrayList<Pokemon> pokemones = new ArrayList<Pokemon>();

	/**
	*Constructor vacio
	*/
	Jugador(){

	}

	/**
	*Sobre carga de  constructor
	*@param nombre Nombre del jugador
	*/
	Jugador(String nombre){
		this.nombre = nombre;
	}

	/**
	*Setter para el nombre
	*@param nombre Nombre del jugador
	*/
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	/**
	*Getter para el nombre
	*@return Nombre del jugador
	*/
	public String getNombre(){
		return nombre;
	}

	/**
	*Agrega un pokemon a la lista del jugador
	*@param pok Pokemon
	*/
	public void getPokemon(Pokemon pok){
		pokemones.add(pok);
	}

	/**
	*Imprime los pokemones dle jugador
	*/
	public void getPokemones(){
		for(int i = 0; i < pokemones.size(); i++){
			System.out.println(pokemones.get(i).getNombre());
		}
	}
}