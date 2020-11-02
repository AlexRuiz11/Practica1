package jardineria;

import java.util.Date;

public class Pago {

	
	private Long codigo_cliente; 
	private String forma_pago; 
	private String id_transaccion; 
	private Date fecha_pago; 
	private int total;
	
	public Pago(Long codigo_cliente, String forma_pago, String id_transaccion, Date fecha_pago, int total) {
		super();
		this.codigo_cliente = codigo_cliente;
		this.forma_pago = forma_pago;
		this.id_transaccion = id_transaccion;
		this.fecha_pago = fecha_pago;
		this.total = total;
	}

	public Long getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(Long codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public String getForma_pago() {
		return forma_pago;
	}

	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}

	public String getId_transaccion() {
		return id_transaccion;
	}

	public void setId_transaccion(String id_transaccion) {
		this.id_transaccion = id_transaccion;
	}

	public Date getFecha_pago() {
		return fecha_pago;
	}

	public void setFecha_pago(Date fecha_pago) {
		this.fecha_pago = fecha_pago;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Pago [codigo_cliente=" + codigo_cliente + ", forma_pago=" + forma_pago + ", id_transaccion="
				+ id_transaccion + ", fecha_pago=" + fecha_pago + ", total=" + total + "]";
	}
	
	
}
