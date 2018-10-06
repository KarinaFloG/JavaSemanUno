import java.util.ArrayList;
import java.util.Scanner;

/**
*Clase principal del programa 
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/
public class Main{

	/**
	*Método para la impresión del menu principal
	*/
	public static void menu(){
		System.out.println("\t****BIENVENIDO AL SISTEMA DE PREBE AGENDAS*****");
		System.out.println("****MENU****");
		System.out.println("1)Crear agenda");
		System.out.println("2)Agregar persona");
		System.out.println("3)Borrar una persona");
		System.out.println("4)Buscar a una persona");
		System.out.println("5)Borrar a todas las personas");
		System.out.println("6)Salir");
	}

	/**
	*Método principal
	*@param args Paso de parametros desde linea de comandos 
	*/
	public static void main(String[] args){
		ArrayList<Agenda> agendas = new ArrayList<Agenda>();
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		Agenda agend;
		Agenda agendaCreada;
		String nombre, telefono, mascota;
		int opcion, contador = 0;
		Boolean bandera = true;
		int numAgenda = 0;

		do{
			menu();
			System.out.println("Elige una opcion: ");
			opcion = entrada.nextInt();

			switch(opcion){
				case 1:
					System.out.println("Creando una agenda nueva...");
					agendaCreada = new Agenda();
					agendas.add(agendaCreada);
					contador++;
					System.out.println("Agenda #" + contador);
				break;

				case 2:

					System.out.println("Ingresa en que numero de agenda deseas insertarlo: ");
					numAgenda = entrada.nextInt();
					numAgenda = numAgenda - 1;
					if(agendas.size() == 0){
						System.out.println("Ese numero de agenda no existe");
					}else if (numAgenda > agendas.size()){
						System.out.println("Aun no hay agendas, intenta creando una primero");
					}else{
						if(agendas.size() > 0){
							System.out.println("Agregando una persona...");
							System.out.println("\n");
							System.out.println("Nombre: ");
							nombre = entrada2.nextLine();
							System.out.println("Telefono: ");
							telefono = entrada2.nextLine();
							System.out.println("Mascota: ");
							mascota = entrada2.nextLine();
							agendas.get(numAgenda).agregarPersona(nombre,telefono,mascota);
						}else{
							System.out.println("Error al insertar contacto");
						}
					}
					
				break;

				case 3:
					System.out.println("Ingrese de que agenda deseas borrar el contacto");
					numAgenda = entrada.nextInt();
					numAgenda = numAgenda - 1;
					if(numAgenda > agendas.size()){
						System.out.println("Esa agenda no existe");
					}else{
						System.out.println("Ingresa el nombre del contacto a borrar: ");
						nombre = entrada2.nextLine();				
						agendas.get(numAgenda).eliminarPersona(nombre);	
					}
					
				break;

				case 4:
					System.out.println("Ingrese de que agenda deseas buscar el contacto");
					numAgenda = entrada.nextInt();
					numAgenda = numAgenda - 1;
					if(numAgenda > agendas.size()){
						System.out.println("Esa agenda no existe");
					}else{
						System.out.println("Ingresa el nombre del contacto a buscar: ");
						nombre = entrada2.nextLine();				
						agendas.get(numAgenda).buscarPersona(nombre);	
					}
				break;


				case 5:
					System.out.println("Ingrese de que agenda deseas borrar los contactos");
					numAgenda = entrada.nextInt();
					numAgenda = numAgenda - 1;
					if(numAgenda > agendas.size()){
						System.out.println("Esa agenda no existe");
					}else{
						agendas.get(numAgenda).borrarTodo();
					}
				break;

				case 6:
					System.out.println("Regresa pronto");
					bandera = false;
				break;

				default:
					System.out.println("Opcion incorrecta, intenta de nuevo");
				break;
			};

		}while(bandera == true);

	}

}