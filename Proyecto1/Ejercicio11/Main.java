import java.util.Scanner;
import java.util.ArrayList;

/**
*Clase Principal del programa
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/
public class Main{
	/**
	*Método para la impresión del menú principal
	*/
	public static void menuPrincipal(){
		System.out.println("\n1)Calcular determinantes");
		System.out.println("2)Salir");
	}

	/**
	*Método para la función principal
	*@param args Recibe atributos por linea de comandos
	*/
	public static void main(String[] args){
		Boolean bandera = true;
		int opcion, elemento, tamanio;
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Matriz matriz;
		double determinante;

		do{	
			System.out.println("\t***Sistema de calculo de determinantes***");
			menuPrincipal();
			System.out.println("Elige una opcion: ");
			opcion = entrada.nextInt();
			
			switch(opcion){
				case 1:
					System.out.println("Ingresa el tamanio de la matriz (nxn): ");
					tamanio = entrada2.nextInt();
					matriz = new Matriz(tamanio);
					matriz.llenarMatriz();
					determinante = matriz.calcularDeterminante(matriz.getMatriz());
					System.out.println("El determinante de la matriz es: " + determinante);
				break;

				case 2:
					System.out.println("Hasta luego...");
					bandera = false;
				break;

				default:
					System.out.println("Opcion incorrecta");
				break;
			}
		}while(bandera == true);


	}
}