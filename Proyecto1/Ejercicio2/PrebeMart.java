import java.util.Scanner;

/**
*Esta clase es la principal para implementar el PrebeMart, aquí el usuario realiza sus compras
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class PrebeMart{

	/**
	*Método que imprime el menú principal
	*/
	public static void menuPrincipal(){
		System.out.println("\n1)Agregar producto");
		System.out.println("2)Terminar compra");
		System.out.println("3)Salir");
	}

	/**
	*Método para imprimir el menú de la lista 
	*/
	public static void menuLista(){
		System.out.println("1)Comprar");
		System.out.println("2)Dejar productos");
	}

	/**
	*Método de la clase principa del programa
	*@param args Recibe datos por linea de comandos
	*/
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Lista list = new Lista();
		boolean bandera = true;
		String nombre;
		int precio;
		int opcion, op, dejar;

		System.out.println("\t***Bienvenido al PrebeMart***");
		System.out.println("Su lista de productos ha iniciado");
		do{
			menuPrincipal();
			System.out.println("Elige una opcion: ");
			opcion = entrada.nextInt();

			switch(opcion){
				case 1:
					System.out.println("Nombre del producto: ");
					nombre = entrada2.nextLine();
					System.out.println("Precio del producto: ");
					precio = entrada.nextInt();
					list.setProducto(nombre,precio);

				break;

				case 2:
					System.out.println("Los productos que has comprado son: ");
					list.mostrarLista();
					menuLista();
					System.out.println("Elige una opcion: ");
					opcion = entrada.nextInt();

					switch(opcion){
						case 1:
							if(list.getTotal() > 500){
								System.out.println("No puedes comprar todo, te falta money");
								list.mostrarIndices();
								do{
									System.out.println("Que producto deseas dejar?");
									dejar = entrada.nextInt();
									list.dejarProducto(dejar);
									System.out.println("Deseas dejar otro producto? 1/SI 0/NO");
									op = entrada.nextInt();
								}while(op == 1);
							}else{
								System.out.println("Gracias por tu compra !!");
								bandera = false;
							}
						break;

						case 2:
							list.mostrarIndices();
							do{
								System.out.println("Que producto deseas dejar?");
								dejar = entrada.nextInt();
								list.dejarProducto(dejar);
								System.out.println("Deseas dejar otro producto? 1/SI 0/NO");
								op = entrada.nextInt();
							}while(op == 1);
						break;
					}

				break;

				case 3:
					System.out.println("Regresa pronto al PrebeMart");
					bandera = false;
				break;
			}
		}while(bandera == true);
	}
}