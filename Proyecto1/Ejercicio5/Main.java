import java.util.Scanner;

/**
*Esta clase define los atributos de una fraccion y sus métodos 
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class Main{
	/**
	*Método principal
	*@param args Cadena de entrada por terminal 
	*/
	public static void main(String[] args){
		int numerador, denominador, opcion;
		boolean bandera = true;
		Fraccion num = new Fraccion();
		Scanner entrada = new Scanner(System.in);

		do{
			System.out.println("\t***Bienvenido a la calculadora de reduccion de fracciones***");
			System.out.println("Ingresa el numerador: ");
			numerador = entrada.nextInt();
			System.out.println("Ingresa el denominador: ");
			denominador = entrada.nextInt();

			num.setNumerador(numerador);
			num.setDenominador(denominador);
			num.reduccionFracc();
			System.out.println("\n--La fraccion reducida es: ");	
			System.out.println(num.getNumeradorRed() + "/" + num.getDenominadorRed());

			System.out.println("Deseas hacer de nuevo una operacion? 1/SI 0/NO");
			opcion = entrada.nextInt();

			if(opcion == 1){
				bandera = true;
			}else{
				bandera = false;
			}

		}while(bandera == true);
	}

}