/**
*Clase inservible 
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

//FINAL sirve para que esta clase no se pueda extender, es decir que no tenga subclases
//ABSTRACT sirve para que no  se creen objetos de esta clase
//Al crear la clase ya estamos heredando de Object porque en Java todas las clases heredan de Object 
public final class ClaseInservible{
	static int numero = 3;
	private String nombre = "Esta es la clase inservible";

	//Como una clase no puede ser definida como final y abstracta 
	//Volver privado el constructor de la clase permite que no se pueda instanciar en cualquier otra clase
	/**
	*Constructor vacio y privado
	*/
	private ClaseInservible(){

	}

	/**
	*Getter para el nombre
	*@return Nombre de la clase
	*/
	public String getNombre(){
		return nombre;
	}

	/**
	*Getter para el numero
	*@return Numero de la clase 
	*/
	public static int getNumero(){
		return numero;
	}

} 