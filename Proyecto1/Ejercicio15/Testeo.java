import java.util.ArrayList;
import java.util.Arrays;

/**
*Clase principal
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18 
*/

public class Testeo{
	/**
	*Método principal de la clase
	*@param args Paso de parametros por terminal
	*/
	public static void main(String[] args){
		ClasePerfecta<Object> arreglo = new ClasePerfecta<Object>();
		ArrayList<ClasePerfecta> arreglo2 = new ArrayList<ClasePerfecta>();
		int indice = 0;

		for(int i = 0; i < 5; i++ ){
			arreglo2.add(new ClasePerfecta());
		}
		int tam = arreglo2.size();

		arreglo.clone();
		arreglo.equals(2);
		arreglo.toString();
		arreglo.metodoGenerico();
		arreglo.hashCode();

		arreglo2.get(4).setNumPrebe(10);
		arreglo2.get(1).setNumPrebe(17);
		arreglo2.get(3).setNumPrebe(9);
		arreglo2.get(0).setNumPrebe(24);

		int [] arrayChido = new int[tam];
		for(ClasePerfecta n: arreglo2){
			arrayChido[indice] = n.getNumPrebe();
			indice++;
		}

		Arrays.sort(arrayChido);
		System.out.println("El arreglo ordenado por num de prebe es: ");
		for(int j = 1; j < 5; j++){
			System.out.println(arrayChido[j]);
		}

	}
}