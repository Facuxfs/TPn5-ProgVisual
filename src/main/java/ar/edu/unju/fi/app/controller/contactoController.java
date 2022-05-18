package ar.edu.unju.fi.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class contactoController {
	
	
	@GetMapping("/contacto")
	public String getIndexPagina() {
		
		return "contacto";
	}


}
