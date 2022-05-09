package ar.edu.unju.fi.app.model;

import java.time.LocalDate;

public class Beca {
private Float codigo;
private Curso curso;
private LocalDate fechaInicio;
private LocalDate fechaCierre;
private Boolean estado;


public Float getCodigo() {
	return codigo;
}
public void setCodigo(Float codigo) {
	this.codigo = codigo;
}
public Curso getCurso() {
	return curso;
}
public void setCurso(Curso curso) {
	this.curso = curso;
}
public LocalDate getFechaInicio() {
	return fechaInicio;
}
public void setFechaInicio(LocalDate fechaInicio) {
	this.fechaInicio = fechaInicio;
}
public LocalDate getFechaCierre() {
	return fechaCierre;
}
public void setFechaCierre(LocalDate fechaCierre) {
	this.fechaCierre = fechaCierre;
}
public Boolean getEstado() {
	return estado;
}
public void setEstado(Boolean estado) {
	this.estado = estado;
}
@Override
public String toString() {
	return "Beca [codigo=" + codigo + ", curso=" + curso + ", fechaInicio=" + fechaInicio + ", fechaCierre="
			+ fechaCierre + ", estado=" + estado + "]";
}
public Beca(Float codigo, Curso curso, LocalDate fechaInicio, LocalDate fechaCierre, Boolean estado) {
	super();
	this.codigo = codigo;
	this.curso = curso;
	this.fechaInicio = fechaInicio;
	this.fechaCierre = fechaCierre;
	this.estado = estado;
}
public Beca() {
	super();
	// TODO Auto-generated constructor stub
}



}
