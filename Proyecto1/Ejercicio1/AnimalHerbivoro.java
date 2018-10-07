/**Creamos la clase animal herbívoro que implementa la interfaz animal*/
public abstract class AnimalHerbivoro implements Animal{
	/**Se hacen los atributos generales de animal herbívoro*/
	String comidaFav="OrganicGreen";
	String juego="Intentar nor morir por los carnivoros, o ahogarse con el pasto";
	String sonido="rawrHerbivoro";
	/**Se sobre escribe el método de la interfaz animal*/
	@Override public void hacerSonido(){}
	
	/**Se crean los métodos para que se puedan heredar*/
	public void miNombre(){}

	public void jugar(){}

	public void miComida(){}

	
}
