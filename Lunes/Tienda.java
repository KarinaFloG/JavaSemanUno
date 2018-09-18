class Tienda{
	//Atributos de la clase
	private String direccion;
	private int contProductos;
	private int contEmpleados;
	private double cantidadDinero;
	//Variable estaticas
	static  double cantDinero;
	static  int contTiendas;

	//Constructor vacio
	public Tienda(){
		Producto p1 = new Producto("Lechita", 23);
                Producto p2 = new Producto("Pan", 10);
		Producto p3 = new Producto("Galletas", 30);
		Producto p4 = new Producto("Huevo", 5);
		Empleado e1 = new Empleado("Juan", 200, "Jefe");
		Empleado e2 = new Empleado("Pedro", 300, "Gerente");
		Empleado e3 = new Empleado("Maria", 400, "Empleado");
		Empleado e4 = new Empleado("Gabriel", 500, "Empleado");
		contTiendas++;
	}
	//Constructor con parametros
	public Tienda(String direccion, double cantidadDinero){
	        Producto p1 = new Producto("Lechita", 23);
                Producto p2 = new Producto("Pan", 10);
                Producto p3 = new Producto("Galletas", 30);
                Producto p4 = new Producto("Huevo", 5);
                Empleado e1 = new Empleado("Juan", 200, "Jefe");
                Empleado e2 = new Empleado("Pedro", 300, "Gerente");
                Empleado e3 = new Empleado("Maria", 400, "Empleado");
                Empleado e4 = new Empleado("Gabriel", 500, "Empleado");
		this.direccion = direccion;
		this.contProductos = Producto.getCont();
		this.contEmpleados = Producto.getCont();
		this.cantidadDinero = cantidadDinero;
		this.cantDinero = this.cantDinero + this.cantidadDinero;
		contTiendas++;
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
	public void setContProductos(){
		this.contProductos = Producto.getCont();
	}
	//Getter para la cantidad de productos
	public int getContProductos(){
		return contProductos;
	}
	//Setter para la cantidad de empleados
	public int setContEmpleados(int contEmpleados){
		return contEmpleados;
	}
	//Getter para la cantidad de empleados
	public int getContEmpleados(){
		return contEmpleados;
	}
	//Getter para la cantidad total de dinero
	public static double getCantDinero(){
		return cantDinero;
	}
	//Getter para la cantidad total de tiendas
	public static float getContTiendas(){
		return contTiendas;
	}
	//Setter para la cantidad de dinero de cada tienda
	public void setCantidadDinero(float cantidadDinero){
		this.cantidadDinero = cantidadDinero;
	}
	//Getter para la cantidad de dinero de cada tienda
	public double getCantidadDinero(){
		return cantidadDinero;
	}
}
