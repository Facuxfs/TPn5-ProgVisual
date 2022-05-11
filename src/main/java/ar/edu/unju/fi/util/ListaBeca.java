package ar.edu.unju.fi.util;

import java.time.LocalDate;
import java.util.ArrayList;


import ar.edu.unju.fi.app.model.Beca;
import ar.edu.unju.fi.app.model.Curso;
import ar.edu.unju.fi.app.model.Docente;

public class ListaBeca {

	public ArrayList<Beca> listabecas;
	
	public ListaBeca() {
		listabecas = new ArrayList<Beca>();
		
		Beca unaBeca1 = new Beca((float) 2000.0,
				new Curso((float) 2.0, "Segundo", 1, LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 12), 8, true,
						new Docente(5050, "Simour", "Skiner", "simourskeaner@gmail", (float) 54154855)),
				LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 12), true);
		Beca unaBeca2 = new Beca((float) 2000.0,
				new Curso((float) 2.0, "Tercero", 1, LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 12), 8, true,
						new Docente(5050, "Edna", "Krabapel", "ednakrabapel@gmail", (float) 54789655)),
				LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 12), true);
		Beca unaBeca3 = new Beca((float) 2000.0,
				new Curso((float) 2.0, "Cuarto", 1, LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 12), 8, true,
						new Docente(5050, "Willy", "Conserje", "willyelconserje@gmail", (float) 54789625)),
				LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 12), true);
		
		
		listabecas.add(unaBeca1);
		listabecas.add(unaBeca2);
		listabecas.add(unaBeca3);
		
	}

	public ArrayList<Beca> getListabecas() {
		return listabecas;
	}

	public void setListabecas(ArrayList<Beca> listabecas) {
		this.listabecas = listabecas;
	}
	
	


}
