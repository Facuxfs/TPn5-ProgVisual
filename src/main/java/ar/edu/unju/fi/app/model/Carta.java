package ar.edu.unju.fi.app.model;

import java.time.LocalDate;

public class Carta {
	
	private int id;
	private String descripcion;
	private String uriImagen;
	private LocalDate fecha;
	private String titulo;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUriImagen() {
		return uriImagen;
	}
	public void setUriImagen(String uriImagen) {
		this.uriImagen = uriImagen;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Carta() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carta(int id, String descripcion, String uriImagen, LocalDate fecha, String titulo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.uriImagen = uriImagen;
		this.fecha = fecha;
		this.titulo = titulo;
	}
	
	
}
