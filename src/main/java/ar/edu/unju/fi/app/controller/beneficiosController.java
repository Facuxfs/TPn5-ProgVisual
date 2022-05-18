package ar.edu.unju.fi.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class beneficiosController {

	

	@GetMapping("/beneficios")
	public String getIndexPagina() {
		
		return "beneficios";
	}


}
