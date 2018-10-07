
/**
*Clase principal del programa 
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/



import java.util.Scanner;
/**Definimos la clase Main que tendrá el método main*/
public class Main{
	public static void main(String[] args) {
		/** Creamos las instancias y las inicializamos */
		Scanner sc = new Scanner(System.in);
		char a;
		AnimalCarnivoro[] animalesc = new AnimalCarnivoro[3];
		animalesc[0] = new Tigre();
		animalesc[1] = new Leon();
		animalesc[2] = new Puma();

		AnimalHerbivoro[] animalesh = new AnimalHerbivoro[3];
		animalesh[0] = new Antilope();
		animalesh[1] = new Cebra();
		animalesh[2] = new Venado();

		System.out.println("¿Qué animales quieres ver carnalito? Sin compromiso ni nada cainal");
		System.out.println("(C) Carnívoros\t(H) Herbívoros");
		a = sc.next().charAt(0);
	

	/** Se pedirá al usuario tteclear la opcion C/H 
		Las siguientes lineas permiten que sin importar si lo escribe ocn minuscula o mayuscula, se ejecute
	*/
		if(a=='c'){
			a = 'C';
		} else if (a=='h'){
			a = 'H';
		}
		/**Se mandan a llamar los metodos de la clase de animal especificad*/
		if(a =='C'){
			for (int i=0;i<animalesc.length;i++ ) {
				animalesc[i].miNombre();
				animalesc[i].hacerSonido();
				animalesc[i].jugar();
				animalesc[i].miComida();
				System.out.println();
			}
		}

		else if (a =='H'){
			for (int i=0;i<animalesh.length;i++ ) {
				animalesh[i].miNombre();
				animalesh[i].hacerSonido();
				animalesh[i].jugar();
				animalesh[i].miComida();
				System.out.println();
			}
		}


	}
}