package ar.edu.unju.fi.util;

import java.util.ArrayList;

import ar.edu.unju.fi.app.model.Alumno;

public class ListaAlumnos {
	
	public ArrayList<Alumno> listaAlumnos;

	
	public ListaAlumnos() {
		
		listaAlumnos = new ArrayList<Alumno>();
		
		Alumno alumno1 = new Alumno(1234, "facu", "xfs", "facuxfs@gmail.com",  87887);
		Alumno alumno2 = new Alumno(7824, "sol", "xfs", "solxfs@gmail.com",  78787);
		Alumno alumno3 = new Alumno(1004, "ro", "gump", "rogump@gmail.com",  77701);
		
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
	}


	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}


	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}
	
	
}