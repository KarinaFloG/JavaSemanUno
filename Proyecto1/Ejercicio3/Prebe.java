/**
*Esta clase implementa la interfaz Alumno para una clase Prebe
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class Prebe implements Alumno{
	//Atributos de clase
	private String nombre;
	final String institucion = "UNAM";
	private String carrera;
	private String prebeHouse = "lugar de la diversion cuando hay que entregar proyectos";
	private int edad;
	private int horasDeSuenio;

	/**
	*Sobrecarga de constructor
	*/
	Prebe(String nombre, String carrera, int edad){
		setNombre(nombre);
		setCarrera(carrera);
		setEdad(edad);

	}

	/**
	*Setter para el nombre
	*@param nombre Nombre del alumno
	*/
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	/**
	*Getter para el nombre
	*@return Nombre del alumno
	*/
	public String getNombre(){
		return nombre;
	}


	/**
	*Getter para la institucion
	*@return La institución en donde estudia el alumno
	*/
	public String getInstitucion(){
		return institucion;
	}

	/**
	*Setter para la carrera
	*@param carrera Carrera que esta estudiand el alumno
	*/
	public void setCarrera(String carrera){
		this.carrera = carrera;
	}

	/**
	*Getter para la carrera
	*@return La carrera que está estudiando el alumno
	*/
	public String getCarrera(){
		return carrera;
	}

	/**
	*Setter para la edad
	*@param edad Edad del alumno
	*/
	public void setEdad(int edad){
		this.edad = edad;
	}


	/**
	*Getter para la edad
	*@return Edad del alumno
	*/
	public int getEdad(){
		return edad;
	}


	/**
	*Getter para las horas de sueño
	*@return Horas de sueño del estudiante
	*/
	public int getHorasDeSuenio(){
		return horasDeSuenio;
	}


	/**
	*Getter para la cadena PrebeHouse
	*@return Cadena de texto
	*/
	public String getPrebeHouse(){
		return prebeHouse;
	}


	/**
	*Método que imprime saludo y nombre del alumno
	*/
	public void nombre(){
		System.out.println("Hola, mi nombre es " + getNombre());
	}

	/**
	*Método que imprime la escuela en donde estudia el alumno con formato
	*/
	public void institucion(){
		System.out.println("Estudio en la escuela " + getInstitucion());
	}

	/**
	*Método que imprime la carrera del alumno con formato
	*/
	public void carrera(){
		System.out.println("La carrera de " + getCarrera());
	}

	/**
	*Método que imprime una cadena
	*/
	public void soyChido(){
		System.out.println("Soy el mejor por ser de la UNAM, pero le faltaba un poco de adrenalina a mi vida");
		System.out.println("Asi que decidi ser prebe de PROTECO, porque UNICA apesta");
	}

	/**
	*Método que imprime las horas de sueño con formato
	*/
	public void zombie(){
		System.out.println("Ahora mis horas de suenio son: " + getHorasDeSuenio());
		System.out.println("Pero todo es mas divertido cuando estoy en la prebe house " + getPrebeHouse());
	}
}