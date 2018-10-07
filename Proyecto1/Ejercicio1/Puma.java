/**La clase puma hereda de animal carnivoro*/
public class Puma extends AnimalCarnivoro{
	/**Se definen sus atributos especificos*/
	String nombre = "Puma";
	String comidaFav = "Carnitas";
	String juego = "paros"; 
	String sonido = "México, Pumas, Universidad Rawr!";

	/**Se definen los metodos heredados*/
	public void miNombre(){
		System.out.println(nombre);
		System.out.println();
	}

	public void hacerSonido(){
		System.out.println("El puma hace: "+sonido);
		System.out.println("Los animales carnívoros hacen: "+super.sonido);
		System.out.println();
	}

	public void jugar(){
		System.out.println("El puma juega a perseguir: "+juego);
		System.out.println("A todos los animales carnívoros les gusta: "+super.juego);
		System.out.println();
	}

	public void miComida(){
		System.out.println("La comida favorita del puma son los: "+comidaFav);
		System.out.println("Los animales carnívoros comen: "+super.comidaFav);
		System.out.println();
		
	}
}

