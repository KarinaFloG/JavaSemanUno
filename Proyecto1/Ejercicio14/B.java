package a;
/**
*Clase B herada de A
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18

*/

public class B extends A {

	/**
	*Método principal de la clase
	*@param args Paso de parametros por terminal
	*/
	public static void main(String[] args) {
		B pruebaB = new B();
		//System.out.println(pruebaB.att1); //prueba fallida, no hay acceso
		//System.out.println(pruebaB.att2); //prueba exitosa, es visible
		//System.out.println(pruebaB.att3); //prueba exitosa, se puede acceder
		//System.out.println(pruebaB.att4); //prueba exitosa, se puede acceder
	}
}