package ar.edu.unju.fi.util;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.app.model.Carta;


public class ListaCartas {
	
	public List<Carta> listaCartas ;
	
	
	
	public ListaCartas() {
	
		listaCartas = new ArrayList<>();
		
		listaCartas.add(new Carta(1,"Descripción de un bootcamp para el desarrollo de BD Relacionales","imagen1.jpg",LocalDate.now(),"Curso BD Relacionales"));
		listaCartas.add(new Carta(2,"Descripción de un bootcamp para el desarrollo de Aplicaciones web con Spring Boot","imagen1.jpg",LocalDate.now(),"Curso Spring Boot"));
		listaCartas.add(new Carta(3,"Descripción de un bootcamp para el desarrollo de Videojuegos con Unity","imagen1.jpg",LocalDate.now(),"Curso Unity 3D"));
		
	
	}

	public List<Carta> getListaCartas() {
		return listaCartas;
	}

	public void setListaCartas(List<Carta> listaCartas) {
		this.listaCartas = listaCartas;
	}

	@Override
	public String toString() {
		return "ListaCartas [listaCartas=" + listaCartas + "]";
	}
	

	
}
