package ar.edu.unju.fi.app.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Docente {
	
@Min(value=1000, message="legajo invalido")
 private Integer legajo;
@Size(min=3, max=20 , message="Nombre formato incorrecto")
@NotEmpty(message="Debe ingresar un nombre")
 private String nombre;
@NotEmpty(message="Debe ingresar un apellido")
 private String apellido;
@NotEmpty @Email
 private String email;
@NotNull(message = "Ingrese numero telefonico")
 private Float telefono;
 
public Integer getLegajo() {
	return legajo;
}
public void setLegajo(Integer legajo) {
	this.legajo = legajo;
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
	return "Docente [legajo=" + legajo + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
			+ ", telefono=" + telefono + "]";
}
public Docente(Integer legajo, String nombre, String apellido, String email, Float telefono) {
	super();
	this.legajo = legajo;
	this.nombre = nombre;
	this.apellido = apellido;
	this.email = email;
	this.telefono = telefono;
}
public Docente() {
	super();
	// TODO Auto-generated constructor stub
}
 
}
