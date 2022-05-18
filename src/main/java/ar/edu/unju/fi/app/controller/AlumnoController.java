package ar.edu.unju.fi.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.app.model.Alumno;

import ar.edu.unju.fi.util.ListaAlumnos;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	@GetMapping("/listaAlumnos")
	public ModelAndView getListadoDocentesPage() {
		ModelAndView mav = new ModelAndView("listaAlumnos");
		ListaAlumnos listaAlumnos = new ListaAlumnos();
		mav.addObject("alumnos", listaAlumnos.getListaAlumnos());
		
		return mav;
	}
	
	@GetMapping("/nuevo")
	public String getFormNuevoAlumnnoPage(Model model) {
		model.addAttribute("alumno", new Alumno());
		return "nuevoalumno";
	}
	
	
	@PostMapping("/guardar")
	public ModelAndView getListaAlumnosPage(@ModelAttribute("alumno")Alumno alumno) {
		ModelAndView mav = new ModelAndView("listaAlumnos");
		
		ListaAlumnos listaAlumnos = new ListaAlumnos();

		if(listaAlumnos.getListaAlumnos().add(alumno)) {
			
		}
		
		mav.addObject("alumnos", listaAlumnos.getListaAlumnos());
		return mav;
	}
	

}
