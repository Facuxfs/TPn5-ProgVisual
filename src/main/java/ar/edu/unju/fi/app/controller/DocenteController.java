package ar.edu.unju.fi.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.app.model.Docente;
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
		
		
		@GetMapping("/nuevo")
		public String getFormNuevoAlumnnoPage(Model model) {
			model.addAttribute("docente", new Docente());
			return "nuevodocente";
		}
		
		
		@PostMapping("/guardar")
		public ModelAndView getListaAlumnosPage(@Validated @ModelAttribute("docente") Docente docente,
				BindingResult bindingResult) {
			if (bindingResult.hasErrors()) {
				ModelAndView mav = new ModelAndView("nuevodocente");
				mav.addObject("docente", docente);
				return mav;
			}
			ModelAndView mav = new ModelAndView("listaDocentes");
			ListaDocentes listaDocentes = new ListaDocentes();
			if (listaDocentes.getListaDocente().add(docente)) {
			}
			mav.addObject("docentes", listaDocentes.getListaDocente());
			return mav;
		}

	}
