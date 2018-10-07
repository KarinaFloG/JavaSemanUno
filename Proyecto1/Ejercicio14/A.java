/**
*A y sus pruebas
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18

*/


package a;

/**
*Clase A, contiene cuatro atributos con los cuatro modificadores de acceso existentes
*/
public class A{
	private int att1 = 1;
	public int att2 = 2;
	protected int att3 = 3;
	int att4 = 4;

	/**
	*Método principal de la clase
	*@param args Paso de parametros por terminal
	*/
	public static void main(String[] args) {
		A pruebaA = new A();
		System.out.println(pruebaA.att1); //Prueba exitosa, att1 visible.
		System.out.println(pruebaA.att2); //Prueba exitosa, att2 visible.
		System.out.println(pruebaA.att3); //Prueba exitosa, att3 visible.
		System.out.println(pruebaA.att4); //Prueba exitosa, att4 visible.
	}
}