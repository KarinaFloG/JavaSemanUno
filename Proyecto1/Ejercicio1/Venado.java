/**La clase Jirafa hereda animal herbivoro*/
public class Venado extends AnimalHerbivoro{
	/**Se definen sus atributos especificos*/
	String nombre = "Jirafa";
	String comidaFav = "Pishes hojas bien altas";
	String juego = "Darse unos madrazos con el cuello"; 
	String sonido = "Da miedo, no lo escuchen";

	/**Se definen los metodos heredados*/
	public void miNombre(){
		System.out.println(nombre);
		System.out.println();
	}

	public void hacerSonido(){
		System.out.println("El Jirafa hace: "+sonido);
		System.out.println("Los animales herbívoros hacen: "+super.sonido);
		System.out.println();
	}

	public void jugar(){
		System.out.println("El Jirafa juega a: "+juego);
		System.out.println("A todos los animales herbívoros les gusta: "+super.juego);
		System.out.println();
	}

	public void miComida(){
		System.out.println("La comida favorita del Jirafa son los: "+comidaFav);
		System.out.println("Los animales herbívoros comen: "+super.comidaFav);
		System.out.println();
		
	}
}

