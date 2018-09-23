import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PruebaMatrices{
//	//Para leer datos del teclado
//	Scanner sc = new Scanner(System.in);

		public static int menuOpciones()
		{
 		 //Para leer datos del teclado
	        Scanner sc = new Scanner(System.in);


	      	int opcion;

        	System.out.println();
        	System.out.println("\n\t*****CALCULADORA DE MATRICES*****");
        	System.out.println("\t***** 1) Sumar              *****");
        	System.out.println("\t***** 2) Restar             *****");
        	System.out.println("\t***** 3) Multiplicación     *****");
        	System.out.println("\t***** 4) Transposición      *****");
        	System.out.println("\t***** 5) Inversa            *****");
        	System.out.println("\t***** 6) Cambiar valores    *****");
        	System.out.println("\t***** 7) Salir              *****");
        	System.out.print("\nElige tu opción: ");
        	opcion = sc.nextInt();

        	return opcion;
		}

		public static void main(String[] args){
//	  		 Para leer datos del teclado
		        Scanner sc = new Scanner(System.in);
			int opcion;
			int booleano = 1;
			int elementos;
			int valor;

			System.out.println("\n***NOTA: LAS MATRICES QUE INGRESES DEBEN DE SER CUADRADAS***");
			System.out.println("\nDame la cantidad de elementos de las matrices: ");
			elementos = sc.nextInt();
			CalculadoraMatrices objeto = new CalculadoraMatrices(elementos);

			//Declaracion de listas dobles para las matrices
			List<List<Integer>> matriz1 = new ArrayList<List<Integer>>();
			List<List<Integer>> matriz2 = new ArrayList<List<Integer>>();
 			List<List<Integer>> resultante = new ArrayList<List<Integer>>();
			//Para crear columnas en las filas
			for(int i = 0; i < elementos; i++){
				matriz1.add(new ArrayList<Integer>());
				matriz2.add(new ArrayList<Integer>());
				resultante.add(new ArrayList<Integer>());
			}

			System.out.println("\nDame los elementos de la matriz 1: ");
			for(int i = 0; i < elementos; i++){
				for(int j = 0; j < elementos; j++ ){
					System.out.println("\n\tDame el elemento [" + i + "] [" + j + "]");
					valor = sc.nextInt();
					matriz1.get(i).add(valor);
				}
			}

			System.out.println("\nDame los elementos de la matriz 2: ");
			for(int i = 0; i < elementos; i++){
				for(int j = 0; j < elementos; j++ ){
					System.out.println("\n\tDame el elemento [" + i + "] [" + j + "]");
					valor = sc.nextInt();
					matriz2.get(i).add(valor);
				}
			}

			//Imprime la smatrices solamente para prueba
			System.out.println("**********************PRUEBA*********************");
			for(int i = 0; i < elementos; i ++){
				for(int j = 0; j < elementos; j++){
					System.out.println(matriz1.get(i).get(j));
				}
			}


			do{
				opcion = menuOpciones();
				switch(opcion){
					case 1:
 	                      			resultante = objeto.suma(matriz1, matriz2);
					 	System.out.println("\n**La suma de matrices es: \n");
						System.out.println("YA NAMAMES X2: " + resultante.get(0).size());
                      			 	for(int i = 0; i <= (resultante.get(0).size())/2; i++){
                               				 for(int j = 0; j <= (resultante.get(0).size())/2; j++ ){
                                      		 	System.out.println(resultante.get(i).get(j));
	                               		 	 }
						}
//						resultante.clear();
					break;


					case 2:
						 resultante = objeto.resta(matriz1, matriz2);
                                        	 System.out.println("\n**La resta de matrices es: \n");

                                         	for(int i = 0; i < (resultante.get(0).size())/2; i++){
                                                	 for(int j = 0; j < (resultante.get(0).size())/2; j++ ){
                                                 		System.out.println(resultante.get(i).get(j));
                                                 	 }
                                       	 	}

/*						System.out.println(resultante.get(0));
						System.out.println("******" + resultante.get(0).get(0));
                                                System.out.println("******" + resultante.get(1).get(0));
                                                System.out.println("******" + resultante.get(2).get(0));
                                                System.out.println("******" + resultante.get(3).get(0));
                                                System.out.println("------" + resultante.get(0).get(0));
                                                System.out.println("------" + resultante.get(0).get(1));
                                                System.out.println("------" + resultante.get(0).get(2));
                                                System.out.println("------" + resultante.get(0).get(3)); */ 
//						resultante.clear();

					break;

					case 3:
/*						resultante = objeto.multiplicacion(matriz1, matriz2);
						System.out.println("\n**La multiplicacion de matrices es: \n");

                                                for(int i = 0; i < (resultante.get(0).size())/2; i++){
                                                         for(int j = 0; j < (resultante.get(0).size())/2; j++ ){
                                                                System.out.println(resultante.get(i).get(j));
                                                         }
                                                }
						resultante.clear();

					break; */

					default:
						System.out.println("Opcion incorrecta, intenta de nuevo");
					break;
				}

			}while(booleano != 0);




		}

}
