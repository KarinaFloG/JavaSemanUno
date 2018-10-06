import java.util.ArrayList;

/**
*Esta clase define los métodos de la agenda 
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class Agenda{
	//Atributos de clase
	ArrayList<Persona> agenda = new ArrayList<Persona>();
	public void agregarPersona(String nombre, String telefono, String nombreMasc){
		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setTelefono(telefono);
		persona.setMascota(nombreMasc);
		agenda.add(persona);
	}

	/**
	*Método para eliminar personas de la agenda
	*@param nombre Nombre del contacto a eliminar
	*/
	public void eliminarPersona(String nombre){
		for(int i = 0; i < agenda.size(); i++){
			if(agenda.get(i).getNombre().equals(nombre)){
				System.out.println("Eliminando contacto...");
				agenda.remove(i);
				System.out.println("Eliminado...");
			}else{
				System.out.println("Ese contacto no existe");
			}
			
		}

	}
	/**
	*Método para buscar a un contacto en la agenda
	*@param nombre Nombre del contacto a buscar
	*/
	public void buscarPersona(String nombre){
		if(agenda.size() == 0){
			System.out.println("Agenda vacia");
		}else{
			for(int i = 0; i < agenda.size(); i++){
				if(agenda.get(i).getNombre().equals(nombre)){
					System.out.println("Los datos del contacto son: ");
					System.out.println("Nombre: " + agenda.get(i).getNombre());
					System.out.println("Telefono: " +  agenda.get(i).getTelefono());
					System.out.println("Mascota: " + agenda.get(i).getMascota());
				}else{
					System.out.println("Ese contacto no existe");
				}
			}
		}
	}

	/**
	*Método para borrar todos los contactos de la agenda
	*/
	public void borrarTodo(){
		System.out.println("Eliminando todos los contactos...");
		agenda.clear();
		System.out.println("Eliminados...");
	}


}