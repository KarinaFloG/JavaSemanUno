/**
*Clase principal del programa 
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18

*/
public class Main{
	/**
	*Método principal de la clase
	*@param args Paso de argumentos por terminal
	*/
	public static void main(String[] args) {
		/**Instanciamos cada objeto de la letra*/
		Dog dg = new Dog();
		Cat ct = new Cat();
		Bird bi = new Bird();
		Mouse mo = new Mouse();
		Cow co = new Cow();
		Frog fr = new Frog();
		Elephant el = new Elephant();
		Duck du = new Duck();
		Fish fi = new Fish();
		Seal se = new Seal();
		

		/**Imprimimos los metodos de cada objeto*/

		System.out.println("\t ♪  ♫  ♬");

		System.out.print("\n Dog goes "); dg.dice();
		System.out.print("\n Cat goes "); ct.dice();
		System.out.print("\n Bird goes "); bi.dice();
		System.out.print("\n And mouse goes "); mo.dice();
		System.out.print("\n Cow goes "); co.dice();
		System.out.print("\n Frog goes "); fr.dice();
		System.out.print("\n And the elephant goes "); el.dice();
		System.out.print("\n Ducks says "); du.dice();
		System.out.print("\n And fish go "); fi.dice();
		System.out.print("\n And the seal goes "); se.dice();

		System.out.println("\t ♪  ♫  ♬");
		

	}
}