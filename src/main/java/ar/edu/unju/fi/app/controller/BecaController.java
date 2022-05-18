package ar.edu.unju.fi.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import ar.edu.unju.fi.app.model.Beca;

import ar.edu.unju.fi.util.ListaBeca;


@Controller
@RequestMapping("/becas")
public class BecaController {
				
			@GetMapping("/listabecas")
			public ModelAndView getListadoDocentesPage() {
				ModelAndView mav = new ModelAndView("listaBecas");
				ListaBeca unaListabecas = new ListaBeca();
				mav.addObject("becas", unaListabecas.getListabecas());
				return mav;
			}

			
			@GetMapping("/nuevo")
			public String getFormNuevoAlumnnoPage(Model model) {
				model.addAttribute("beca", new Beca());
				return "nuevoalumno";
			}
			
			
			@PostMapping("/guardar")
			public ModelAndView getListaAlumnosPage(@ModelAttribute("beca")Beca beca) {
				ModelAndView mav = new ModelAndView("listaBecas");
				
				ListaBeca unaListabecas = new ListaBeca();

				if(unaListabecas.getListabecas().add(beca)) {
				}
				
				mav.addObject("becas", unaListabecas.getListabecas());
				return mav;
			}
			
	}

