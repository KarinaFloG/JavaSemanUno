import java.util.ArrayList;

/**
*Clase pokemon
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class Pokemon{
	//Atributos de clase
	private String nombre;
	private int vida;
	private ArrayList<String> tipo = new ArrayList();
	private int nivel;
	private int ataqueFisico;
	private int ataqueEspecial;
	private int defensaFisica;
	private int defensaEspecial;
	private int velocidad;

	/**
	*Constructor con parametros
	*@param nombre Nombre
	*@param tipo Tipo
	*@param nivel Nivel
	*@param ataqueFisico ataque fisico
	*@param ataqueEspecial ataque especial
	*@param defensaFisica Defenda fisica
	*@param defensaEspecial Defensa especial
	*@param velocidad velocidad
	*/
	Pokemon(String nombre,int vida, ArrayList<String> tipo, int nivel, int ataqueFisico, int ataqueEspecial, int defensaFisica, int defensaEspecial, int velocidad){
		setNombre(nombre);
		setVida(vida);
		setTipo(tipo);
		setNivel(nivel);
		setAtaqueFisico(ataqueFisico);
		setAtaqueEspecial(ataqueEspecial);
		setDefensaFisica(defensaFisica);
		setDefensaEspecial(defensaEspecial);
		setVelocidad(velocidad);
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setVida(int vida){
		this.vida = vida;
	}

	public int getVida(){
		return vida;
	}

	public void setTipo(ArrayList<String> tipo){
		this.tipo = tipo;
	}

	public void getTipo(){
		for(int i = 0; i < tipo.size(); i++){
			System.out.println(tipo.get(i));
		}
	}

	/**
	*Setter para en nivel
	*@param nivel Nicel
	*/
	public void setNivel(int nivel){
		this.nivel = nivel;
	}

	/**
	*Getter para en nivel
	*@return nivel
	*/
	public int getNivel(){
		return nivel;
	}

	/**
	*Setter para el ataque fisia
	*@param ataqueFisico ataque 
	*/
	public void setAtaqueFisico(int ataqueFisico){
		this.ataqueFisico = ataqueFisico;
	}

	/**
	*Getter para el ataque fisia
	*@return ataque 
	*/
	public int getAtaqueFisico(){
		return ataqueFisico;
	}

	/**
	*Setter para el ataque especial
	*@param ataqueEspecial ataque 
	*/
	public void setAtaqueEspecial(int ataqueEspecial){
		this.ataqueEspecial = ataqueEspecial;
	}

	/**
	*Getter para el ataque 
	*@return ataque 
	*/
	public int getAtaqueEspecial(){
		return ataqueEspecial;
	}

	/**
	*Setter para defensa fisica
	*@param defensaFisica defensa 
	*/
	public void setDefensaFisica(int defensaFisica){
		this.defensaFisica = defensaFisica;
	}

	/**
	*Getter para la defensa fisica
	*@return defensa fiscia
	*/
	public int getDefensaFisica(){
		return defensaFisica;
	}

	/**
	*Setter para defensa especial
	*@param defensaEspecial defensa 
	*/
	public void setDefensaEspecial(int defensaEspecial){
		this.defensaEspecial = defensaEspecial;
	}

	/**
	*Getter para el defensa especial
	*@return defensa
	*/
	public int getDefensaEspecial(){
		return defensaEspecial;
	}

	/**
	*Setter para velocidad
	*@param velocidad velocidad 
	*/
	public void setVelocidad(int velocidad){
		this.velocidad = velocidad;
	}

	/**
	*Getter para velocidad
	*@return velocidad 
	*/
	public int getVelocidad(){
		return velocidad;
	}

}