package facturacion;

import java.util.Date;
import java.util.List;



public class Factura {
	 
    private int numero;
    private List<Producto> productos;
    private Date fecha;
    
    
  

	public Factura(int numero, List<Producto> productos, Date fecha) {
		super();
		this.numero = numero;
		this.productos = productos;
		this.fecha = fecha;

	

		
	}
    
    


	public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    
    
    @Override
  	public String toString() {
  		return "Factura [numero=" + numero + " , productos=" + productos +  "]" + " Fecha : " + fecha+ "\n";
  	}




	public Date getFecha() {
		return fecha;
	}




	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}