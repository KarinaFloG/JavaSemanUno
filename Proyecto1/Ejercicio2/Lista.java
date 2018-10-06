import java.util.ArrayList;

/**
*Esta clase ingresa los productos y precios de las compras a la lista
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class Lista{
	//Campos de clase
	ArrayList<String> nombres = new ArrayList<String>();
	ArrayList<Integer> precios = new ArrayList<Integer>();
	private int total;

	/**
	*Setter para el nombre del producto
	*@param nombre Nombre del producto a comprar
	*/
	public void setNombre(String nombre){
		nombres.add(nombre);
	}

	/**
	*Getter para el nombre del producto
	*@param n Indice del arreglo para extraer el nombre
	*@return Nombre del producto a comprado
	*/
	public String getNombre(int n){
		return nombres.get(n);
	}

	/**
	*Setter para el precio del producto
	*@param precio Precio del producto comprado
	*/
	public void setPrecio(int precio){
		precios.add(precio);
	}

	/**
	*Getter para el precio del producto
	*@param n Indice del arreglo para extraer el precio
	*@return Precio del producto comprado
	*/
	public int getPrecios(int n){
		return precios.get(n);
	}

	/**
	*Setter para el producto con sus atributos a los arreglos
	*@param nombre Nombre del producto comprado
	*@param precio Precio del producto comprado
	*/
	public void setProducto(String nombre, int precio){
		setNombre(nombre);
		setPrecio(precio);
	}

	/**
	*Getter para el total de la compra
	*@return Total a pagar de la compra
	*/
	public int getTotal(){
		return total;
	}

	/**
	*Método para imprimir la lista de productos comprados
	*/
	public void mostrarLista(){
		total = 0;
		System.out.println("\n\tLista de productos: ");
		for(int i = 0; i < nombres.size(); i++){
			System.out.println("\tProducto: " + nombres.get(i) + " Precio: " + precios.get(i));
			total = total + precios.get(i);
		}
	}

	/**
	*Método para mostrar los indices de cada producto y su informacion
	*/
	public void mostrarIndices(){
		total = 0;
		System.out.println("\n\tLista de productos: ");
		for(int i = 0; i < nombres.size(); i++){
			System.out.println("\tIndice: #" + (i+1) + " Producto: " + nombres.get(i) + " Precio: " + precios.get(i));
			total = total + precios.get(i);
		}
	}

	/**
	*Método para eliminar productos de la lista de compras
	*@param n indice del producto que se va a dejar
	*/
	public void dejarProducto(int n){
		precios.remove(n-1);
		nombres.remove(n-1);
		System.out.println("Producto eliminado");
	}

}