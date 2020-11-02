package jardineria;

public class Oficina {
	
	private Long codigo_oficina= null;
	private String ciudad; 
	private String  pais;
	private String  region; 
	private int codigo_postal; 
	private int telefono;
	private String  linea_direccion1; 
	private String  linea_direccion2;
	
	public Oficina(String ciudad, String pais, String region, int codigo_postal, int telefono, String linea_direccion1,
			String linea_direccion2) {
		super();
		this.ciudad = ciudad;
		this.pais = pais;
		this.region = region;
		this.codigo_postal = codigo_postal;
		this.telefono = telefono;
		this.linea_direccion1 = linea_direccion1;
		this.linea_direccion2 = linea_direccion2;
	}

	public Long getCodigo_oficina() {
		return codigo_oficina;
	}

	public void setCodigo_oficina(Long codigo_oficina) {
		this.codigo_oficina = codigo_oficina;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public int getCodigo_postal() {
		return codigo_postal;
	}

	public void setCodigo_postal(int codigo_postal) {
		this.codigo_postal = codigo_postal;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getLinea_direccion1() {
		return linea_direccion1;
	}

	public void setLinea_direccion1(String linea_direccion1) {
		this.linea_direccion1 = linea_direccion1;
	}

	public String getLinea_direccion2() {
		return linea_direccion2;
	}

	public void setLinea_direccion2(String linea_direccion2) {
		this.linea_direccion2 = linea_direccion2;
	}

	@Override
	public String toString() {
		return "Oficina [codigo_oficina=" + codigo_oficina + ", ciudad=" + ciudad + ", pais=" + pais + ", region="
				+ region + ", codigo_postal=" + codigo_postal + ", telefono=" + telefono + ", linea_direccion1="
				+ linea_direccion1 + ", linea_direccion2=" + linea_direccion2 + "]";
	}
	
	
	
	
}
