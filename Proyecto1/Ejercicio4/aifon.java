/** 
*HERENCIA
*Clase padre: Cel
*Clase hija: aifon
*Para que hija puede hacer valida la herencia del padre se utiliza "extends"
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class aifon extends cel{

	public String marca;
	/**
	*En el constructor mandamos a llamar los atributos de la clase padre y a la propia
	*@param marca  Marca
	*@param apps Apps
	*@param costo Costo
	*/
	public aifon(String marca, int apps,int costo){
		super(marca, apps, costo);
		this.marca = marca;
	}

	/**
	*Usamos el getter para obtener el atributo
	*@return Marca
	*/
	public String getMarca(){
		return marca;
	}

	/**
	*Sobre escribimos el metodo traido desde la clase padre
	*y le indicamos que muestre los datos recibidos de los atributos
	*@return Cadena de txto
	*/
	@Override
	public String mostrarInformacion(){
		return "Marca: " + marca + "\napps: " + apps + "\n Costo: " + costo;
	}



}
