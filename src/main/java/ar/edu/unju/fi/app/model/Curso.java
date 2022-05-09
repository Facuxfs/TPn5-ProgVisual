package ar.edu.unju.fi.app.model;

import java.time.LocalDate;

public class Curso {
	private Float codigo;
	private String titulo;
	private Integer categoria;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	private Integer cantidadHoras;
	private Boolean modalidad;
	private Docente docente;
	
	public Float getCodigo() {
		return codigo;
	}
	public void setCodigo(Float codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getCategoria() {
		return categoria;
	}
	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Integer getCantidadHoras() {
		return cantidadHoras;
	}
	public void setCantidadHoras(Integer cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}
	public Boolean getModalidad() {
		return modalidad;
	}
	public void setModalidad(Boolean modalidad) {
		this.modalidad = modalidad;
	}
	public Docente getDocente() {
		return docente;
	}
	public void setDocente(Docente docente) {
		this.docente = docente;
	}
	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", titulo=" + titulo + ", categoria=" + categoria + ", fechaInicio="
				+ fechaInicio + ", fechaFin=" + fechaFin + ", cantidadHoras=" + cantidadHoras + ", modalidad="
				+ modalidad + ", docente=" + docente + "]";
	}
	public Curso(Float codigo, String titulo, Integer categoria, LocalDate fechaInicio, LocalDate fechaFin,
			Integer cantidadHoras, Boolean modalidad, Docente docente) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.categoria = categoria;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.cantidadHoras = cantidadHoras;
		this.modalidad = modalidad;
		this.docente = docente;
	}
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
