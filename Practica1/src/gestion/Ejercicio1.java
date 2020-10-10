package gestion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import facturacion.Factura;
import facturacion.Producto;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		List<Producto> factura = new ArrayList<Producto>();
		
		Producto miProducto = new Producto(0.75,"Leche",Producto.IVA.superreducido);
		Producto miProducto1 = new Producto(0.5,"Pan",Producto.IVA.reducido);
		Producto miProducto2= new Producto(8.99,"Salmon",Producto.IVA.normal);
		Producto miProducto3= new Producto(2.95,"Aguacates",Producto.IVA.normal);
		Producto miProducto4= new Producto(1.20,"Friegasuelos",Producto.IVA.reducido);
		Producto miProducto5= new Producto(0.56,"Cerveza",Producto.IVA.normal);
		Producto miProducto6= new Producto(1.45,"Sandia",Producto.IVA.superreducido);
		
		
		Date miFecha = new Date();
		
		
		factura.add(miProducto);
		factura.add(miProducto1);
		factura.add(miProducto2);
		factura.add(miProducto3);
		factura.add(miProducto4);
		factura.add(miProducto5);
		factura.add(miProducto6);
		
		
		Factura miFactura = new Factura(1,factura , miFecha);
		
	
		System.out.println(miFactura);
		
		
	}

}
