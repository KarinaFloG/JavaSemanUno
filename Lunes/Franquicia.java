class Franquicia{
	public static void main(String[] args){
		Tienda sucursal1 = new Tienda("Monterrey", 3000);
		Tienda sucursal2 = new Tienda("Michoacan", 4000);
		Tienda sucursal3 = new Tienda("Sinaloa", 50000);

		System.out.println("\n***Los datos de la sucursal 1 son: \n");
		System.out.println("Direccion: ");
		System.out.println(sucursal1.getDireccion());
		System.out.println("Cantidad de dinero en la sucursal: ");
		System.out.println(sucursal1.getCantidadDinero());
		System.out.println("Cantidad de productos en la sucursal: ");
		System.out.println(sucursal1.getContProductos());
		System.out.println("Cantidad de empleados en la sucursal: ");
		System.out.println(sucursal1.getContEmpleados());
		System.out.println("Datos de los empleados de la tienda: ");
		sucursal1.getEmpleados();
		System.out.println("Datos de los productos de la tienda: ");
		sucursal1.getProductos();


		System.out.println("\n***Los datos de la sucursal 2 son: \n");
	    System.out.println("Direccion: ");
		System.out.println(sucursal2.getDireccion());
        System.out.println("Cantidad de dienro en la sucursal: ");
        System.out.println(sucursal2.getCantidadDinero());
	    System.out.println("Cantidad de productos en la sucursal: ");
        System.out.println(sucursal2.getContProductos());
        System.out.println("Cantidad de empleados en la sucursal: ");
        System.out.println(sucursal2.getContEmpleados());
        System.out.println("Datos de los empleados de la tienda: ");
		sucursal2.getEmpleados();
		System.out.println("Datos de los productos de la tienda: ");
		sucursal2.getProductos();


        System.out.println("\n***Los datos de la sucursal 3 son: \n");
        System.out.println("Direccion: ");
		System.out.println(sucursal3.getDireccion());
        System.out.println("Cantidad de dinero en la sucursal: ");
        System.out.println(sucursal3.getCantidadDinero());
        System.out.println("Cantidad de productos en la sucursal: ");
        System.out.println(sucursal3.getContProductos());
        System.out.println("Cantidad de empleados en la sucursal: ");
        System.out.println(sucursal3.getContEmpleados());
        System.out.println("Datos de los empleados de la tienda: ");
		sucursal3.getEmpleados();
		System.out.println("Datos de los productos de la tienda: ");
		sucursal3.getProductos();


	}




}
