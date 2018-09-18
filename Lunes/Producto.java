class Producto{
	//Atributos de la clase producto
	private String nombre;
	private float precio;

	//Constructor vacio
	Producto(){

	}

	//Constructor con parametros
	Producto(String nombre, float precio){
		setNombre(nombre);
		setPrecio(precio);
	}

	//Setter para el nombre
	public void setNombre(String nombre){
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


}
