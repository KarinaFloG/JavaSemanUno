/**
*Esta clase define los atributos de una fraccion y sus métodos 
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/
public class Fraccion{
	//Atributos de clase
	private int numerador;
	private int denominador;
	private int numeradorRed;
	private int denominadorRed;
	private Boolean bandera;
	private int n;
	private int div;
	private int menor;

	/**
	*Construtor vacio
	*/
	Fraccion(){
	}

	/**
	*Sobrecarga de constructor
	*@param numerador Asignación del numerador de la fraccion
	*@param denominador Asignación del denominador de la fraccion
	*/
	Fraccion(int numerador, int denominador){
		setNumerador(numerador);
		setDenominador(denominador);
	}

	/**
	*Setter para el numerador
	*@param numerador Numerador de la fraccion
	*/
	public void setNumerador(int numerador){
		this.numerador = numerador;
	}

	/**
	*Getter para el numerdor
	*@return Numerador de la fraccion
	*/
	public int getNumerador(){
		return numerador;
	}

	/**
	*Setter para el denominador
	*@param denominador Numerador de la fraccion
	*/
	public void setDenominador(int denominador){
		this.denominador = denominador;
	}

	/**
	*Getter para el numerdor
	*@return Denominador de la fraccion
	*/
	public int getDenominador(){
		return denominador;
	}

	/**
	*Setter para el denominador reducido
	*@param denominadorRed Denominador reducido de la fraccion
	*/
	public void setDenominadorRed(int denominadorRed){
		this.denominadorRed = denominadorRed;
	}

	/**
	*Getter para el denominador reducido
	*@return Denominador reducido de la fraccion
	*/
	public int getDenominadorRed(){
		return denominadorRed;
	}

	/**
	*Setter para el numerador reducido
	*@param numeradorRed Numerador reducido de la fraccion
	*/
	public void setNumeradorRed(int numeradorRed){
		this.numeradorRed = numeradorRed;
	}

	/**
	*Getter para el numerador reducido
	*@return Numerador reducido de la fraccion
	*/
	public int getNumeradorRed(){
		return numeradorRed;
	}

	/**
	*Método para la reducción de la fracción
	*/
	public void reduccionFracc(){
		do{
			if(numerador < denominador){
				menor = numerador;
			}else{
				menor = denominador;
			}

			n = 2;
			bandera = false;

			while((n <= menor) && (bandera == false)){
				if(numerador % n == 0 && denominador % n == 0){
					div = n;
					bandera = true;
				}
				n++;
			}

			if(bandera == true){
				numerador = numerador/div;
				denominador = denominador/div;
				setNumeradorRed(numerador);
				setDenominadorRed(denominador);
				//System.out.println(numerador +  "/" + denominador);
			}
		}while(bandera == true);
	}
}