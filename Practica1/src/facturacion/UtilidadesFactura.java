package facturacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class UtilidadesFactura {
	
	public static double calcularImporteFactura(Factura f) 
	{
		double totalSinIVA=0;
		
		for(int i=0; i<f.getProductos().size(); i++) {
			
			
			totalSinIVA= f.getProductos().get(i).getImporte() + totalSinIVA ;
		}
	
		
		return totalSinIVA;		
		
	}
	
	
	public static double calcularIVAFactura(Factura f) 
	{
		double totalIVA=0;
		
		for(int i=0; i<f.getProductos().size(); i++) {
			
			
			totalIVA= f.getProductos().get(i).getIva().getCode() + totalIVA ;
		}
		
	
		
		return totalIVA;		
		
	}
	
	
	public static double calcularImporteFacturaConIVA(Factura f) 
	{
		double totalFacturaConIVA=0;
		
		totalFacturaConIVA = calcularIVAFactura(f) + calcularImporteFactura(f);
		
		return totalFacturaConIVA;		
		
	}
	
	public static double calculoIVATrimestral( List<Factura> facturas)
	{
		double FacturaTrimestral=0;
		Date miFecha = new Date();
		for(int i=0; i<facturas.size() ;i++) {
		if((miFecha.getMonth()>facturas.get(i).getFecha().getMonth()) && (miFecha.getMonth()-3<facturas.get(i).getFecha().getMonth()))
		
		{
			FacturaTrimestral =calcularImporteFacturaConIVA(facturas.get(i)) + FacturaTrimestral;
		}
	
		
		
	
		}
		
		
		return FacturaTrimestral;
		
	}
	
	
	public static double calculoIVAMesActual ( List<Factura> facturas)
	{
		double FacturaMesActual=0;
		
		Date miFecha = new Date();
		for(int i=0; i<facturas.size() ;i++) {
		if((miFecha.getMonth()==facturas.get(i).getFecha().getMonth()))
		
		{
			FacturaMesActual =calcularImporteFacturaConIVA(facturas.get(i)) + FacturaMesActual;
		}
	
		
		
	
		}
		
		
		return FacturaMesActual;
	}

}
