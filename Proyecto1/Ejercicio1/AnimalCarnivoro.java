/**Creamos nuestra clase de animal carnívoro que implementa la interfaz animal*/
public abstract class AnimalCarnivoro implements Animal{
	/**Creamos los atributos y los definimos de forma general para los animales carnívoros*/
	String comidaFav="Carne y sangre, y que aún griten";
	String juego="Cazar";
	String sonido="RAWR! :3";

	/**
	@Overrida
	para forzar al compilador a comprobar en tiempo de compilación que está sobrescribiendo correctamente el método*/
	@Override public void hacerSonido(){}

	/**Creamos los métodos que se heredarán de la clase*/
	public void miNombre(){}

	public void jugar(){}

	public void miComida(){}

	
}
