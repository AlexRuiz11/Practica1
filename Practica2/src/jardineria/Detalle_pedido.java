package jardineria;

public class Detalle_pedido {
	
	
	private Long codigo_pedido;
	private Long codigo_producto;
	private int  cantidad; 
	private float precio_unidad; 
	private int numero_linea;
	
	public Detalle_pedido(Long codigo_pedido, Long codigo_producto, int cantidad, float precio_unidad,
			int numero_linea) {
		super();
		this.codigo_pedido = codigo_pedido;
		this.codigo_producto = codigo_producto;
		this.cantidad = cantidad;
		this.precio_unidad = precio_unidad;
		this.numero_linea = numero_linea;
	}

	public Long getCodigo_pedido() {
		return codigo_pedido;
	}

	public void setCodigo_pedido(Long codigo_pedido) {
		this.codigo_pedido = codigo_pedido;
	}

	public Long getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(Long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio_unidad() {
		return precio_unidad;
	}

	public void setPrecio_unidad(float precio_unidad) {
		this.precio_unidad = precio_unidad;
	}

	public int getNumero_linea() {
		return numero_linea;
	}

	public void setNumero_linea(int numero_linea) {
		this.numero_linea = numero_linea;
	}

	@Override
	public String toString() {
		return "Detalle_pedido [codigo_pedido=" + codigo_pedido + ", codigo_producto=" + codigo_producto + ", cantidad="
				+ cantidad + ", precio_unidad=" + precio_unidad + ", numero_linea=" + numero_linea + "]";
	}
	
	
	
}
