package jardineria;

public class Gama_producto {
	
	 private String gama;
	 private String  descripcion_texto;
	 private String  descripcion_html;
	 private int  imagen;
	 
	 
	public Gama_producto(String gama, String descripcion_texto, String descripcion_html, int imagen) {
		super();
		this.gama = gama;
		this.descripcion_texto = descripcion_texto;
		this.descripcion_html = descripcion_html;
		this.imagen = imagen;
	}
	
	
	
	public String getGama() {
		return gama;
	}
	public void setGama(String gama) {
		this.gama = gama;
	}
	public String getDescripcion_texto() {
		return descripcion_texto;
	}
	public void setDescripcion_texto(String descripcion_texto) {
		this.descripcion_texto = descripcion_texto;
	}
	public String getDescripcion_html() {
		return descripcion_html;
	}
	public void setDescripcion_html(String descripcion_html) {
		this.descripcion_html = descripcion_html;
	}
	public int getImagen() {
		return imagen;
	}
	public void setImagen(int imagen) {
		this.imagen = imagen;
	}
	
	
	
	@Override
	public String toString() {
		return "Gama_producto [gama=" + gama + ", descripcion_texto=" + descripcion_texto + ", descripcion_html="
				+ descripcion_html + ", imagen=" + imagen + "]";
	} 

}
