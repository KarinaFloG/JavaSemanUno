import java.util.Scanner;

/**
*Clase Matriz que define sus atributos y métodos
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class Matriz{
	//Atributos de clase
	Scanner entrada = new Scanner(System.in);
	private int filas = 0;
	private int columnas = 0;
	private int matriz [][];
	private int elemento;

	/**
	*Sobrecarga de constructor
	*@param n Numero de filas y columnas de la matriz
	*/
	Matriz(int n){
		setFilas(n);
		setColumnas(n);
		matriz = new int [getFilas()][getColumnas()];

	}

	/**
	*Setter para la cantidad de filas de la matriz
	*@param filas Cantidad de filas
	*/
	public void setFilas(int filas){
		this.filas = filas;
	}

	/**
	*Getter para la cantidad de filas de la matriz
	*@return Cantidad de filas
	*/
	public int getFilas(){
		return filas;
	}

	/**
	*Setter para la cantidad de columnas de la matriz
	*@param columnas Cantidad de columnas
	*/
	public void setColumnas(int columnas){
		this.columnas = columnas;
	}

	/**
	*Getter para la cantidad de columnas de la matriz
	*@return Cantidad de columnas
	*/
	public int getColumnas(){
		return columnas;
	}

	/**
	*Getter de la matriz
	*@return Matriz
	*/
	public int[][] getMatriz(){
		return matriz;
	}

	/**
	*Método para llenar la matriz con sus elementos
	*/
	public void llenarMatriz(){
		for(int i = 0; i < getFilas(); i++){
			for (int j = 0; j < getColumnas(); j++) {
				System.out.println("Ingresa el elemento [" + i + "] [" + j + "]" );
				elemento = entrada.nextInt();
				matriz[i][j] = elemento;
			}
		}
	}

	/**
	*Método que calcula el determinante de la matriz
	*@param matriz Matriz de la que se va a calcular el determinante
	*@return Determinante de la matriz
	*/
	public double calcularDeterminante(int[][] matriz){
		double det;
    	if(matriz.length == 2)
    	{
        	det = (matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
        	return det;
    	}

    	double suma=0;

    	for(int i = 0; i < matriz.length; i++){
    		int [][] nm = new int [matriz.length-1][matriz.length-1];
        	for(int j=0; j < matriz.length; j++){
            	if(j != i){
                	for(int k = 1; k < matriz.length; k++){
                		int indice =- 1;
                		if(j < i)
                			indice = j;
                		else if( j > i)
                			indice=j-1;
                		nm[indice][k-1] = matriz[j][k];
                	}
                }//if
            }//for

        	if(i%2==0){
        		suma += matriz[i][0] * calcularDeterminante(nm);
        	}else{
        		suma -= matriz[i][0] * calcularDeterminante(nm);
    		}
    	}
    		return suma;
	}
}	