/**
*Clase coche, con la ABSTRACCION es que definiremos sus atributos y metodos usando nuestra percepcion de la realidad.
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class cel{
	
	public String marca;
	public int apps;
	
/** 
*Ahora con el ENCAPSULAMIENTO restringimo el acceso a ciertos atributos y/o métodos
*que consideremos necesario,
*/
	public int costo;

	/**
	*Métodos para imprimir en pantalla
	*/
	public void avanza(){
		System.out.println("El coche se avanzó");
	}

	/** 
	*Definimos el método constructor que será con el 
	*que instanciemos los valores que recibirá cada objeto
	*coche que creemos.
	*@param marca Marca del telefono
	*@param apps Apps del telefono
	*@param costo Costo del telefono
	*/
	public cel(String marca, int apps, int costo){
		this.marca = marca;
		this.apps = apps;
		this.costo = costo;
	}

	/**
	*Setter para el vosto
	*@param costo Costo del telefono
	*/
	public void setCosto(int costo){
		this.costo = costo;
	}

	/**
	*Getter para el costo
	*@return Costo
	*/
	public int getCosto(){
		return costo;
	}

	/**
	*Impresión en pantalla de todos los atributos del celular
	*@return Cadena de texto
	*/

	public String mostrarInformacion(){
		return "marca: "+marca+"\napps: "+apps+"\nCosto: $"+costo;
	}

}
