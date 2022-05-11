package ar.edu.unju.fi.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ar.edu.unju.fi.util.ListaBeca;

@Controller
public class IndexController {
	
	
	@GetMapping("/inicio")
	public String getIndexPagina(Model model) {
		ListaBeca unaListabecas = new ListaBeca();
		model.addAttribute("becas", unaListabecas.getListabecas());
		return "inicio";
	}

}
