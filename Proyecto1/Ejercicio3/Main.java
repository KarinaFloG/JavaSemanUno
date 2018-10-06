/**
*Clase principal
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class Main{
	/**
	*Método principal
	*@param args Cadena de entrada 
	*/
	public static void main(String[] args){
		AlumnoIPN alumno1 = new AlumnoIPN("Juan","Medicina",22);
		AlumnoUNAM alumno2 = new AlumnoUNAM("Fernando","Informatica",20);
		Prebe alumno3 = new Prebe("Poli","Info",20);
		alumno2.setHorasSuenio(8);

		System.out.println("\n****Informacion del alumno 1****");
		alumno1.nombre();
		alumno1.institucion();
		alumno1.carrera();
		alumno1.noSoyChido();


		System.out.println("\n****Informacion del alumno 2****");
		alumno2.nombre();
		alumno2.institucion();
		alumno2.carrera();
		alumno2.soyChido();

		System.out.println("\n");
		System.out.println("\n****Informacion del alumno 3****");
		alumno3.nombre();
		alumno3.institucion();
		alumno3.carrera();
		alumno3.soyChido();
		alumno3.zombie();
	}
}