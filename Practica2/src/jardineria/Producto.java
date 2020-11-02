package jardineria;

public class Producto {
	
	 private Long codigo_producto; 
	 private String  nombre; 
	 private Long  gama; 
	 private int  dimensiones; 
	 private String  proveedor; 
	 private String  descripcion; 
	 private int  cantidad_en_stock; 
	 private int  precio_venta; 
	 private int  precio_proveedor;
	 
	public Producto(String nombre, Long gama, int dimensiones, String proveedor, String descripcion,
			int cantidad_en_stock, int precio_venta, int precio_proveedor) {
		super();
		this.nombre = nombre;
		this.gama = gama;
		this.dimensiones = dimensiones;
		this.proveedor = proveedor;
		this.descripcion = descripcion;
		this.cantidad_en_stock = cantidad_en_stock;
		this.precio_venta = precio_venta;
		this.precio_proveedor = precio_proveedor;
	}

	public Long getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(Long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getGama() {
		return gama;
	}

	public void setGama(Long gama) {
		this.gama = gama;
	}

	public int getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(int dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad_en_stock() {
		return cantidad_en_stock;
	}

	public void setCantidad_en_stock(int cantidad_en_stock) {
		this.cantidad_en_stock = cantidad_en_stock;
	}

	public int getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(int precio_venta) {
		this.precio_venta = precio_venta;
	}

	public int getPrecio_proveedor() {
		return precio_proveedor;
	}

	public void setPrecio_proveedor(int precio_proveedor) {
		this.precio_proveedor = precio_proveedor;
	}

	@Override
	public String toString() {
		return "Producto [codigo_producto=" + codigo_producto + ", nombre=" + nombre + ", gama=" + gama
				+ ", dimensiones=" + dimensiones + ", proveedor=" + proveedor + ", descripcion=" + descripcion
				+ ", cantidad_en_stock=" + cantidad_en_stock + ", precio_venta=" + precio_venta + ", precio_proveedor="
				+ precio_proveedor + "]";
	}
	 
	 

}
