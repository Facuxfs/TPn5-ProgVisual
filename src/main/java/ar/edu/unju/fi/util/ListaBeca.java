package ar.edu.unju.fi.util;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ar.edu.unju.fi.app.model.Alumno;
import ar.edu.unju.fi.app.model.Beca;
import ar.edu.unju.fi.app.model.Curso;
import ar.edu.unju.fi.app.model.Docente;

public class ListaBeca {


	ArrayList<Alumno> ListaBeca = new ArrayList<Alumno>();
	
	public ArrayList<Beca> generarBecas() {

		ArrayList<Beca> ListaBeca = new ArrayList<Beca>();

		Beca unaBeca1 = new Beca((float) 2000.0,
				new Curso((float) 2.0, "Segundo", 1, LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 12), 8, true,
						new Docente(5050, "Simour", "Skiner", "simourskeaner@gmail", (float) 54154855)),
				LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 12), true);

		ListaBeca.add(unaBeca1);

		return ListaBeca;
	}
	
	public ArrayList<Alumno> generarAlumno(	ArrayList<Alumno> ListaBeca ){
		Alumno unAlumno1 = new Alumno(299, "facu", "xfs", "facuxfs", (float) 155);

		Alumno unAlumno2 = new Alumno(309, "sol", "xfs", "solxfs", (float) 175);
		
		ListaBeca.add(unAlumno1);
		ListaBeca.add(unAlumno2);
		return ListaBeca;
	}
	
	@GetMapping("/inicio")
	public String mostrarBecas(Model model) {
		
		generarAlumno(ListaBeca);
		System.out.println(ListaBeca.toString());
		model.addAttribute("listabecas", ListaBeca);
		
		return "listabecas";
		
		
	}

}
