package facturacion;



public class Producto {

	private double importe;
	private String descripcion;
	private IVA iva;
	
	
	public Producto(double importe, String descripcion, IVA iva) {
		super();
		this.importe = importe;
		this.descripcion = descripcion;
		this.iva= iva;
	}

	
	public double getImporte() {
		return importe;
	}
	

	public String getDescripcion() {
		return descripcion;
	}
	
	public IVA getIva() {
		return iva;
	}



	public void setImporte(double importe) {
		this.importe = importe;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	public void setIva(IVA iva) {
		this.iva = iva;
	}
	
	public enum IVA
	{
		superreducido(0.07), reducido(0.1), normal(0.21);
		private double code;
		IVA(double code)
		{
			this.code=code;
		}
		public double getCode() {
			return this.code;
		}
		
	}
	
	


	@Override
	public String toString() {
		return " \n" + "importe=" + importe + ", descripcion=" + descripcion + ", IVA = " + iva + "]";
	}
	
	
	
}