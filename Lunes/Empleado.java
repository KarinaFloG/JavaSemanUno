public class Empleado{
	//Atributos de la clase Empleado
	private String puesto;
	private String nombre;
	private float sueldo;
	static final int cantidad = 4;
	//Variables  estaticas
	static int cont;

	//Contructor vacio
	public Empleado(){
		cont++;
	}
	//Constructor con parametros
	public Empleado(String nombre, float sueldo, String puesto){
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.puesto = puesto;
		cont++;
	}
	//Setter para el nombre
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	//Getter para el nombre
	public String getNombre(){
		return nombre;
	}
	//Setter para el sueldo
	public void setSueldo(float sueldo){
		this.sueldo = sueldo;
	}
	//Getter para el sueldo
	public float getSueldo(){
		return sueldo;
	}
	//Setter para el puesto
	public void setPuesto(String puesto){
		this.puesto = puesto;
	}
	//Getter para el puesto
	public String getPuesto(){
		return puesto;
	}
	//Getter para el contador de empleados;
	public static int getCont(){
		return cont;
	}
	//Getter para la cantidad total de empleados por tienda
	public static int getConstante(){
		return cantidad;
	}
}
