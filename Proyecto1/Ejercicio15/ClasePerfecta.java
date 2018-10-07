/**
*Clase perfecta que reescribe todos los métodos de Object 
*Abstraemos un objeto Prebe 
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18 
*/
public class ClasePerfecta<T> extends Object{
	//Atributos de clase
	private int numPrebe;
	private String nombre;
	private int cont = 0;
	private T generico;

	/**
	*Setter para el num de prebe
	*@param num Numero de prebe
	*/
	public void setNumPrebe(int num){
		this.numPrebe = num;
	}	

	/**
	*Getter para el numero de prebe
	*@return Numero de prebe
	*/
	public int getNumPrebe(){
		return numPrebe;
	}

	/**
	*Setter para el nombre del prebe
	*@param nombre Nombre del prebe
	*/
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	/**
	*Getter para el nombre del prebe
	*@return Nombre del prebe
	*/
	public String getNombre(){
		return nombre;
	}

	/**
	*Getter para el contador
	*@return Contador
	*/
	public int getContador(){
		return cont;
	}

	/**
	*Setter para el dato generico
	*@param generico Dato generico
	*/
	public void setGenerico(T generico){
		this.generico = generico;
	}

	/**
	*Getter para el dato generico
	*@return Dato generico
	*/
	public T getGenerico(){
		return generico;
	}

	/**
	*Constructor vacio
	*/
	ClasePerfecta(){
		cont++;
	}

	/**
	*Constructor con parametros
	*@param nombre Nombre del prebe
	*@param numPrebe Numero del prebe
	*/
	ClasePerfecta(String nombre, int numPrebe){
		this.nombre = nombre;
		this.numPrebe = numPrebe;
		cont++;
	}

	/**
	*Método Generico
	*@return Cadena de texto
	*/
	public String metodoGenerico(){
		return "Este es un método generico";
	}

	@Override
	/**
	*Sobre escritura del toString
	*@return Cadena de texto
	*/
	public String toString(){
		return "Hola soy " + getNombre() + " y mi numero de prebe es " + getNumPrebe();
	}

	//@Override
	/**
	*Sobre escritura del método equals
	*@return Un booleano
	*/
	public boolean equals(int n){
		if(n == 2){
			return true;
		}
		return false;
	}

	@Override
	/**
	*Sobre escritura del método clone
	*@return Un objeto
	*/
	public Object clone(){
		return new Object();
	}

	//Método final (No puede sobreescribirse)
	//Devuelve un objeto class al que se le puede pedir informacion sobre la clase 
	//public final Class<> getClass(){}

	/**
	*Sobre escritura del método hash code
	*@return El contador que aumenta cada vez que se crea un objeto de la clase
	*/
	@Override
	public int hashCode(){
		return getContador();
	}

	//Método final(No puede sobreescribirse)
	//public final void notify()
	//Despierta un solo hilo que está esperando en el monitor de este objeto


	//Método final(No puede sobreescribirse)
	//public final void notifyAll()
	//Despierta todos los hilos que están esperando 
	//en el monitor de este objeto. 

	//Método final(No puede sobreescribirse)
	//public final void wait(long timeout)
	//Hace que el subproceso actual espere hasta que otro 
	//subproceso invoque el método notify () o el método notifyAll () 

	//Método final(No puede sobreescribirse)
	//public final void wait(long timeout,int nano)
	//Hace que el subproceso actual espere hasta que otro 
	//subproceso invoque el método notify () o el método notifyAll () 


	//Método final(No puede sobreescribirse)
	//public final void wait()
	//Hace que el subproceso actual espere hasta que otro 
	//subproceso invoque el método notify () o el método notifyAll () 

}