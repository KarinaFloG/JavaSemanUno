class Tienda{
	//Atributos de la clase
	private String direccion;
	private int contProductos;
	private int contEmpleados;
	//Variable estaticas
	static  float cantDinero;
	static  int contTiendas;

	//Constructor vacio
	public void Tienda(){
		Producto p1 = new Producto();
                Producto p2 = new Producto();
		Producto p3 = new Producto();
		Producto p4 = new Producto();
		Empleado e1 = new Empleado();
		Empleado e2 = new Empleado();
		Empleado e3 = new Empleado();
		Empleado e4 = new Empleado();

	}
	//Constructor con parametros
	public void Tienda(String direccion, int contProductos, int contEmpleados){
		this.direccion = direccion;
		this.contProductos = contProdutos;
		this.contEmpleados = contEmpleados;
                Producto p1 = new Producto();
                Producto p2 = new Producto();
                Producto p3 = new Producto();
                Producto p4 = new Producto();
                Empleado e1 = new Empleado();
                Empleado e2 = new Empleado();
                Empleado e3 = new Empleado();
                Empleado e4 = new Empleado();
	}
	//Setter para la direccion de la tienda
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	//Getter para la direccion de la tienda
	public String getDireccion(){
		return direccion;
	}
	//Setter para la cantidad de productos
	public void setContProductos(int contProdutos){
		this.contProductos = contProductos;
	}
	//Getter para la cantidad de productos
	public int getContProductos(){
		return contProductos;
	}
	//Setter para la cantidad de empleados
	public void setContEmpleados(int contEmpleados){
		return contEmpleados;
	}
	//Getter para la cantidad de empleados
	public int getContEmpleados(){
		return contEmpleados;
	}
	//Getter para la cantidad total de dinero
	public static float getCantDinero(){
		return cantDinero;
	}
	//Getter para la cantidad total de tiendas
	public static float getContTiendas(){
		return contTiendas;
	}

}
