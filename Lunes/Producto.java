class Producto{
	//Atributos de la clase producto
	private String nombre;
	private float precio;
	static final int cantidad = 4;
	//Variables estaticas
	static int cont;
	//Constructor vacio
	public Producto(){
		cont++;
	}

	//Constructor con parametros
	public Producto(String nombre, float precio){
		setNombre(nombre);
		setPrecio(precio);
		cont++;
	}

	//Setter para el nombre
	public void  setNombre(String nombre){
		this.nombre = nombre;
	}

	//Getter para el nombre
	public String getNombre(){
		return nombre;
	}

	//Setter para el precio
	public void setPrecio(float precio){
		this.precio = precio;
	}

	//Getter para el precio
	public float getPrecio(){
		return precio;
	}
	//Getter para el contador de productos
	public static int getCont(){
		return cont;
	}
	//Getter para la constante
	public static int getConstante(){
		return  cantidad;
	}
}
