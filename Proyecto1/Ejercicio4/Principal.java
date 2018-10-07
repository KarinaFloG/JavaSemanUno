/**
*En nuestra clase principal
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18 
*/
public class Principal{

	/**
	*Método princi´pal de la clase principal
	*@param args Recibe argumentos por terminal
	*/
	public static void main(String[] args) {
		//El polimorfismo se da cuando a través de la clase cel (clase padre)
		//podemos crear un objeto que se defina como la clase hija
		cel fon = new cel("Apol", 500000, 1000000);
		cel fon2 = new aifon("aifon", 50000, 800000);

		//Imprimimos los valores de nuestros objetos
		System.out.println("Los datos de la clase cel son");
		System.out.println(fon.mostrarInformacion());
		System.out.println();
		System.out.println("Los datos de la clase aifon son");
		System.out.println(fon2.mostrarInformacion());
		System.out.println("Costo: $"+fon2.getCosto());
		System.out.println();


	}
}
