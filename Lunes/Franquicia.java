class Franquicia{
	public static void main(String[] args){
		Tienda sucursal1 = new Tienda();
		Tienda sucursal2 = new Tienda();
		Tienda sucursal3 = new Tienda();
		System.out.println("\nLos datos de la sucursal 1 son: \n");
		System.out.println(sucursal1.getDireccion());
		System.out.println(sucursal1.cantidadDinero());
		System.out.println(sucursal1.getContProductos());
		System.out.println(sucursal1.getContEmpleados());
		System.out.println("\nLos datos de la sucursal 2 son: \n");
		System.out.println(sucursal2.getDireccion());
                System.out.println(sucursal2.cantidadDinero());
                System.out.println(sucursal2.getContProductos());
                System.out.println(sucursal2.getContEmpleados());

	}




}
