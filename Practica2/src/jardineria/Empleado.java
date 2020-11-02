package jardineria;

public class Empleado {
	
	private Long codigo_empleado = null;
	private String nombre;
	private String  apellido1; 
	private String apellido2;
	private String  extension; 
	private String  email; 	
	private String  puesto;
	private int  codigo_oficina; 
	private int  codigo_jefe;
	
	public Empleado(String nombre, String apellido1, String apellido2, String extension, String email, String puesto,
			int codigo_oficina, int codigo_jefe) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.extension = extension;
		this.email = email;
		this.puesto = puesto;
		this.codigo_oficina = codigo_oficina;
		this.codigo_jefe = codigo_jefe;
	}

	public Long getCodigo_empleado() {
		return codigo_empleado;
	}

	public void setCodigo_empleado(Long codigo_empleado) {
		this.codigo_empleado = codigo_empleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getCodigo_oficina() {
		return codigo_oficina;
	}

	public void setCodigo_oficina(int codigo_oficina) {
		this.codigo_oficina = codigo_oficina;
	}

	public int getCodigo_jefe() {
		return codigo_jefe;
	}

	public void setCodigo_jefe(int codigo_jefe) {
		this.codigo_jefe = codigo_jefe;
	}

	@Override
	public String toString() {
		return "Empleado [codigo_empleado=" + codigo_empleado + ", nombre=" + nombre + ", apellido1=" + apellido1
				+ ", apellido2=" + apellido2 + ", extension=" + extension + ", email=" + email + ", puesto=" + puesto
				+ ", codigo_oficina=" + codigo_oficina + ", codigo_jefe=" + codigo_jefe + "]";
	}
	
	
	
	

}
