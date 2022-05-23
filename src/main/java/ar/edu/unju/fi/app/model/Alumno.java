package ar.edu.unju.fi.app.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Alumno {
	
	@Min(value=1000000, message="DNI invalido")
	private Integer dni;
	@Size(min=3, max=20 , message="Nombre formato incorrecto")
	@NotEmpty(message="Debe ingresar un nombre")
	private String nombre;
	@NotEmpty(message="Debe ingresar un apellido")
	private String apellido;
	@NotEmpty @Email
	private String email;
	@NotNull(message = "Ingrese numero telefonico")
	private int telefono;
	
	
	
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", telefono=" + telefono + "]";
	}
	public Alumno(Integer dni, String nombre, String apellido, String email, int telefono) {
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
