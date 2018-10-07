import java.util.ArrayList;

/**
*Clase batalla 
*@author: Flores García Karina #9
*@author:Josué González Policarpo #7
*@version: 06/10/18
*/

public class Batalla{
	ArrayList<Pokemon> pokemIniciales = new ArrayList<Pokemon>();
	ArrayList<Pokemon> pokemElegir = new ArrayList<Pokemon>();	
	ArrayList<Jugador> jugadores = new ArrayList<Jugador>();

	/**
	*Sobre escritura de constructor
	*/
	Batalla(){
		llenarIniciales();
		llenarElegir();
	}

	/**
	*Método para crear los pokemones iniciales
	*/
	public void llenarIniciales(){
		ArrayList<String> mega = new ArrayList<String>();
		ArrayList<String> thy = new ArrayList<String>();
		ArrayList<String> fera = new ArrayList<String>();

		mega.add("Planta");
		thy.add("Fuego");
		fera.add("Agua");

		Pokemon meganium = new Pokemon("Meganium",80,mega,36,82,83,100,100,80);
		Pokemon thyploshion = new Pokemon("Thyploshion",78,thy,36,84,109,78,85,100);
		Pokemon feraligator = new Pokemon("Feraligator",85,fera,30,105,79,100,83,78);
		pokemIniciales.add(meganium);
		pokemIniciales.add(thyploshion);
		pokemIniciales.add(feraligator);
	}

	/**
	*Método para crear la demás lista de pokemones
	*/
	public void llenarElegir(){
		//Arreglo de tipos
		ArrayList<String> pins = new ArrayList<String>();
		//Agrega los tipos al arreglo
		pins.add("Bicho");
		ArrayList<String> exca = new ArrayList<String>();
		exca.add("Tierra");
		exca.add("Acera");
		ArrayList<String> gol = new ArrayList<String>();
		gol.add("Fantasma");
		gol.add("Tierra");
		ArrayList<String> sam = new ArrayList<String>();
		sam.add("Agua");
		ArrayList<String> vivi = new ArrayList<String>();
		vivi.add("Bicho");
		vivi.add("Volar");
		ArrayList<String> sylve = new ArrayList<String>();
		sylve.add("Hada");
		ArrayList<String> silva = new ArrayList<String>();
		silva.add("Normal");
		ArrayList<String> ludi = new ArrayList<String>();
		ludi.add("Agua");
		ludi.add("Planta");
		ArrayList<String> cloy = new ArrayList<String>();
		cloy.add("Agua");
		cloy.add("Hielo");
		ArrayList<String> tsa = new ArrayList<String>();
		tsa.add("Planta");
		//Crear pokemones para elegir
		Pokemon pinsir = new Pokemon("Pinsir",65,pins,100,125,55,100,75,85);
		Pokemon excadrill = new Pokemon("Excadrill",110,exca,100,135,50,60,65,88);
		Pokemon golurk = new Pokemon("Golurk",89,gol,100,124,55,80,80,55);
		Pokemon samurott = new Pokemon("Samurott",95,sam,100,100,108,85,70,70);
		Pokemon vivillion = new Pokemon("Vivillion",80,vivi,100,52,90,50,50,89);
		Pokemon sylveon = new Pokemon("Sylveon",95,sylve,100,65,110,65,130,60);
		Pokemon silvally = new Pokemon("Silvally",95,silva,100,95,95,95,95,95);
		Pokemon ludicolo = new Pokemon("Ludicolo",80,ludi,100,95,95,95,95,95);
		Pokemon cloyster = new Pokemon("Cloyster",50,cloy,100,95,85,180,45,70);
		Pokemon tsareena = new Pokemon("Tsareena",72,tsa,100,120,50,98,98,72);
		//Meter al arreglo de pokemones para elegir
		pokemElegir.add(pinsir);
		pokemElegir.add(excadrill);
		pokemElegir.add(golurk);
		pokemElegir.add(samurott);
		pokemElegir.add(vivillion);
		pokemElegir.add(sylveon);
		pokemElegir.add(silvally);
		pokemElegir.add(ludicolo);
		pokemElegir.add(cloyster);
		pokemElegir.add(tsareena);
	}

	/**
	*Imprime en pantalla los pokemones iniciales
	*/
	public void mostrarIniciales(){
		System.out.println("\tLos pokemones iniciales son: ");
		for(int i = 0; i < pokemIniciales.size(); i++){
			System.out.println("Nombre: " + pokemIniciales.get(i).getNombre() + "/ Vida: " + pokemIniciales.get(i).getVida() + "/ Nivel: " + pokemIniciales.get(i).getNivel() + "/ A Fisico: " + pokemIniciales.get(i).getAtaqueFisico() + 
				"/ A Especial: " + pokemIniciales.get(i).getAtaqueEspecial() + "/ D Fisica: " + pokemIniciales.get(i).getDefensaFisica() + "/ D Especial: " 
				+ pokemIniciales.get(i).getDefensaEspecial() + "/ Velocidad: " + pokemIniciales.get(i).getVelocidad());
		}

	}

	/**
	*Imprime en pantalla los pokemones que podemos elegir
	*/
	public void mostrarElegir(){
		System.out.println("\n\tLos pokemones que puedes elegir son: ");
		for(int i = 0; i < pokemElegir.size(); i++){
			System.out.println("Nombre: " + pokemElegir.get(i).getNombre() + "/ Vida: " + pokemElegir.get(i).getVida() + "/ Nivel: " + pokemElegir.get(i).getNivel() + "/ A Fisico: " + pokemElegir.get(i).getAtaqueFisico() + 
				"/ A Especial: " + pokemElegir.get(i).getAtaqueEspecial() + "/ D Fisica: " + pokemElegir.get(i).getDefensaFisica() + "/ D Especial: " 
				+ pokemElegir.get(i).getDefensaEspecial() + "/ Velocidad: " + pokemElegir.get(i).getVelocidad());
		}	
	}

	/**
	*Agrega los jugadores a la batalla
	*@param jug Jugador de la batalla
	*/
	public void setJugador(Jugador jug){
		jugadores.add(jug);
	}

}