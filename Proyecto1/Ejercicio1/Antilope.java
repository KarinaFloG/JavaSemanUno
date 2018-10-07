/**La clase Panda herda animal herbivoro*/
public class Antilope extends AnimalHerbivoro{
	/**Se definen sus atributos especificos*/
	String nombre = "Panda";
	String comidaFav = "Bambues/bamboos/bambus";
	String juego = "Caerse"; 
	String sonido = "A veces parece que ladran, es neta";
	/**Se definen sus metodos heredados*/
	public void miNombre(){
		System.out.println(nombre);
		System.out.println();
	}

	public void hacerSonido(){
		System.out.println("El Panda hace: "+sonido);
		System.out.println("Los animales herbívoros hacen: "+super.sonido);
		System.out.println();
	}

	public void jugar(){
		System.out.println("El Panda juega a: "+juego);
		System.out.println("A todos los animales herbívoros les gusta: "+super.juego);
		System.out.println();
	}

	public void miComida(){
		System.out.println("La comida favorita del Panda son los: "+comidaFav);
		System.out.println("Los animales herbívoros comen: "+super.comidaFav);
		System.out.println();
		
	}
}

