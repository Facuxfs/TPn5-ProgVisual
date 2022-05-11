package ar.edu.unju.fi.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.util.ListaDocentes;
@Controller
@RequestMapping("/docente")

public class DocenteController {
			
		@GetMapping("/listaDocentes")
		public ModelAndView getListadoDocentesPage() {
			ModelAndView mav = new ModelAndView("listaDocentes");
			ListaDocentes listaDocentes = new ListaDocentes();
			mav.addObject("docentes", listaDocentes.getListaDocente());
			return mav;
		}

}

