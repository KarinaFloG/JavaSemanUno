class Franquicia{
	public static void main(String[] args){
		Tienda sucursal1 = new Tienda("Monterrey", 3000);
		Tienda sucursal2 = new Tienda("Michoacan", 4000);
		Tienda sucursal3 = new Tienda("Sinaloa", 50000);
		//sucursal1.setDireccion("Michoacan");
		//sucursal1.setCantidadDinero(3000);

		//sucursal2.setDireccion("Monterrey");
		//sucursal2.setCantidadDinero(7000);

		//sucursal3.setDireccion("Sinaloa");
		//sucursal3.setCantidadDinero(5000);

		System.out.println("\nLos datos de la sucursal 1 son: \n");
		System.out.println("\nDireccion: ");
		System.out.println(sucursal1.getDireccion());
		System.out.println("Cantidad de dinero en la sucursal: ");
		System.out.println(sucursal1.getCantidadDinero());
		System.out.println("Cantidad de productos en la sucursal: ");
		System.out.println(sucursal1.getContProductos());
		System.out.println("Cantidad de empleados en la sucursal: ");
		System.out.println(sucursal1.getContEmpleados());
;

		System.out.println("\nLos datos de la sucursal 2 son: \n");
	        System.out.println("\nDireccion: ");
		System.out.println(sucursal2.getDireccion());
                System.out.println("Cantidad de dienro en la sucursal: ");
                System.out.println(sucursal2.getCantidadDinero());
	        System.out.println("Cantidad de productos en la sucursal: ");
                System.out.println(sucursal2.getContProductos());
                System.out.println("Cantidad de empleados en la sucursal: ");
                System.out.println(sucursal2.getContEmpleados());

                System.out.println("\nLos datos de la sucursal 3 son: \n");
                System.out.println("\nDireccion: ");
		System.out.println(sucursal3.getDireccion());
                System.out.println("Cantidad de dinero en la sucursal: ");
                System.out.println(sucursal3.getCantidadDinero());
                System.out.println("Cantidad de productos en la sucursal: ");
                System.out.println(sucursal3.getContProductos());
                System.out.println("Cantidad de empleados en la sucursal: ");
                System.out.println(sucursal3.getContEmpleados());

		System.out.println("\nEl numero total de tiendas de la franquicia es: ");
		System.out.println(Tienda.getContTiendas());
		System.out.println("\nLa cantidad total de dinero de las sucursales es: ");
		System.out.println(Tienda.getCantDinero());
	}




}
