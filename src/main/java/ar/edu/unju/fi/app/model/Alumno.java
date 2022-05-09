package ar.edu.unju.fi.app.model;

public class Alumno {
	private Integer dni;
	private String nombre;
	private String apellido;
	private String email;
	private Float telefono;
	
	
	
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Float getTelefono() {
		return telefono;
	}
	public void setTelefono(Float telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", telefono=" + telefono + "]";
	}
	public Alumno(Integer dni, String nombre, String apellido, String email, Float telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
