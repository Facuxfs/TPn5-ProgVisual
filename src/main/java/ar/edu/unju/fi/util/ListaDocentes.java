package ar.edu.unju.fi.util;

import java.util.ArrayList;

import ar.edu.unju.fi.app.model.Docente;

public class ListaDocentes {
	
	public ArrayList<Docente> listaDocente;
	
	public ListaDocentes() {
		listaDocente = new ArrayList<Docente>();
		
		Docente docente1 = new Docente(8555, "Symour", "Skeaner", "symourskeaner@gmail", (float) 7842112);
		Docente docente2 = new Docente(8745, "Edna", "Krabapel", "ednakrabapel@gmail", (float) 7832302);
		Docente docente3 = new Docente(8005, "Señorita", "Hoover", "señoritahoover@gmail", (float) 7878459);
		
		listaDocente.add(docente1);
		listaDocente.add(docente2);
		listaDocente.add(docente3);
	}

	public ArrayList<Docente> getListaDocente() {
		return listaDocente;
	}

	public void setListaDocente(ArrayList<Docente> listaDocente) {
		this.listaDocente = listaDocente;
	}
	
	

}
