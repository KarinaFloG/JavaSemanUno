/**
*Clase Mascota que define sus atributos y métodos
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class Mascota{
	//Atributos de clase
	private String nombre;

	/**
	*Constructor vacio
	*/
	Mascota(){

	}

	/**
	*Sobrecarga del constructor
	*@param nombre Nombre de la mascota
	*/
	Mascota(String nombre){
		setNombre(nombre);
	}

	/**
	*Setter para el nombre de la mascota
	*@param nombre Nombre de la mascota
	*/
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	/**
	*Getter para el nombre
	*@return Nombre de la mascota
	*/
	public String getNombre(){
		return nombre;
	}
}