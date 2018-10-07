/**
*Clase D
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18

*/



package a;
import a.A;

/**
*Clase D que hereda de A, pero además está en un paquete distinto del de A, por ello se debe importar a.A, d elo contrario no reconocerá la clase A.
*/
public class D extends A{

	/**
	*Método principal de la clase
	*@param args Paso de parametros por terminal
	*/
	public static void main(String[] args) {
		D pruebaD = new D();
		//System.out.println(pruebaD.att1); //prueba fallida, no hay acceso
		//System.out.println(pruebaD.att2); //prueba exitosa, es visible
		//System.out.println(pruebaD.att3); //prueba exitosa, se puede acceder
		//System.out.println(pruebaD.att4); //prueba fallida, no se puede acceder
	}
}