/**
*Esta clase implementa la interfaz Alumno para una clase AlumnoIPN
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/
public class AlumnoIPN implements Alumno{
	//Atributos de clase
	private String nombre;
	final String institucion = "IPN";
	private String carrera;
	private int edad;

	/**
	*Sobrecarga de constructor
	*/
	AlumnoIPN(String nombre, String carrera, int edad){
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
	*Método que imprime saludo y nombre del alumno
	*/
	public void nombre(){
		System.out.println("Hola, mi nombre es " + nombre);
	}

	/**
	*Método que imprime la escuela en donde estudia el alumno con formato
	*/
	public void institucion(){
		System.out.println("Estudio en la escuela " + institucion);
	}

	/**
	*Método que imprime la carrera del alumno con formato
	*/
	public void carrera(){
		System.out.println("La carrera de " + carrera);
	}
	
	/**
	*Método que imprime una cadena
	*/
	public void noSoyChido(){
		System.out.println("No soy tan chido como los de la UNAM");
	}

}