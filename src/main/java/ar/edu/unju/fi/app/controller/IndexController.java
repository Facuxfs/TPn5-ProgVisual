package ar.edu.unju.fi.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	
	@GetMapping("/inicio")
	public String getIndexPagina(Model model) {

		System.out.println("llega");
		return "inicio";
	}

}
