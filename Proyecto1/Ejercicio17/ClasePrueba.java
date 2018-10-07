/**
*Clase prueba
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

//La linea comentada genera un error porque no se puede heredar de ClaseInservible
//public class ClasePrueba extends ClaseInservible{
public class ClasePrueba{

	/**
	*Método principal de la clase
	*@param args Paso de parametros por terminal
	*/
	public static void main(String[] args){

		//La linea comentada genera un error porque no se puede instanciar de ClaseInservible 
		//ClaseInservible error = new ClaseInservible();
		System.out.println("El atributo estatico de la clase ClaseInservivble es: " + ClaseInservible.getNumero());
	}
}