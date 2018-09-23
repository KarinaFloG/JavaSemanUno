class Tienda{
	//Atributos de la clase
	private String direccion;
	private int contProductos;
	private int contEmpleados;
	private double cantidadDinero;
	//Variable estaticas
	static  double cantDinero;
	static  int contTiendas;
	//Declaraciones
	private Producto p1, p2, p3, p4;
   	private Empleado e1, e2, e3, e4;
   


	//Constructor vacio
	public Tienda(){
		p1 = new Producto("Lechita", 23);
        p2 = new Producto("Pan", 10);
		p3 = new Producto("Galletas", 30);
		p4 = new Producto("Huevo", 5);
		e1 = new Empleado("Juan", 200, "Jefe");
		e2 = new Empleado("Pedro", 300, "Gerente");
		e3 = new Empleado("Maria", 400, "Empleado");
		e4 = new Empleado("Gabriel", 500, "Empleado");
		contTiendas++;
	}
	//Constructor con parametros
	public Tienda(String direccion, double cantidadDinero){
	    p1 = new Producto("Lechita", 23);
        p2 = new Producto("Pan", 10);
        p3 = new Producto("Galletas", 30);
        p4 = new Producto("Huevo", 5);
        e1 = new Empleado("Juan", 200, "Jefe");
        e2 = new Empleado("Pedro", 300, "Gerente");
        e3 = new Empleado("Maria", 400, "Empleado");
        e4 = new Empleado("Gabriel", 500, "Empleado");
		this.direccion = direccion;
		this.contProductos = Producto.getConstante();
		this.contEmpleados = Producto.getConstante();
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
	//Setter para la cantidad total de dinero
	public void setCantDinero(){
		this.cantDinero = this.cantDinero + this.cantidadDinero;
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

	public void getProductos(){
		System.out.println("\n\t***PRODUCTOS Y PRECIOS***");
		System.out.println("\t" + p1.getNombre() + " " + p1.getPrecio());
		System.out.println("\t" + p2.getNombre() + " " + p2.getPrecio());
		System.out.println("\t" + p3.getNombre() + " " + p3.getPrecio());
		System.out.println("\t" + p4.getNombre() + " " + p4.getPrecio());
	}

	public void getEmpleados(){
		System.out.println("\n\t***EMPLEADOS  --  SUELDO  --  CARGO --***");
		System.out.println("\t" + e1.getNombre() + " " + e1.getSueldo() + " " + e1.getPuesto());
		System.out.println("\t" + e2.getNombre() + " " + e2.getSueldo() + " " + e2.getPuesto());
		System.out.println("\t" + e3.getNombre() + " " + e3.getSueldo() + " " + e3.getPuesto());
		System.out.println("\t" + e4.getNombre() + " " + e4.getSueldo() + " " + e4.getPuesto());
	}
}
