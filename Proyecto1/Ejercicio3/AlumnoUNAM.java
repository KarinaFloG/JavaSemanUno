/**
*Esta clase implementa la interfaz Alumno para una clase AlumnoUNAM
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class AlumnoUNAM implements Alumno{
	//Atributos de clase
	private String nombre;
	final String institucion = "UNAM";
	private String carrera;
	private int edad;
	private int horasDeSuenio;

	/**
	*Sobrecarga de constructor
	*/
	AlumnoUNAM(String nombre,String carrera, int edad){
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
	*Setter para las horas de sueño
	*@param horasDeSuenio Horas de sueño del estudiante
	*/
	public void setHorasSuenio(int horasDeSuenio){
		this.horasDeSuenio = horasDeSuenio;
	}

	/**
	*Getter para las horas de sueño
	*@return Horas de sueño del estudiante
	*/
	public int getHorasDeSuenio(){
		return horasDeSuenio;
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
		System.out.println("Soy el mejor por ser de la UNAM, pero le falta un poco de adrenalina a mi vida");
		System.out.println("Al dia duermo " + getHorasDeSuenio() + " horas Que aburrido!");
	}
}