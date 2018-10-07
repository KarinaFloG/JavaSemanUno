import java.util.Scanner;

/**
*Clase Principal 
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class BloquesDeAgua{

	/**
	*Método principal de la clase
	*@param args Paso de argumentos por terminal
	*/
	public static void main(String[] args){
	/**Definimos los atributos que usaremos en el programa*/
	Scanner teclado = new Scanner(System.in);
	int suma=0;
	System.out.print("Introduce la altura: ");
	int altura= teclado.nextInt();
	System.out.print("Introduce la longitud: ");
	int longitud= teclado.nextInt();

	/**Definimos los arreglos*/
	String[][] arreglo = new String[altura][longitud]; 
	int[]datos= new int [longitud];

	/**Leemos los datos para los bloques*/	
	for(int i=0; i<longitud; i++){
		int j=i+1;
		System.out.print("Introduce los bloques en la posicion "+j+" del arreglo: ");
		datos[i] = teclado.nextInt();
		
	}

	for(int w=0;w<longitud;w++){
		for(int r=0;r<altura;r++){
			if(datos[w]<altura-r){
				arreglo[r][w]=" ";
			}
			
			else{
				arreglo[r][w]="H";
			}
		}
	}

	for(int t=1; t<longitud; t++){ 
		for(int u=0;u<altura;u++){ 

		if(t!=1){ 
			if(arreglo[u][t]=="H"){ 

				
				int b=0;
				for(int g=t-1;g>=0;g--){
				
				if(b==0){
				if(arreglo[u][g]=="H"){
					for(int f=g+1; f<t;f++){
						arreglo[u][f]="a";
						suma++;
					}
					b=b+1;
				}

				}

				}
			
			}
		}
	}
}

	for(int k=0;k<altura;k++){
		System.out.print("\n\t ||-> ");
		for(int m=0;m<longitud;m++){
			if(m==0){
					System.out.print("\t"+arreglo[k][m]);
					System.out.print("  ");
			} else{
			System.out.print(arreglo[k][m]);
			System.out.print("  ");
		}
	}

	}
	System.out.println("\n\nH = Bloques");
	System.out.println("a = Bloques de agua");
	System.out.println("Bloques de agua: "+suma+"\n");


	}
}

