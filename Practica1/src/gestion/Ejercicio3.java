package gestion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import facturacion.Factura;
import facturacion.Producto;
import facturacion.UtilidadesFactura;



public class Ejercicio3 {

	public static void main(String[] args) {
		
		List<Factura> facturas = new ArrayList<Factura>();
		List<Producto> factura = new ArrayList<Producto>();
		List<Producto> factura1 = new ArrayList<Producto>();
		List<Producto> factura2= new ArrayList<Producto>();
		List<Producto> factura3 = new ArrayList<Producto>();
		List<Producto> factura4 = new ArrayList<Producto>();
		
		Producto miProducto = new Producto(0.75,"Leche",Producto.IVA.superreducido);
		Producto miProducto1 = new Producto(0.5,"Pan",Producto.IVA.reducido);
		Producto miProducto2= new Producto(8.99,"Salmon",Producto.IVA.normal);
		Producto miProducto3= new Producto(2.95,"Aguacates",Producto.IVA.normal);
		Producto miProducto4= new Producto(1.20,"Friegasuelos",Producto.IVA.reducido);
		Producto miProducto5= new Producto(0.56,"Cerveza",Producto.IVA.normal);
		Producto miProducto6= new Producto(1.45,"Sandia",Producto.IVA.superreducido);
		
		
		
		
		Date miFecha = new Date();
		Date miFecha1 = new Date(120,9,2,10,05,03);
		Date miFecha2 = new Date(120,8,22,10,05,03);
		Date miFecha3 = new Date(120,8,13,10,05,03);
		Date miFecha4 = new Date(120,7,12,10,05,03);
		
		
		factura.add(miProducto);
		factura.add(miProducto1);
		factura.add(miProducto2);
		factura.add(miProducto3);
		factura.add(miProducto4);
		factura.add(miProducto5);
		factura.add(miProducto6);
		
		
		Factura miFactura = new Factura(1,factura,miFecha);
		
		
		factura1.add(miProducto);
		factura1.add(miProducto1);
		factura1.add(miProducto2);
		
		Factura miFactura1 = new Factura(2,factura1,miFecha1);
		
		factura2.add(miProducto4);
		factura2.add(miProducto2);
		factura2.add(miProducto3);
		
		Factura miFactura2 = new Factura(3,factura2,miFecha2);
		

		factura3.add(miProducto4);
		factura3.add(miProducto6);
		factura3.add(miProducto5);
		
		Factura miFactura3= new Factura(4,factura3,miFecha3);
		
		factura4.add(miProducto);
		factura4.add(miProducto3);
		factura4.add(miProducto6);
		
		Factura miFactura4 = new Factura(5,factura4,miFecha4);
		
		
		
		facturas.add(miFactura);
		facturas.add(miFactura1);
		facturas.add(miFactura2);
		facturas.add(miFactura3);
		facturas.add(miFactura4);

		
		
		
		
		System.out.println( "Las faturas de los  3 meses anteriores suman : "+ UtilidadesFactura.calculoIVATrimestral(facturas) + "€");
		System.out.println( "Las faturas del mes actual suman : "+ UtilidadesFactura.calculoIVAMesActual(facturas) + "€");
		
	

		
		
		
	}
	

		
	

}