/**
*Clase Persona que define sus atributos y métodos
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class Persona{
	//Atributos de clase
	static int contador = 0;
	private String nombre;
	private String telefono;
	private Mascota mascota;
	private String nombreMascota;

	/**
	*Sobrecarga del constructor
	*/
	Persona(){
		mascota = new Mascota();
		contador++;
	}

	/**
	*Sobrecarga del constructor
	*@param nombre Nombre de la persona
	*@param telefono Telefono de la persona
	*/
	Persona(String nombre, String telefono){
		setNombre(nombre);
		setTelefono(telefono);
		mascota = new Mascota();
		contador++;
	}

	/**
	*Setter para el nombre de la mascota
	*@param nomMascota Nombre de la mascota
	*/
	public void setMascota(String nomMascota){
		mascota.setNombre(nomMascota);
	}

	/**Setter para el nombre de la persona
	*@param nombre Nombre de la persona
	*/
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	/**
	*Getter para el nombre
	*@return Nombre de la persona
	*/
	public String getNombre(){
		return nombre;	
	}

	/**
	*Setter para el telefono de la persona
	*@param telefono Telefono de la persona
	*/
	public void setTelefono(String telefono){
		this.telefono = telefono;
	}

	/**
	*Getter para el telefono
	*@return Telefono de la persona
	*/
	public String getTelefono(){
		return telefono;
	}

	/**
	*Getter para el nombre de la mascota
	*@return Nombre de la mascota 
	*/
	public String getMascota(){
		return mascota.getNombre();
	}
}